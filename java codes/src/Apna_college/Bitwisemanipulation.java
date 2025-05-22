package Apna_college;

import java.util.Scanner;

public class Bitwisemanipulation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //get bit 
        //get the 3rd bit, which is the 2nd position of the 0101 binary number
        int num = 5; //0101
        int position = 2; //postion = 2, i.e "1" in the 0101 -- remember that, we should count from "0" from right side of the binary numbers
        int bitMask = 5 << position; //left shifts the number to two bits

        if ((bitMask & num) == 0) {
            System.out.println("the bit at 2nd postion of 5(0101) was 0");
        } else {
            System.out.println("the bit at 2nd positon of 5(0101) was 1");
        }

        //set bit
        //set the 2nd bit, which is the 1st postion of 0101 binary number i.e = 0 (count starts from 0, from the right side of the binary number)
        int num2 = 5; //0101
        int position2 = 1;
        int bitMask2 = 1 << position2; //0001 after bitmasking = 0010
        int ORnewnum = bitMask2 | num2; //result after setting the 1st position of 0101 after performing OR operation = 7 = 0111

        System.out.println("number after adding/setting 1 in 1th positon of the original binary 5(0101): " + ORnewnum); 

        //clear bit
        //clear the 3rd bit, which is the 2nd postion of 0101 binary number i.e 1
        int num3 = 5; //0101
        int position3 = 2;
        int bitMask3 = 1 << position3; //0001 after bitmasking = 0100
        int NOTnewnum2 = ~(bitMask3); //0100 after bitmasking uisng NOT operator = 1011
        int ANDnewnum2 = NOTnewnum2 & num3; //result after clearing the 2nd position of 0101 after performing AND operation = 0001

        System.out.println("number after clearing the bit in 2nd position of the original binary 5(0101): " + ANDnewnum2);

        //update bit
        System.out.print("enter whether you want to set:1 op on 0101 or want to clear:0 op on 0101 = ");
        int oper = sc.nextInt();
        int num4 = 5; //0101

        //if operation = 1 then its a set operation
        if(oper == 1) {
            int position4 = 1;
            int bitMask4 = 1 << position4;
            int result = bitMask4 | num4; //result after setting 1 in 1st position of 0101 = 0111 = 7

            System.out.println("after performing set operation at 1st position of 0101: " + result);
        } 
        
        //else when operation = 0 then its a clear operation
        else {
            int position4 = 2;
            int bitMask4 = 1 << position4; // 0001 -> 0100
            int NOTbitmask3 = ~(bitMask4); // 0100 -> 1011
            int ANDbitmask3 = NOTbitmask3 & num4; //result after clearing the 2nd position of 0101 = 0001 = 1
            
            System.out.println("after performing clear operation at 2nd position of 0101: " + ANDbitmask3);
        }

        sc.close();

    }
}
