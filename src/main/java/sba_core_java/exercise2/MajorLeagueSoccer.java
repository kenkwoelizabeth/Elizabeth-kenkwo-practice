package sba_core_java.exercise2;

import java.util.ArrayList;

public class MajorLeagueSoccer {


    int[] playerNumberArray;

    public MajorLeagueSoccer() {
        this.playerNumberArray = new int[11];
        int playerID = 0;
        for (int i = 0; i < this.playerNumberArray.length; i++) {
            this.playerNumberArray[i] = i + 1;
        }

    }
    void sendPlayerToMinorLeague(int playerID) {
        if (playerNumberArray[playerID] == -1) {
            System.out.println("Player " + playerID +" is sent to minor league");
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
