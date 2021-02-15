package exam03;

public class Passenger {

    private String name;
    private CruiseClass cruiseClass;

    public Passenger(String name, CruiseClass cruiseClass) {
        this.name = name;
        this.cruiseClass = cruiseClass;
    }

    public String getName() {
        return name;
    }

    public CruiseClass getCruiseClass() {
        return cruiseClass;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCruiseClass(CruiseClass cruiseClass) {
        this.cruiseClass = cruiseClass;
    }
}
