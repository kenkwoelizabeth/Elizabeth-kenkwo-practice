package sba_core_java.exercise2;

import java.util.ArrayList;

public class MajorLeagueSoccer {


    int[] playerNumberArray;

    public MajorLeagueSoccer() {
        //Initialize the “playerNumberArray” field with a newly created int array of size 11
        playerNumberArray = new int[11];

        //Assign player number of the “playerNumberArray” using the following logic:
        //array index + 1 is the player number - in other words, the value of the playerNumberArray[0]
        // is set to 1, and the value of the playerNumberArray[1] is set to 2, and so on
        int playerID = 0;
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }

    }

    //If the player is still in the team, set the value of the playerID of the
    // “playerNumberArray” to int value of “-1” and display a message saying “Player {playerID}
    // is sent to minor league” (Note that the playerID is arrayIndex + 1 - in other words,
    // if you get the playerID 5 as an argument, you can take a look at playerNumberArray[4].)
    //Otherwise - the player is no longer in the team -, display a message saying “Player {playerID}
    // is no longer available
    public void sendPlayerToMinorLeague(int playerID) {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];
        if (playerIDInTheArray != -1) {
            playerNumberArray[index] = -1;
            System.out.println("Player " + playerID + " is sent to minor league");
        } else {
            System.out.println("Player " + playerID + " is no longer available ");
        }
    }

    public void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        int index = playerID - 1;
        int playerIDInTheArray = playerNumberArray[index];
        if (playerIDInTheArray != -1) {
            playerNumberArray[index] = -1;
            System.out.println("Player " + playerID + " is sent to transferred to " + destinationTeam);
        } else {
            System.out.println("Player " + playerID + " is no longer available ");
        }
    }


    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }

    public void setPlayerNumberArray(int[] playerNumberArray) {
        this.playerNumberArray = playerNumberArray;
    }


}
