package classstructureconstructors;

public class BookMain {

    public static void main(String[] args) {
        Book book = new Book("Ricsárd Gír", "A zenekar");

        book.register("1458");

        System.out.println("Szerző: " + book.getAuthor());
        System.out.println("Cím: " + book.getTitle());
        System.out.println("Regisztrációs szám: " + book.getRegNumber());
    }
}