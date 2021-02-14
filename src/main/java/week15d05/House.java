package week15d05;

public class House {

    private String name;
    private int battle = 0;

    public House(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public int getBattle() {
        return battle;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBattle(int battle) {
        this.battle = battle;
    }
}



