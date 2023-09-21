package hw2.task1;

public enum Video {
    AMD("AMD"),
    NVIDIA("NVIDIA");

    private final String brand;

    Video(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    @Override
    public String toString() {
        return "Video{" +
                "brand='" + brand + '\'' +
                "} " + super.toString();
    }
}
