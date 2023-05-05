package sba_test1;

public class Football implements Sport {

    private int[] playersIDs;

    public Football() {

        playersIDs = new int[11];
        for (int i = 0; i < playersIDs.length; i++) {
            playersIDs[i] = i + 1;
        }
        System.out.println("A new football team has been formed");
    }

    @Override
    public void calculateAvgAge(int[] age) {
        double sum = 0;
        for (double value : age) {
            sum += value;
        }
        double average = sum / age.length;
        System.out.println("The average age of the team is " + average);
    }


    @Override
    public void retirePlayer(int id) {
        int index = id - 1;
        int playerIDInTheArray = playersIDs[index];
        if (playerIDInTheArray != -1) {
            playersIDs[index] = -1;
            System.out.println("Player with id: " + id + " has retired");
        } else {
            System.out.println("Player has already retired ");
        }
    }

    public void playerTransfer(int fee, int id) {

        int index = id - 1;
        int playerIDInTheArray = playersIDs[index];
        if (playerIDInTheArray != -1) {
            playersIDs[index] = -1;
            System.out.println("Player with id: " + id
                    + " has been transferred with a fee of " + fee);
        } else {
            System.out.println("Player has already retired");
        }

    }

    public int[] getPlayersIDs() {
        return playersIDs;
    }

    public void setPlayersIDs(int[] playersIDs) {
        this.playersIDs = playersIDs;
    }
}
