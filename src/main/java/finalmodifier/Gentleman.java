package finalmodifier;

public class Gentleman {

    public static final String  MESSAGE_PREFIX = "Helló ";

    /*public Gentleman gentleman =new Gentleman();{
         this.name = name;
    } */


    public void sayHello(String name) {
        System.out.println(MESSAGE_PREFIX + name);
    }

    public static void main(String[] args) {

        Gentleman gentleman = new Gentleman();

        //System.out.println(Gentleman.sayHello("Laci"));



    }
}
