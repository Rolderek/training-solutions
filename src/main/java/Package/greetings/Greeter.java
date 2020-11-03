package Package.greetings;

public class Greeter {

    private String hw = "Hello World!";

    void sayHello() {
        System.out.println("hw!");
    }

    Greeter greeter = new Greeter(String hw) {

    };


}
