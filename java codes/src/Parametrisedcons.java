class Myclass {
    String name;
    long phonenum;
    String branch;

    Myclass (String name, long phonenum, String branch) {
        this.name = name;
        this.phonenum = phonenum;
        this.branch = branch;
    }

    void display() {
        System.out.println("Name: " + name + "\nPhone number: " + phonenum + "\nbranch: " + branch);
    }
}

public class Parametrisedcons {
    public static void main (String[] args) {
        Myclass rr = new Myclass("Rakesh", 6302328162L, "CSE");
        rr.display();
    }
}
