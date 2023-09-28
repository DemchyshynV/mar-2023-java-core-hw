package hw4.task2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
//        HashSet<User> users = new HashSet<>();
//        users.add(new User(1,"Max"));
//        users.add(new User(2,"Karina"));
//        users.add(new User(3,"Olha"));
//
//        System.out.println(users);
        TreeSet<User> users = new TreeSet<>();
        users.add(new User(1, "Max", Arrays.asList(new Skill("js"), new Skill("Java"))));
        users.add(new User(2, "Oleh", Arrays.asList(new Skill("js"), new Skill("Java"), new Skill("python"))));
        users.add(new User(3, "Olha", Arrays.asList(new Skill("js"), new Skill("Java"), new Skill("python"),new Skill("html"))));
        users.add(new User(4, "Kokos", Arrays.asList(new Skill("js"))));

        System.out.println(users);
    }
}
