package hw2.task2;

public class Comics extends Book{
    private String genre;

    public Comics() {
    }

    public Comics(int size, int pages, String genre) {
        super(size, pages);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "genre='" + genre + '\'' +
                "} " + super.toString();
    }
}
