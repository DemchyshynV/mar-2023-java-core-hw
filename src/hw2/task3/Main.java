package hw2.task3;

public class Main {
    public static void main(String[] args) {
        User user = new User(1, "max", "kokos", "admin@gmail.com", 5, Gender.MALE, new Car("bmw", 2010, 200));

        user.getSkills().add(new Skill("js", 8));
        user.getSkills().add(new Skill("java", 9));
        user.getSkills().add(new Skill("python", 10));

        System.out.println(user);
    }
}
