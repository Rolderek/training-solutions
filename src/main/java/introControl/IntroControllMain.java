package introControl;

public class IntroControllMain {
    public static void main(String[] args) {
        IntroControl introControl = new IntroControl();
        System.out.println(introControl.substractTenIfGreaterThenTen(0));
        System.out.println(introControl.substractTenIfGreaterThenTen(10));
        System.out.println(introControl.substractTenIfGreaterThenTen(15));

        System.out.println(introControl.describeNumber(0));
        System.out.println(introControl.describeNumber(2));
        System.out.println(introControl.describeNumber(100));

        System.out.println(introControl.greetingToJoe("Joe"));
        System.out.println(introControl.greetingToJoe("Laci"));
        System.out.println(introControl.greetingToJoe(" "));






    }






}
