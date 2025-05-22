package Apna_college;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        //declaring an array list
        ArrayList<Integer> list1 = new ArrayList<Integer>();

        //initializing or adding array elements
        list1.add(17);
        list1.add(16);
        list1.add(15);
        list1.add(18);
        list1.add(19);

        //get the element from the arrray list
        int element = list1.get(4); 
        System.out.println(element); //prints the specific element at the specific index
        System.out.println();
        System.out.println(list1); //prints all of the elements present in the specified list
        System.out.println();

        //set the element at a specified index
        list1.set(0,11);
        System.out.println(list1);
        System.out.println();

        //delete an element from the index
        list1.remove(0); //0 is the index
        System.out.println("the element of index 0 is removed");
        System.out.println(list1);
        System.out.println();

        //get the size of the array list
        int sizeoflist = list1.size();
        System.out.println(sizeoflist);
        System.out.println();

        //loop on array lists
        for(int i = 0; i < list1.size(); i++) {
            System.out.print(list1.get(i) + " ");
        }
        System.out.println();
        System.out.println();

        //sorting of array lists elements
        Collections.sort(list1);
        System.out.println("after soring the elements: ");
        System.out.println(list1);

    }
}