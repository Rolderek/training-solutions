package interfacerules;

import introheritance.Employee;

public class TrainerMain {

    public static void main(String[] args) {

        HasName hasname = new Trainer();
        hasname.getName();

        CanWork canwork = new Trainer();
        canwork.doWork();

        System.out.println(EmployeeType.FULL_TIME);
        //itt kiírja hogy mi a helyzet de ezek helyett inkább enumokat használjunk!
    }
}
