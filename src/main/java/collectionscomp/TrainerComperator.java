package collectionscomp;

public class TrainerComperator implements Comparable<TrainerComperator> {
//hogy implementálhassa felül kell írni a compareTo-t
    public String name;
    public int salary;
    //a feladatban public a láthatóságuk


    public TrainerComperator(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    //ezt át kell variálni hogy mi szerint rendezze be (-1, 0, 1)
    public int compareTo(TrainerComperator o) {
        return this.name.compareTo(o.name);
        //return this.salary - o.salary;
    }

    //hogy látható legyen ezt is implementáljuk felülírva
    @Override
    public String toString() {
        return "TrainerComperator{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }
}
