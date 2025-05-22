package Hacker_rank_programs;

import java.util.*;
//we dont need to import Math.* cause we already have it inside java.lang.* class.

class Solution{
    public static void main(String []args){
        Scanner in = new Scanner(System.in);

        System.out.println("enter number of inputs/quires: ");
        int t=in.nextInt(); //for number of inputs

        int result = 0;
        int x;

        for(int i=0;i<t;i++){
            System.out.println("enter the values for a, b and n: ");
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();

            for(int p=0; p<=n; p++){
            x = (int) Math.pow(2,p);


            result = result + (x * b);

            if (p == n)
            break;

            System.out.print((result + a) + " ");
            }

            System.out.println();
            result = 0 ;

        }
        in.close();
    }
}

//https://www.hackerrank.com/challenges/java-loops/problem?isFullScreen=true