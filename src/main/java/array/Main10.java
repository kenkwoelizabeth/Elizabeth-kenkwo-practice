package array;

import java.util.Arrays;

public class Main10 {
    public static void main(String[] args) {
        /*Create an array that includes an integer, 3 strings, and 1 double. Print the array. */
        Object[] work10 = {5, "John", "Elizabeth", "Toyota", 4.5};// An object method can hold different varaible type
        for (int i = 0; i < 5; i++) {
            System.out.println(work10[i]);

        }
        System.out.println(Arrays.toString(work10));

    }
}
