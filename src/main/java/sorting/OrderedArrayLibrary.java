package sorting;

import java.util.Arrays;
import java.util.Comparator;

public class OrderedArrayLibrary {

    private Book[] bookArray;

    public OrderedArrayLibrary(Book[] bookArray) {
        this.bookArray = bookArray;
    }

    public Book[] sortingById() {
        Book[] b = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, b, 0, bookArray.length);
        Arrays.sort(b);
        return b;
    }

    public Book[] sortingByTitle() {
        Comparator<Book> compareTitle = new Comparator<Book>() {
            public int compare(Book o1, Book o2) {
                return o1.getTitle().compareTo(o2.getTitle());
            }
        };
        Book[] bs = new Book[bookArray.length];
        System.arraycopy(bookArray, 0, bs, 0 ,bookArray.length);
        Arrays.sort(bs, compareTitle);
        return bs;
    }
}
