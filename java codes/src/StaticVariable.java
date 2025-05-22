class just { 
    String name;
    int pin;
    static String college_name = "VMR";

    //here static keyword will allocate memory for college name only once.
    /*name and pin are unique but college name is common for all students so, we use static variable 
    so that it need not to change always for all different students of same college.*/

    void getdata (String name, int pin) {
        this.name = name;
        this.pin = pin;
    }

    void showdata () {
        System.out.println(name + " " + pin + " " + college_name);
    }
}

public class StaticVariable {
    public static void main (String[] args) {
        just rr = new just();
        just rr2 = new just();

        rr.getdata("Rakesh", 19);
        rr2.getdata("Rajesh", 91);

        rr.showdata();
        rr2.showdata();
    }
}
