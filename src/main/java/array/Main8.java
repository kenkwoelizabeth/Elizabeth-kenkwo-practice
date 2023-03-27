package array;

import java.util.Arrays;

public class Main8 {
    public static void main(String[] args) {
        /*Write a program that creates a String array of 5 elements and swaps the first element with the middle
        element without creating a new array.
         */

        int[] work8 = {4, 7, 8, 9, 13};

	System.out.println("Original Array: "+Arrays.toString(work8));
        int lastElement = work8[work8.length-1];  // to get the last element
        work8[work8.length-1]=work8[0];
        work8[0] = lastElement;

            System.out.println("New array after swaping the first and last elements: "+Arrays.toString(work8));
            }
            }


