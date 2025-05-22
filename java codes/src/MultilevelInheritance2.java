import java.util.Scanner;

class vehicle {
    Scanner sc = new Scanner (System.in);
    String brand;
    String model;
    void inputvehicledetails() {
        System.out.println("Brand name: ");
        brand = sc.nextLine();
        System.out.println("Model: ");
        model = sc.nextLine();
    }

    void displayvehicledetails() {
        System.out.println("------------------------------");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
    }
}

class car extends vehicle {
    int fueltype;
    double enginecapacity;

    void inputcardetails() {
        System.out.println("Fule Type: ");
        fueltype = sc.nextInt();
        System.out.println("Engine capacity: ");
        enginecapacity = sc.nextDouble();
    }

    void displaycardetails() {
        System.out.println("Fule type: " + fueltype);
        System.out.println("Engine capacity: " + enginecapacity);
    }
}

class sportscar extends car {
        int topspeed;
        double acceleration;
    
        void inputsportscardetails() {
            System.out.println("Top speed: ");
            topspeed = sc.nextInt();
            System.out.println("Acceleration: ");
            acceleration = sc.nextDouble();
        }
    
        void displaysportscardetails() {
            System.out.println("Top speed " + topspeed);
            System.out.println("Acceleration: " + acceleration);
            System.out.println("------------------------------");
        }
    }

public class MultilevelInheritance2 {
    public static void main (String[] args) {
        sportscar rr = new sportscar();

        rr.inputvehicledetails();
        rr.inputcardetails();
        rr.inputsportscardetails();
        rr.displayvehicledetails();
        rr.displaycardetails();
        rr.displaysportscardetails();
    }
}
