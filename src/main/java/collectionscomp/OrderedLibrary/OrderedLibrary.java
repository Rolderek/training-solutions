package collectionscomp.OrderedLibrary;

import java.util.*;

public class OrderedLibrary {

    private List<Book> b = new ArrayList<>();

    public OrderedLibrary(List<Book> b) {
        this.b = b;
    }

    public List<Book> getB() {
        return b;
    }

    public List<Book> orderedByTitle() {
        Collections.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        });
        return b;
    }

    public List<Book> orderedByAuthor() {
        Collections.sort(b, new Comparator<Book>() {
            @Override
            public int compare(Book o1, Book o2) {
                return o1.getAuthor().compareTo(o2.getAuthor());
            }
        });
        return b;
    }

    /*
    ezt meg kell még csinálni!!!!
    public List<String> orderedByTitleLocale(Locale locale) {

    }

     */

    public static void main(String[] args) {

        List<Book> books = new ArrayList<>();
        books.add(new Book(741852, "Star Wars", "George Lucas"));
        books.add(new Book(963852, "Land to the moon", "Buzz Aldrin"));
        books.add(new Book(147258, "Apollo space program", "NASA"));

        OrderedLibrary ol = new OrderedLibrary(books);
        System.out.println(ol.orderedByTitle());
        System.out.println(ol.orderedByAuthor());
    }
}

/*
new Book(741852, "Star Wars", "George Lucas"),
new Book(963852, "Land to the moon", "Buzz Aldrin"),
new Book(147258, "Apollo space program", "NASA")
 */
