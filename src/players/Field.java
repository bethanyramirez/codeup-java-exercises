package players;

import java.util.Random;

public class Field {

    static int touchdownYardsToGo = 80;
    static int firstDownYardsToGo = 10;
    static int yardsGainedFromPlay = 0;
    int totalYardsGained = 0;
    int myTeamScore = 0; // should belong to team.
    int opposingTeamScore = 0; // should belong to team.
    private static int currentDown = 1;

    private Random r1 = new Random();



    public static void resetDownAndDistance() {
        currentDown = 1;
        firstDownYardsToGo = 10;
    }

    static void setCurrentDown() {
        if (currentDown <= 4) {
            currentDown += 1;
        }
    }

    public static void calculateYardsTilTouchdown(){

        touchdownYardsToGo -= yardsGainedFromPlay;
        System.out.format("\nYou have %s yards remaining to get a TD", touchdownYardsToGo);
    }

    private static void calculateYardsTilFirstDown(int yardsGainedFromPlay){

        firstDownYardsToGo -= yardsGainedFromPlay;
    }


    public static void analyzeDownAndDistance(){
         if (firstDownYardsToGo <= 0) {
             System.out.println("\n1st down!!!!!!");
             resetDownAndDistance();
//             driveBall();
        } else if(currentDown == 4) {
            System.out.format("\nIt's 4th and %s! You have a 60 percent chance of getting a 1st down. type 'run' , 'pass', or 'punt'..actually, don't type punt because i havent built that out yet. ", firstDownYardsToGo);
//            continueOrPunt();
        }
    }


}
