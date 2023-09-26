package hw3.task1;

public class Magazine implements Printable {
    private String name;

    public Magazine() {
    }

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void print() {
        System.out.println("Magazine -- " + this.name);
    }
}
