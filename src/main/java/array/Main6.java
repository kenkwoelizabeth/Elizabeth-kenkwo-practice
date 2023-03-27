package array;

import java.util.Arrays;

public class Main6 {
    public static void main(String[] args) {
        /*Write a program where you create an integer array of 5 numbers. Loop through the array and assign the value
        of the loop control variable multiplied by 2 to the corresponding index in the array.
         */
        int[] work6 = {4, 7, 8, 9, 13};
        for (int i = 0; i < 5; i++) {
            int multiples = work6[i] * 2;
            System.out.println(work6[i] * 2);

        }
    }
}