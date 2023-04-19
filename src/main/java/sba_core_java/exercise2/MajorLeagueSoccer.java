package sba_core_java.exercise2;

import java.util.ArrayList;

public class MajorLeagueSoccer {


    int[] playerNumberArray;

    public MajorLeagueSoccer() {
        playerNumberArray = new int[11];
        int playerID = 0;
        for (int i = 0; i < playerNumberArray.length; i++) {
            playerNumberArray[i] = i + 1;
        }

    }
    public void sendPlayerToMinorLeague(int playerID) {
        int index=playerID -1;
        int playerIDInTheArray=playerNumberArray[index];
        if (playerIDInTheArray!= -1) {
            playerNumberArray[index]=-1;
            System.out.println("Player " + playerID +" is sent to minor league");
        } else {
            System.out.println("Player " + playerID +" is no longer available ");
        }
    }

    public void transferPlayerToDifferentTeam(int playerID, String destinationTeam) {
        int index=playerID -1;
        int playerIDInTheArray=playerNumberArray[index];
        if (playerIDInTheArray != -1) {
            playerNumberArray[index]=-1;
            System.out.println("Player " + playerID +" is sent to transferred to " + destinationTeam);
        } else {
            System.out.println("Player " + playerID +" is no longer available ");
        }
    }


    public int[] getPlayerNumberArray() {
        return playerNumberArray;
    }

    public void setPlayerNumberArray(int[] playerNumberArray) {
        this.playerNumberArray = playerNumberArray;
    }





}
