package training;

public class StringMethods {

    public static void main(String[] args) {
        String name = "Jhon Doe";
        //String uppercased = name.toUpperCase(); vagy
        name = name.toUpperCase();
        System.out.println(name);

        System.out.println("Jhon Doe".toUpperCase().substring(1, 4));

        String anotherName = null;
        System.out.println("Jhon".equals(anotherName));

        System.out.println(String.join("-", "Jhon", "Doe", "Jack", "Doe"));
    }
}
