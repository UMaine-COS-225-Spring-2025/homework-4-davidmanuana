public class Book {
    String title;
    String genre;

    public Book(String title, String genre) {
        this.title = title;
        this.genre = genre;
    }

    public String toString() {
        return title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String newTitle) {
        this.title = newTitle;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String newGenre) {
        this.genre = newGenre;
    }
}

