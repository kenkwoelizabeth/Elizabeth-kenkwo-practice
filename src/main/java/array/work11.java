package array;

import java.util.Arrays;
import java.util.Scanner;

public class work11 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        //get the input for number of the favourite size:
        System.out.println("How many favorite things do you have? ");
        int favourite = scan.nextInt();
        scan.nextLine();// just to ignore the line
        //store into String array

        String things[] = new String[favourite];

        for (int i = 0; i < things.length; i++) {

            System.out.println("Enter your thing: ");
            things[i] = scan.nextLine();
        }
        for (String list : things) {
            System.out.println("Your favorite  things are: " + list);
        }
    }
}