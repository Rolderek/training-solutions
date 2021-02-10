package searching;

public class BookArraySearch {

    private Book[] bookArray;


    public BookArraySearch(Book[] bookArray) {
        this.bookArray = bookArray;
    }


    public Book findBookByAuthorTitle(String author, String title) {
        if (author.isEmpty() || title.isEmpty()) {
            throw new IllegalArgumentException("Empty author or title!");
        }
        Book theOne = new Book(0, "", "");
        for (int i = 0; i < bookArray.length; i++) {
            if (author.equals(bookArray[i].getAuthor()) || title.equals(bookArray[i].getTitle())) {
                theOne.setId(bookArray[i].getId());
                theOne.setTitle(bookArray[i].getTitle());
                theOne.setAuthor(bookArray[i].getAuthor());
            }
        }
        return theOne;
    }



    public static void main(String[] args) {
        Book b1 = new Book(741, "Altatók", "Lajhár");
        Book b2 = new Book(852, "Állatos mesék", "Halász Judit");
        Book b3 = new Book(963, "Kifestő könyv", "Mikorka Kálmán");
        Book[] boook = new Book[]{b1, b2, b3};

        BookArraySearch bas = new BookArraySearch(boook);

        System.out.println(bas.findBookByAuthorTitle("Halász Judit", "Állat mesék").toString());
    }
}
