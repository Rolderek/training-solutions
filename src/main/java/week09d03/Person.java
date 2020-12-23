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
        Random random = new Random();
        if (age>14) { //0,1,2,3
            int index = random.nextInt(Present.values().length-1) +1;
            present = Present.values()[index];
        } else {
            present = Present.values()[random.nextInt(Present.values().length)];
        }
      return present;
    }

    public String getName() {
        return name;
    }

    public Present getPresent() {
        return present;
    }

    public int getAge() {
        return age;
    }
}
