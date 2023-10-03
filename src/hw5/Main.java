package hw5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList(
                "window",
                "apple",
                "pen",
                "notebook"
        );

//        List<String> collect = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        List<String> collect = strings.stream().sorted(String::compareTo).toList();

        System.out.println(collect);

        List<String> list = strings.stream().filter(a -> a.length() >= 4).toList();
        System.out.println(list);

        List<Integer> numbers = Arrays.asList(2, 3, 5, 33, 4, 5, 6, 76, 60, 10, 3, 6, 8, 9);

        List<Integer> sorted = numbers.stream().sorted().toList();

        System.out.println(sorted);

        List<Integer> list1 = numbers.stream().filter(a -> a % 3 == 0).toList();

        System.out.println(list1);

        List<Integer> list2 = numbers.stream().filter(a -> a % 10 == 0).toList();
        System.out.println(list2);

//        numbers.stream().forEach(a-> System.out.println(a));
        numbers.stream().forEach(System.out::println);

        List<Integer> list3 = numbers.stream().map(a -> a * 3).toList();
        System.out.println(list3);
    }


}
