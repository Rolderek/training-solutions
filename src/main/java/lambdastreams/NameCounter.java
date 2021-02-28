package lambdastreams;

public class NameCounter {

    private int threePartNeme = 0;
    private int twoPartName = 0;

    public NameCounter(int threePartNeme, int twoPartName) {
        this.threePartNeme = threePartNeme;
        this.twoPartName = twoPartName;
    }

    public NameCounter() {
    }

    public NameCounter add(Employee employee) {
        if (employee.getName().split(" ").length == 2) {
            return new NameCounter(threePartNeme, twoPartName + 1);
        }
        else {
            return new NameCounter(threePartNeme + 1, twoPartName);
        }
    }

    public NameCounter add(NameCounter other) {
        return new NameCounter(threePartNeme + other.threePartNeme, twoPartName + other.twoPartName);
    }

    public int getThreePartNeme() {
        return threePartNeme;
    }

    public int getTwoPartName() {
        return twoPartName;
    }
}
