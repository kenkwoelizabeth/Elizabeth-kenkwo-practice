package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23, 12, 33, 47};

        // to get the average for the array
        double sum = 0;
        for (double value : myNumberArray) {
            sum += value;
        }
            double average= sum/ myNumberArray.length     ;
            System.out.println( average);


            MajorLeagueSoccer  league= new MajorLeagueSoccer();
              System.out.println(Arrays.toString(league.getPlayerNumberArray()));

        }
    }

