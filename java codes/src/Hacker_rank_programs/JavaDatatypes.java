package Hacker_rank_programs;

import java.util.*;

class Solution{
    public static void main(String []args)
    {

        /*
         * A byte is an 8-bit signed integer.
         * A short is a 16-bit signed integer.
         * An int is a 32-bit signed integer.
         * A long is a 64-bit signed integer.
         */


        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number for number of test cases : ");
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {

            try
            {

                System.out.println("enter a number to check its ranges: ");
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                if(x>=-128 && x<=127)System.out.println("* byte");
                if(x>=-32768 && x<=32767)System.out.println("* short");
                if(x>=Math.pow(-2,31) && x<=Math.pow(2,31)-1)System.out.println("* int");
                if(x>=Math.pow(-2,63) && x<=Math.pow(2,63)-1)System.out.println("* long");

            }

            catch(Exception e)
            {

                System.out.println(sc.next()+" can't be fitted anywhere.");

            }
        }
        sc.close();
    }
}

//https://www.hackerrank.com/challenges/java-datatypes/problem?isFullScreen=true
//Reference: https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html

