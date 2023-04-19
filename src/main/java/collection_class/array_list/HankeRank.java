package collection_class.array_list;

import java.util.ArrayList;
import java.util.Scanner;

public class HankeRank {
    public static void main(String arg[]) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ArrayList<Integer>> rows = new ArrayList<>(); // declaring a row integer of arrays
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {     // to get the rows
            int d = sc.nextInt();
            ArrayList<Integer> row = new ArrayList<>();// for every row

            for (int j = 0; j < d; j++) {       // for numbers in the rows
                int num = sc.nextInt();
                row.add(num);        // adding the numbers to the arraylist of the row


            }
            rows.add(row);  // adding the row to the arraylist of rows

        }
// for getting values in the rows and column
        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            // to deal with the last 2 errors
            try {
                System.out.println(rows.get(x - 1).get(y - 1));
            } catch (Exception e) {
                System.out.println("ERROR:");
            }
        }


    }
}
