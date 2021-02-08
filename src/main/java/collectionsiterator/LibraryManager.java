package collectionsiterator;

import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class LibraryManager {

    private Set<Book> libraryBooks;

    public LibraryManager(Set<Book> libraryBooks) {
        this.libraryBooks = libraryBooks;
    }


    public int libraryBooksCounter() {
        return libraryBooks.size();
    }

    public Book findBookByRegNumber(int regNumber) {
        Book theOneAndOnlyBook;
        Iterator<Book> i = libraryBooks.iterator();
        while (i.hasNext()) {
            theOneAndOnlyBook = i.next();
            if (theOneAndOnlyBook.getRegNumber() == regNumber) {
                return theOneAndOnlyBook;
            }
        }
        throw new MissingBookException("There is no book with this regnumber: " + regNumber);
    }

    public int removeBookByRegNumber(int regNumber) {
        Book theBookNextDoor;
        Iterator<Book> j = libraryBooks.iterator();
            while (j.hasNext()) {
                if (j.next().getRegNumber() == regNumber) {
                    j.remove();
                    return regNumber;
                }
            }
            throw new MissingBookException("There is no book with this regnumber: " + regNumber);
    }


    public Set<Book> selectBooksByAuthor(String author) {
        Set<Book> authorsBooks = new HashSet<>();
        Book thatBook;
        Iterator<Book> i = libraryBooks.iterator();
            while (i.hasNext()) {
                thatBook = i.next();
                if (thatBook.getAuthor().equals(author)) {
                    authorsBooks.add(thatBook);
                }
            }
            if (authorsBooks.isEmpty()) {
                throw new MissingBookException("Theres no book found by " + author);
            }
            return authorsBooks;
    }

}
