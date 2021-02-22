package exam03retake01;

public class CdvCheck {

    public void validator(String s) {
        String format = "0123456789";
        for (char c: s.toCharArray()) {
            if (format.indexOf(c) < 0 || s.length() !=10) {
                throw new IllegalArgumentException("Wrong numbers!");
            }
        }
    }

    public int numsOfs(String[] sToNum) {
        int s = 0;
        for (int i = 1; i <= 9; i++) {
            int x = Integer.parseInt(sToNum[i - 1]);
            x *= i;
            s += x;
        }
        return s;
    }

    public boolean check(String s) {
        validator(s);
        String[] sToNum = s.split("");
        int sum  = numsOfs(sToNum);
        int last = sum % 11;
        return last == Integer.parseInt(sToNum[9]);
    }


}
