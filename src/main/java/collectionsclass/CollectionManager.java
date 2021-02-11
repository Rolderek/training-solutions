package collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class CollectionManager {

    private List<Book> library;

    public CollectionManager(List<Book> library) {
        this.library = library;
    }

    public List<Book> createUnmodifiableLibrary() {
        List<Book> unmodifiableLibrary = Collections.unmodifiableList(library);
        return unmodifiableLibrary;
    }





    /*
    public static void main(String[] args) {
        Book b1 = new Book(741, "Alma", "Anna");
        Book b2 = new Book(852, "Körte", "Konrád");
        Book b3 = new Book(963, "Barack", "László");
        Book b4 = new Book(159, "Ananász", "Dávid");
        List<Book> books = new ArrayList<>();
        books.add(b1);
        books.add(b2);
        books.add(b3);
        books.add(b4);
        CollectionManager cm = new CollectionManager(books);
        System.out.println(cm.createUnmodifiableLibrary(books).add(new Book(863, "Valami", "hiba legyen")));
    }

     */
}
