package defaultconstructor;

public class Trainer {

    private String name;

    public Trainer(String name) {
        this.name = name; //ez a konstruktor paramétert vár az előző nem várt!
    }

    public String getName() {
        return name;
    }
}
