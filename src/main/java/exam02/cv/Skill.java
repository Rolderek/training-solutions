package exam02.cv;

public class Skill {

    private String name;
    private int level;

    public Skill(String name, int slevel) {
        this.name = name;
        this.level = slevel;
    }

    public String getName() {
        return name;
    }

    public int getLevel() {
        return level;
    }
}
