package hw2.task1;

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 16, 15, 2);
        System.out.println(laptop);
        UltraBook ultraBook = new UltraBook(12, 32, 21, 1, 1);
        System.out.println(ultraBook);
        WorkStation workStation = new WorkStation(32, 128, 25, 50, Video.NVIDIA);
        System.out.println(workStation);
    }
}
