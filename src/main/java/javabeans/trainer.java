package javabeans;

public class trainer {

    private String name;
    private boolean active;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isActive() { //itt nulla az értéke azért is a prefix-e
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }


}
