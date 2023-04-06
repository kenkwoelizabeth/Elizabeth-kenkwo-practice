package array;

import java.util.Arrays;

public class Main7 {
    public static void main(String[] args) {
        /*Write a program where you create an array of 5 elements. Loop through the array and print the value of each
        element, except for the middle (index 2) element.
         */
        int[] work7 = {4, 7, 8, 9, 13};
        int index = 2;
        // Remove the element

        // If the array is empty
        // or the index is not in array range
        // return the original array
        if (work7 == null || index < 0 || index >= work7.length) {


        }

        // Create another array of size one less
        int[] anotherArray = new int[work7.length - 1];

        // Copy the elements except the index
        // from original array to the other array
        for (int i = 0, k = 0; i < work7.length; i++) {

            // if the index is
            // the removal element index
            if (i == index) {
                continue;
            }

            // if the index is not
            // the removal element index
            anotherArray[k++] = work7[i];
        }
        // return the resultant array
        System.out.println(Arrays.toString(anotherArray));
        System.out.println("Index to be removed: " + index + " which is " + work7[2]);
        System.out.println(Arrays.toString(anotherArray));
    }
}




