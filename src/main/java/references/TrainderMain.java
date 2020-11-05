package references;

public class TrainderMain {
    public static void main(String[] args) {
        int year = 1980;

        String name = "Jhon Doe";

        Trainer jhon = new Trainer("Jhon Doe", 1980);

        Trainer trainer = jhon;

        System.out.println(jhon == trainer);

        Trainer jhon2 = new Trainer("Jhon doe", 1980);

        System.out.println(trainer == jhon2);
        System.out.println(trainer.getName() == jhon.getName());
    }
}
