package hw4.task3;

import java.util.*;

public class ZooClub {
    private final Map<Person, List<Pet>> club = new HashMap<>();

    private String _inputString() {
        return new Scanner(System.in).nextLine();
    }

    private int _inputInt() {
        return new Scanner(System.in).nextInt();
    }

    private Map.Entry<Person, List<Pet>> _entryByPersonId() {
        int personId = this._inputInt();
        return this.club.entrySet().stream().filter(item -> item.getKey().getId() == personId).findFirst().orElse(null);
    }

    private void addPerson() {
        System.out.println("--------------------------------------------------------------");
        Integer id = this.club
                .keySet()
                .stream()
                .max(Comparator.comparingInt(Person::getId))
                .map(person -> person.getId() + 1)
                .orElse(1);
        System.out.print("Enter name: ");
        String name = this._inputString();
        this.club.put(new Person(id, name), new ArrayList<>());

        System.out.println("--------------------------------------------------------------");
    }

    private boolean showAll() {

        if (this.club.isEmpty()) {
            return false;
        }

        System.out.println("--------------------------------------------------------------");
        this.club.forEach(((person, pets) -> {
            System.out.println(person.getId() + ") " + person + " Pets: " + pets);
        }));

        System.out.println("--------------------------------------------------------------");
        return true;
    }

    private void addPet() {
        if (this.showAll()) {
            System.out.print("додати до: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

            if (personListEntry != null) {
                Animal[] animals = Animal.values();

                for (int i = 0; i < animals.length; i++) {
                    System.out.println(i + ") " + animals[i]);
                }

                System.out.print("Виберіть тип: ");
                int index = this._inputInt();

                System.out.print("Введіть ім'я: ");
                String name = this._inputString();

                int id = personListEntry
                        .getValue()
                        .stream()
                        .max(Comparator.comparingInt(Pet::getId))
                        .map(pet -> pet.getId() + 1)
                        .orElse(1);
                personListEntry.getValue().add(new Pet(id, animals[index], name));

            } else {
                System.out.println("--------------------------------------------------------------");
                System.out.println("Такого персона не знайдено!!!");
                System.out.println("--------------------------------------------------------------");
            }
        } else {
            System.out.println("--------------------------------------------------------------");
            System.out.println("клую порожний");
            System.out.println("--------------------------------------------------------------");
        }
    }

    private void deletePet() {
        if (this.showAll()) {
            System.out.print("Видалити з якого власника: ");
            Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

            if (personListEntry == null) {
                System.out.println("Такого персона не існує");
                return;
            }

            personListEntry.getValue().forEach(pet -> {
                System.out.println(pet.getId() + ") " + pet);
            });

            System.out.print("Кого видалити: ");
            int id = this._inputInt();

            personListEntry.getValue().removeIf(pet -> pet.getId() == id);
        }
    }
    private void deletePerson(){
        if (!this.showAll()){
            return;
        }

        System.out.print("Кого видалити: ");
        Map.Entry<Person, List<Pet>> personListEntry = this._entryByPersonId();

        if (personListEntry == null){
            return;
        }

        this.club.remove(personListEntry.getKey());
    }

    private void deleteAnimalByType(){
        Animal[] animals = Animal.values();
        for (int i = 0; i < animals.length; i++) {
            System.out.println(i+") "+animals[i]);
        }

        System.out.print("Кого видалити: ");
        int index = this._inputInt();
        Animal animal = animals[index];
        this.club.values().forEach(pets -> pets.removeIf(pet -> pet.getAnimalType()==animal));
    }

    public void menu() {
        while (true) {
            System.out.println("1) додати учасника в клуб;");
            System.out.println("2) додати тваринку до учасника клубу.");
            System.out.println("3) видалити тваринку з власника.");
            System.out.println("4) видалити учасника клубу.");
            System.out.println("5) видалити конкретну тваринку з усіх власників.");
            System.out.println("6) вивести на екран зооклуб.");
            System.out.println("9) вихід");

            System.out.print("Зробіть свій вибір: ");

            String choice = this._inputString();

            switch (choice) {
                case "1":
                    this.addPerson();
                    break;
                case "2":
                    this.addPet();
                    break;
                case "3":
                    this.deletePet();
                    break;
                case "4":
                    this.deletePerson();
                    break;
                case "5":
                    this.deleteAnimalByType();
                    break;
                case "6":
                    this.showAll();
                    break;
                case "9":
                    return;
            }
        }
    }

}
