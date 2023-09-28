package hw4.task3;

import java.util.Objects;

public class Pet {
    private int id;
    private Animal animalType;
    private String name;

    public Pet() {
    }

    public Pet(int id, Animal animalType, String name) {
        this.id = id;
        this.animalType = animalType;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Animal getAnimalType() {
        return animalType;
    }

    public void setAnimalType(Animal animalType) {
        this.animalType = animalType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pet pet = (Pet) o;
        return getId() == pet.getId() && getAnimalType() == pet.getAnimalType() && Objects.equals(getName(), pet.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getAnimalType(), getName());
    }

    @Override
    public String toString() {
        return "Pet{" +
                "id=" + id +
                ", animalType=" + animalType +
                ", name='" + name + '\'' +
                '}';
    }
}
