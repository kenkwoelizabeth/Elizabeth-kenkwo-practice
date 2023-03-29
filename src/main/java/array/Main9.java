package array;

import java.util.Arrays;

public class Main9 {
    public static void main(String[] args) {
        /*Write a program to sort the following int array in ascending order: {4, 2, 9, 13, 1, 0}. Print the array in
        ascending order, and print the smallest and the largest element of the array. The output will look like the following:
         */
        int[] work9 = {4, 2, 9, 13, 1, 0};
        System.out.println("The original array is: " + Arrays.toString(work9));

         Arrays.sort(work9);  // sort the array
        System.out.println("Array in ascending order : " + Arrays.toString(work9));

        int smallestNum= work9[0]; // to  the smallest element
        int largestNum=work9[work9.length-1];  // to get the largest element
        System.out.println("The smallest number is " + smallestNum);
        System.out.println("The biggest number is " + largestNum);
    }
    }



