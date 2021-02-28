package lambdastreams;

public class NameCounterMod {

    private int threePartNeme = 0;
    private int twoPartName = 0;

    public NameCounterMod(int threePartNeme, int twoPartName) {
        this.threePartNeme = threePartNeme;
        this.twoPartName = twoPartName;
    }

    public NameCounterMod() {
    }

    public void add(Employee employee) {
        if (employee.getName().split(" ").length == 2) {
            twoPartName++;
        }
        else {
            threePartNeme++;
        }
    }

    public void add(NameCounterMod other) {
        this.twoPartName += other.twoPartName;
        this.threePartNeme += other.threePartNeme;
    }

    public int getThreePartNeme() {
        return threePartNeme;
    }

    public int getTwoPartName() {
        return twoPartName;
    }
}
