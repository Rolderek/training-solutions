package typeconversion.dataloss;

public class DataLoss {

    public static final int MAX_NUMBER_OF_LOSS = 3;

    public void dataLoss() {
        long szam = 0 ;
        for (long szamolando = 0; szamolando < MAX_NUMBER_OF_LOSS;) {
            long kiirando = (long) (float) szamolando;
            if (kiirando != szamolando) {
                System.out.println(szamolando + " " + Long.toBinaryString(szamolando));
                System.out.println(kiirando + " " + Long.toBinaryString(kiirando));
                kiirando++;
            }
            szamolando++;
        }

    }

    public static void main(String[] args) {
        new DataLoss().dataLoss();
    }

}
