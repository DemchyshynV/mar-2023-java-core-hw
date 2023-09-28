package hw4.task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Max", 15),
                new User("Kamila", 10),
                new User("Natali", 18),
                new User("Karina", 20),
                new User("Yulia", 35)
        );

//        users.sort((a,b)->a.getAge()- b.getAge());
//        users.sort(Comparator.comparingInt(User::getAge));
//        System.out.println(users);
//        users.sort((a,b)->b.getAge()- a.getAge());
//        System.out.println(users);
//        System.out.println("---------------------------------------------------------");
////        users.sort((a,b)->a.getName().length()-b.getName().length());
//        users.sort(Comparator.comparingInt(a -> a.getName().length()));
//        System.out.println(users);
//        users.sort((a,b)->b.getName().length()-a.getName().length());
//        System.out.println(users);
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("mouse");
        words.add("window");
        words.add("hp");
        words.add("pen");
        words.add("bird");

//        words.sort((a,b)->a.compareTo(b));
        words.sort(String::compareTo);
        System.out.println(words);
    }


}
