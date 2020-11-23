package schoolrecords;

import java.util.*;

public class SchoolRecordsController {

    public ClassRecords cr;

    public SchoolRecordsController(ClassRecords cr) {
        this.cr = cr;
    }

    public Scanner scanner = new Scanner(System.in);

    private List<Tutor> tutors = new ArrayList<>();

    private List<Subject> subjects = new ArrayList<>();

    public void initSchool() {
        Subject grammar = new Subject("nyelvtan");
        subjects.add(grammar);
        Subject math = new Subject("matematika");
        subjects.add(math);
        Subject english = new Subject("angol");
        subjects.add(english);
        Subject chemistry = new Subject("kémia");
        subjects.add(chemistry);
        Subject history = new Subject("történelem");
        subjects.add(history);

        Tutor nagyCsilla = new Tutor("Nagy CSilla", Arrays.asList(grammar));
        tutors.add(nagyCsilla);
        Tutor kisBéla = new Tutor("Kis Béla", Arrays.asList(math, english));
        tutors.add(kisBéla);
        Tutor balogKatalin = new Tutor("Balog Katalin", Arrays.asList(chemistry, history));
        tutors.add(balogKatalin);
    }

    public void startMenu() {
        System.out.println("1. Diákok nevének listázása\n" +
                "2. Diák név alapján keresése\n" +
                "3. Diák létrehozása\n" +
                "4. Diák név alapján törlése\n" +
                "5. Diák feleltetése\n" +
                "6. Osztályátlag kiszámolása\n" +
                "7. Tantárgyi átlag kiszámolása\n" +
                "8. Diákok átlagának megjelenítése\n" +
                "9. Diák átlagának kiírása\n" +
                "10. Diák tantárgyhoz tartozó átlagának kiírása\n" +
                "11. Kilépés\n" +
                "Add meg a menüpontot:");
    }

    public MarkType findMarkType(int sMark) {
        for (MarkType markType : MarkType.values()) {
            if (markType.getValue() == sMark) {
                return markType;
            }
        }
        return null;
    }

    public Subject sSubjectWorker() {

        System.out.println("Tantárgy neve: ");

        String selection = scanner.nextLine();
        Subject sSubject = null;
        for (int i = 0; i < subjects.size(); i++) {
            if (selection.toLowerCase().equals(subjects.get(i).getSubjectName().toLowerCase())) {
                sSubject = subjects.get(i);
            }
        }
        return sSubject;
    }


    public String sTeacherWorker() {
        System.out.println("Tanár neve: ");
        String selection = scanner.nextLine();
        String sTeacher = null;
        for (int i = 0; i < tutors.size(); i++) {
            if (selection.toLowerCase().equals(tutors.get(i).getName().toLowerCase())) {
                sTeacher = tutors.get(i).toString();
            }
        }
        return sTeacher;
    }


    public void runMenu() {
        startMenu();
        int menuPont;
        try {
            menuPont = Integer.parseInt(scanner.nextLine());
            if (menuPont == 1) {
                menu1();
            } else if (menuPont == 2) {
                menu2();
            } else if (menuPont == 3) {
                menu3();
            } else if (menuPont == 4) {
                menu4();
            } else if (menuPont == 5) {
                menu5();
            } else if (menuPont == 6) {
                menu6();
            } else if (menuPont == 7) {
                menu7();
            } else if (menuPont == 8) {
                menu8();
            } else if (menuPont == 9) {
                menu9();
            } else if (menuPont == 10) {
                menu10();
            } else if (menuPont == 11) {
                menu11();
                return;
            } else {
                System.out.println("Hibás menüválasztás, kérem próbálja újra.");
            }
        } catch (IllegalArgumentException iae) {
            System.out.println("Hiba történt próbálja újra " + iae.getMessage());
        }
        runMenu();
    }

    public void menu1() {
        try {
            System.out.println(cr.listStudentNames());

        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Nincs diák az osztályban, kérem válassza a hármas menüpontot.");
        }
    }

    public void menu2() {
        try {
            if (cr.listStudentNames() != null) {
                findStudent("keresendő");
            }
        } catch (StringIndexOutOfBoundsException sioobe) {
            System.out.println("Nincs diák az osztályban, kérem válassza a hármas menüpontot.");
        }
    }

