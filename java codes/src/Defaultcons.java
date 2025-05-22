class student {

    String name;
    int rollno;
    String branch;

    student() {
        name = "Rakesh";
        rollno = 19;
        branch = "CSE";
    }

    void display() {
        System.out.println("Student name is: " + name + "\nRollno is: " + rollno + "\nBranch is: " + branch);
    }
}

public class Defaultcons {
    public static void main (String[] args) {
        student r = new student();
        r.display();
    }
}