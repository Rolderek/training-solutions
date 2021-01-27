package genericsusage;

import java.util.ArrayList;
import java.util.List;

public class Library {

    public List books = new ArrayList<>();
    public List<String> theBooks = new ArrayList<>();


    public List getBooks() {
        return books;
    }

    public void addABook(String toAdd) {
         books.add(toAdd);
     }

     public String getFirstBook(List b) {
        if (books == null) {
            throw new NullPointerException("The list is null.");
        }
        if (books.isEmpty() == true) {
            throw new IllegalArgumentException("The list is empty.");
        }
         b = getBooks();
         String result = (String) b.get(0);
         return result;
     }

    public void addTheBooks (String a) {
        theBooks.add(a);
    }

    public String getFirstBookInTheBooks() {
        if (theBooks == null) {
            throw new NullPointerException("The list is null.");
        }
        if (theBooks.isEmpty() == true) {
            throw new IllegalArgumentException("The list is empty.");
        }
        String result = theBooks.get(0);
        return  result;
    }



}