    public void menu3() {
        System.out.println("Add meg a diák nevét:");
        try {
            cr.addStudent(new Student(scanner.nextLine()));
        } catch (IllegalArgumentException iae) {
            System.out.println("Hiba történt, próbálja újra! " + iae.getMessage());
        }
    }

    public void menu4() {
        try {
            System.out.println("Adja meg a törölni kívánt diák nevét:");
            Student student = cr.findStudentByName(scanner.nextLine());
            System.out.println(student);
            cr.removeStudent(student);
        } catch (IllegalArgumentException iae) {
            System.out.println("Nem található ilyen nevű tanuló az osztályban.");
        }
    }

    public void menu5() {
        try {
            Student whoRepetition = cr.repetition();
            System.out.println("Felel a következő diák: " + whoRepetition.getName());
            System.out.println("Kapott osztályzat: ");
            MarkType sMarkType = findMarkType(Integer.parseInt(scanner.nextLine()));
            if (sMarkType == null) {
                System.out.println("Hibás osztályzat, kérem javítsa!");
                sMarkType = findMarkType(Integer.parseInt(scanner.nextLine()));
            }
            Subject sSubject = sSubjectWorker();

            String sTeacher = sTeacherWorker();
            whoRepetition.grading(new Mark(sMarkType, sSubject, new Tutor(sTeacher, Arrays.asList(sSubject))));
            System.out.println("Felelet rögzítve: " + whoRepetition.getName() + " nevű diák "
                    + sSubject.getSubjectName() + " tantárgyból "
                    + sTeacher + " tanártól az alábbi osztályzatot kapta: "
                    + sMarkType.getValue() + " Értékelése: " + sMarkType.getDescription()
            );
        } catch (IllegalStateException ise) {
            System.out.println("Hiba történt, kezdje újra az utolsó műveletet. " + ise.getMessage());
            runMenu();
        }
    }

    public void menu6() {
        try {
            System.out.println(cr.calculateClassAverage());
        } catch (ArithmeticException ae) {
            System.out.println("Nem tudtuk kiszámolni az átlagot: " + ae.getMessage());
        }
    }

    public void menu7() {
        try {
            System.out.println("Melyik tárgyból szeretnék kiszámolni az átlagot?");
            Subject sub = new Subject(scanner.nextLine());
            System.out.println(cr.calculateClassAverageBySubject(sub));
        } catch (IllegalStateException ise) {
            System.out.println("");
        }
    }

    public void menu8() {
        try {
            for (StudyResultByName eredmeny : cr.listStudyResults()) {
                System.out.println(eredmeny.getStudentName() + "tanuló átlaga" + eredmeny.getStudyAverage());
            }
        } catch (IllegalStateException ise) {
            System.out.println("Valami hiba történt: " + ise.getMessage());
        }
    }

    public void menu9() {
        try {
            System.out.println("Add meg a tanuló nevét:");
            String tanulo = scanner.nextLine();
            System.out.println(cr.findStudentByName(tanulo).getName() + " " + cr.findStudentByName(tanulo).calculateAverage());
        } catch (IllegalStateException ise) {
            System.out.println("Hibát talál a program: " + ise.getMessage());
        }
    }

    public void menu10() {
        try {
            System.out.println("Add meg a tanuló nevét:");
            String tanulo = scanner.nextLine();
            Subject sSubject = sSubjectWorker();
            System.out.println(cr.findStudentByName(tanulo).getName() + " "  + sSubject.getSubjectName() + " átlaga: " + cr.findStudentByName(tanulo).calculateSubjectAverage(sSubject));
        } catch (NullPointerException npe) {
            System.out.println("Hibát talál a program: " + npe.getMessage());
        }
    }

    public void menu11() {
        System.out.println("Viszlát!");
    }

    public void findStudent(String akármi) {
        try {
            System.out.println("Adja meg a " + akármi + " diák nevét");
            System.out.println(cr.findStudentByName(scanner.nextLine()));
        } catch (IllegalArgumentException iae) {
            System.out.println("Nincs ilyen nevú tanuló.");
        }

    }

    public static void main(String[] args) {

        SchoolRecordsController src = new SchoolRecordsController(new ClassRecords("8B", new Random(8)));
        src.initSchool();
        src.runMenu();
    }
}
