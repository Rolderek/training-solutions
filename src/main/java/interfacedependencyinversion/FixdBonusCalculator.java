package interfacedependencyinversion;

public class FixdBonusCalculator implements  BonusCalculator{

    @Override
    public int calculateBonus(int salary) {
        return salary + 10000;
    }
}
