public class pattern2 {
    public static void main (String[] args) {

        for (int i=1; i<5; i++) {
            for(int j=1; j<6; j++) {
                if(i==1 || i==4 || j==1 || j==5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        System.out.println();

        //the logic was to focus on the rows and columns and to print only them which should be printed or are visible on the correct row and column..
    }

}
