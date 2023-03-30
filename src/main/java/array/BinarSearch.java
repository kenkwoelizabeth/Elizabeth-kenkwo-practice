package array;

import java.util.Arrays;

public class BinarSearch {


        public static void main(String[] args) {
            int[] myIntArray = {5, 6, 2, 10, 20, 40};
            boolean searchResult = binarySearch(myIntArray, 6);
            System.out.println(searchResult);
        }

        private static boolean binarySearch(int[] myIntArray,int targetNumber) {
            // TODO - write your code here
            Arrays.sort(myIntArray);

            int low=0;
            int high= myIntArray.length-1;
            while(low <= high) {
                int middleIndex = (low + high) / 2;
                int middleNumber = myIntArray[middleIndex];

                if (targetNumber == middleNumber) { // if we find the exact match
                    return true;
                } else if (targetNumber < middleNumber) {   // too high
                    high = middleIndex -1;
                } else {  //too low

                    low = middleIndex + 1;
                }
            }

            return false;

        }
    }



