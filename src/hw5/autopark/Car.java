package hw5.autopark;

import java.util.Objects;

public class Car {
    private String brand;
    private double power;
    private Owner owner;
    private int price;
    private int year;

    public Car() {
    }

    public Car(String brand, double power, Owner owner, int price, int year) {
        this.brand = brand;
        this.power = power;
        this.owner = owner;
        this.price = price;
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Double.compare(getPower(), car.getPower()) == 0 && getPrice() == car.getPrice() && getYear() == car.getYear() && Objects.equals(getBrand(), car.getBrand()) && Objects.equals(getOwner(), car.getOwner());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPower(), getOwner(), getPrice(), getYear());
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", power=" + power +
                ", owner=" + owner +
                ", price=" + price +
                ", year=" + year +
                '}';
    }
}
