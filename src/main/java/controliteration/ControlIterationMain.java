package controliteration;

public class ControlIterationMain {

        public void printNumbersWhile() {
           int count = 1;
           while (count < 3) {
               System.out.println("Count is: " + count);
               count++;
           }
        }

        public void printNumbersDOWhile() {
            int count = 1;
            do {
                System.out.println("Count is: " + count);
                count++;
            } while (count <3);
            }

            public void printNumbersFor() {
            for (int i = 0; i < 3; i++) {
                System.out.println(i);
            }
            }

            public void printItems() {
            String[] numbers = {"zero", "one", "two"};
            for (String number: numbers) {
                System.out.println(number);
            }
            }

    public static void main(String[] args) {
            //new ControlIterationMain().printNumbersWhile();
            //new ControlIterationMain().printNumbersDOWhile();
            //new ControlIterationMain().printNumbersFor();
            new ControlIterationMain().printItems();

    }
        }




