package finalmodifier;

public class Gentleman {

    private static final String  MESSAGE_PREFIX = "Helló ";
    private String name;
    public Gentleman gentleman =new Gentleman();{
         this.name = name;
    }


    public void sayHello(String name) {
        System.out.println(MESSAGE_PREFIX + name);
    }

    public static void main(String[] args) {

        Gentleman gentleman1 = new Gentleman();

        System.out.println(Gentleman.sayHello("Laci"));



    }
}
