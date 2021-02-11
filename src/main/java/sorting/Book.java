package sorting;

public class Book {

    private int id;
    private String title;
    private String author;

    public Book(int id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int compareTo(Book o) {
        return this.getId() - o.getId();
    }

    @Override
    public String toString() {
        return id + " " + author + " " + title;
    }
}
