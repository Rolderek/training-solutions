package week11d01;

public class DivisorFinder {

    //Enikő megoldása  junor óráról
    public int findDivisiorJunior(int n) {
        n = Math.abs(n);
        int sum = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int x = Integer.parseInt(number.substring(i, i+1));
            //substring helyett number.charArray és tömb lesz belőle amin végig lehet menni
            if (n % x == 0) {
                sum++;
            }
        }
        return sum;
    }

    //Mid level órai megoldás:
    public int findDivisiorMedior(int n) {
        int result = 0;
        String number = Integer.toString(n);
        for (int i = 0; i < number.length(); i++) {
            int digit = Integer.parseInt(Character.toString(number.charAt(i)));
            if ( n % digit == 0) {
                result++;
            }
        }
        return result;
    }

    public int findDivisiorForEach(int n) {
        int result = 0;
        String number = Integer.toString(n);
        for (char c :number.toCharArray()) {
            int digit = Integer.parseInt(Character.toString(number.charAt(c)));
            if ( n % digit == 0) {
                result++;
            }
        }
        return result;
    }

}
