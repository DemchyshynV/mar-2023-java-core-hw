package hw5.autopark;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", 200, new Owner("Max", 15, 3), 2000, 2000),
                new Car("AUDI", 250, new Owner("Kiri", 20, 5), 6000, 2003),
                new Car("KIA", 180, new Owner("Olha", 35, 8), 9000, 2023),
                new Car("OKA", 100, new Owner("Kokos", 50, 1), 100, 1990)
        );

//        for (int i = 0; i < cars.size()/2; i++) {
//            Car car = cars.get(i);
//            car.setPower(car.getPower()+car.getPower()*0.1);
//        }

        cars.stream().filter(car -> cars.indexOf(car)<cars.size()/2).forEach(car -> car.setPower(car.getPower()+car.getPower()*0.1));

        System.out.println(cars);

        cars.stream().filter(car -> car.getOwner().getAge()>25&&car.getOwner().getExp()<5).forEach(car -> car.getOwner().setExp(car.getOwner().getExp()+1));

        System.out.println(cars);

//        Integer sum = cars.stream().map(car -> car.getPrice()).reduce(0, (a, b) -> a + b);
        Integer sum = cars.stream().map(Car::getPrice).reduce(0, Integer::sum);

        System.out.println(sum);
    }

}
