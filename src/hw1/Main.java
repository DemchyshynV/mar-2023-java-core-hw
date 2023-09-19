package hw1;

//Загальне: всі поля класу приватні, додати гетери сетери (не використовуючи ломбок)
//
//        - закінчити опис класів Car,Dog,Book (файли знаходяться в цій папці)
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/posts/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
//
//        - створити клас, який би описував подібні об'єкти
//        https://jsonplaceholder.typicode.com/comments/1
//        створити 5 об'єктів класу, покласти в маисв/ліст, проітерувати та вивести в консоль
public class Main {
    public static void main(String[] args) {
        Book[] books = new Book[]{
                new Book("book1", 200, new String[]{"author1", "author2"}, "horror"),
                new Book("book2", 200, new String[]{"author1", "author2"}, "horror"),
                new Book("book3", 200, new String[]{"author1", "author2"}, "horror"),
                new Book("book4", 200, new String[]{"author1", "author2"}, "horror"),
                new Book("book5", 200, new String[]{"author1", "author2"}, "horror"),
        };

        Car[] cars = new Car[]{
                new Car("Audi", 120, 1.6, true),
                new Car("BMW", 150, 2.6, true),
                new Car("Kia", 125, 2.0, false),
                new Car("OKA", 5, 0.5, true),
                new Car("LADA", 1, 0.1, false),
        };

        Dog[] dogs = new Dog[]{
                new Dog("max", 5, "retriever"),
                new Dog("Sharik", 3, "retriever"),
        };

        for (Book book : books) {
            System.out.println(book);
        }

        for (Car car : cars) {
            System.out.println(car);
        }
        for (Dog dog : dogs) {
            System.out.println(dog);
        }
        Post[] posts = new Post[]{
                new Post(1,2,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "sdfsfsdf"),
                new Post(2,3,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "sdfsfsdf"),
                new Post(3,4,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit", "sdfsfsdf"),
        };

        Comment[] comments = new Comment[]{
                new Comment(1,2,"my comment", "admin@gmail.com", "Blabla"),
                new Comment(2,6,"my comment", "admin@gmail.com", "Blabla"),
                new Comment(3,7,"my comment", "admin@gmail.com", "Blabla"),
        };

        for (Post post : posts) {
            System.out.println(post);
        }

        for (Comment comment : comments) {
            System.out.println(comment);
        }
    }
}