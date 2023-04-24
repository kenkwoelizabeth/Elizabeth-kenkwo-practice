package sba_core_java.exercise2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] myNumberArray = {23, 12, 33, 47};

        // Compute average value and print it out with two decimal floating point
        // format - make sure it prints out with “28.75” not “28.00"
        double sum = 0;
        for (double value : myNumberArray) {
            sum += value;
        }
        double average = sum / myNumberArray.length;
        System.out.printf("The average age of the team is " + "%.2f %n", average);

//Create an object instance of “MajorLeagueSoccer” class and display the contents of the
// “playerNumberArray” to make sure the player number is set correctly

        MajorLeagueSoccer league = new MajorLeagueSoccer();
        System.out.println(Arrays.toString(league.getPlayerNumberArray()));

        //   Call “sendPlayerToMinorLeague(..)” method with playerID 4 and verify that
        //   “Player 4 is sent to minor league” gets displayed
        //   Call “sendPlayerToMinorLeague(..)” method with playerID 4
        //   again and verify that “Player 4 is no longer available” gets displayed
        league.sendPlayerToMinorLeague(4);
        league.sendPlayerToMinorLeague(4);


        league.transferPlayerToDifferentTeam(6, "Chelsea");
        league.transferPlayerToDifferentTeam(6, " Bayern Munich");


    }
}

