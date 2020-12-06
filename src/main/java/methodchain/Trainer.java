package methodchain;

public class Trainer {

    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public Trainer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    /*public Trainer setName(String name) {
        this.name = name;
        return this;
    }

     */

    public int getAge() {
        return age;
    }

    /*public Trainer setAge(int age) {
        this.age = age;
        return this;
    }
    /*
     */
}
