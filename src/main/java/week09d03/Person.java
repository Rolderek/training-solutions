package week09d03;

import java.util.Random;

public class Person {

    private String name;
    private int age;
    private Present present;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Present setPresent() {
        Present present = Present.values()[new Random().nextInt(4)];
        if (this.age > 14 && present == Present.TOY){
            throw new IllegalArgumentException("Nem lehet ajándékot adni neki, mivel már idős.");
        }
      return present;
    }
}
