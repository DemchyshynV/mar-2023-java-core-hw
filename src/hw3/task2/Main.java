package hw3.task2;

public class Main {
    public static void main(String[] args) {
        Instrument[] instruments = {
                new Guitar(5),
                new Drum(25),
                new Trumpet(30)
        };
        for (Instrument instrument : instruments) {
            instrument.play();
        }
    }


}
