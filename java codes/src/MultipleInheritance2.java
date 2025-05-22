import java.util.Scanner;

interface AcademicDetails {
    void inputAcademicDetails();
    void displayAcademicDetails();
}

interface SportDetails {  
    void inputSportsDetails();
    void displaySportDetails();
}

class Student implements AcademicDetails, SportDetails {
    Scanner scan = new Scanner(System.in);

    String name;
    int rollnumber;
    String course;
    String sportname;
    String achievement;

    public void inputAcademicDetails() {
        System.out.println("Name: ");
        name = scan.nextLine();
        System.out.println("Roll number: ");
        rollnumber = scan.nextInt();
        scan.nextLine();
        System.out.println("Course name: ");
        course = scan.nextLine();
    }

    public void displayAcademicDetails() {
        System.out.println("------------------------------");
        System.out.println("Name: " + name);
        System.out.println("Roll number: " + rollnumber);
        System.out.println("Course name: " + course);
    }

    public void inputSportsDetails() {
        System.out.println("Sport name: ");
        sportname = scan.nextLine();
        System.out.println("any Achivements: ");
        achievement = scan.nextLine();
    }

    public void displaySportDetails() {
        System.out.println("Sport name: " + sportname);
        System.out.println("Achievement: " + achievement);
        System.out.println("------------------------------");
    }
}

public class MultipleInheritance2 {
    public static void main (String[] args) {
        Student rr = new Student();

        rr.inputAcademicDetails();
        rr.inputSportsDetails();
        rr.displayAcademicDetails();
        rr.displaySportDetails();
    }
}
