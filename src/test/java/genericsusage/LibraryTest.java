package genericsusage;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void getFirstBookWithoutDiamondoperator() {
        List books = new ArrayList<>();
        books.add("Apacuka");
        books.add("Fundaluka");
        books.add("Fundakávé");
        books.add("Kamanduka");
        books.add("Apcukfundaluk");
        books.add("Fundakávékamaduk");

        Object c = books.get(0);

        assertEquals(c,"Apacuka");
    }

    @Test
    public void getFirstBookTest() {
        List<String> theBooks = new ArrayList<>();
        theBooks.add("Fundakávékamaduk");
        theBooks.add("Apcukfundaluk");
        theBooks.add("Kamanduka");

        assertEquals(theBooks.get(0), "Fundakávékamaduk");
    }

}