//package players;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Random;
//import java.util.Scanner;
//
//public class GameApplication {
//
//    private Random r1 = new Random();
//    Scanner scanTest = new Scanner(System.in);
//
//    private boolean gameOver = false;
////    private int touchdownYardsToGo = 80;
////    private static int firstDownYardsToGo = 10;
////    private int yardsGainedFromPlay = 0;
////    private int totalYardsGained = 0;
////    public int myTeamScore = 0;
////    int opposingTeamScore = 0;
////    private static int currentDown = 1;
////    private int passOrRun;
////    private String playChoice;
//
//
//
//
//
////    private static void resetDownAndDistance() {
////        currentDown = 1;
////        firstDownYardsToGo = 10;
////    }
//
////    private void setCurrentDown() {
////        if (Field.currentDown <= 4) {
////            Field.currentDown += 1;
////        }
////    }
//
////    private void calculateYardsTilTouchdown(){
////
////        touchdownYardsToGo -= yardsGainedFromPlay;
////        System.out.format("\nYou have %s yards remaining to get a TD", touchdownYardsToGo);
////    }
//
////    private void calculateYardsTilFirstDown(int yardsGainedFromPlay){
////
////        firstDownYardsToGo -= yardsGainedFromPlay;
////    }
//
//
//
//
//
//
////    private void choosePassOrRun(String playChoice){
////
////        if (playChoice.equalsIgnoreCase("pass") || (playChoice.equalsIgnoreCase("p") && playChoice.endsWith("s"))){
////            passOrRun = 2;
////        } else if (playChoice.equalsIgnoreCase("run") || playChoice.equalsIgnoreCase("r")){
////            passOrRun = 1;
////        } else if (playChoice.equalsIgnoreCase("punt") || playChoice.endsWith("t")){
////            passOrRun = 3;
////        }
////    }
//
//
//    private void randomizeSuccessRate(int passOrRun) {
//        int successRandomizer = r1.nextInt(11); // random num between 0 - 10
//
//        setCurrentDown();
//
//       if(successRandomizer <= 7) { // 70% of the time they will be successful and gain yards.
//           callPlayRandomizer(passOrRun);
//       }  else {
//           yardsGainedFromPlay = 0;
//
//           System.out.println("Incomplete Pass or Unsuccessful Run");
//       }
//    }
//
//
//
//
//
//
//    private void printCurrentDownAndDistance(){
//
//        if(currentDown == 1){
//            System.out.format("%n1st and %s%n", firstDownYardsToGo);
//        } else if(currentDown == 2){
//            System.out.format("%n2nd and %s%n", firstDownYardsToGo);
//        } else if (currentDown == 3) {
//            System.out.printf("%n3rd and %s%n", firstDownYardsToGo);
//        } else if(currentDown == 4){
//            System.out.printf("%n4th and %s%n", firstDownYardsToGo);
//        }
//
//    }
//
//
//    private void callPlayRandomizer(int passOrRun) {
//
//        if(passOrRun == 1) {
//            randomizeRushYardsGained();
//        } else if(passOrRun == 2) {
//            randomizePassYardsGained();
//        }
//        calculateYardsTilTouchdown();   /// just added this.
//    }
//
//    private void randomizeRushYardsGained(){
//        int babyRun = r1.nextInt(2) + 1; // comes up with number between 1 - 3.
//        int regularRun = r1.nextInt(2) + 4; // generating number from 4 - 6.
//        int playRandomizer = r1.nextInt(11); // setting calculations of 100%..
//
//        if(playRandomizer <= 7){ // 60% of the time they will have a baby run.. 1  - 3 yards.
//            yardsGainedFromPlay = babyRun;
//            System.out.format("short run - completed for %s yards", babyRun);
//        } else { // 40 % of the time they will have a regular run.
//            yardsGainedFromPlay = regularRun;
//            System.out.format("regular run - completed for %s yards", regularRun);
//        }
//    }
//
//    private void randomizePassYardsGained(){
//        int playRandomizer = r1.nextInt(11); // setting calculations of 100%..
//        int shortPass = r1.nextInt(10) + 1; // generating num from 1 - 10
//        int mediumPass = r1.nextInt(11) + 10; // generating num from 10 - 20
//        int longPass = r1.nextInt(21) + 20; // generating num from 20 - 40
//
//
//        if (playRandomizer <= 7) { // 60% of the time it will be a short pass
//            yardsGainedFromPlay = shortPass;
//            System.out.format("short pass - completed for %s yards", shortPass);
//        } else if (playRandomizer <= 9) { // 20% of the time it will be a medium pass
//            yardsGainedFromPlay = mediumPass;
//            System.out.format("medium pass - completed for %s yards", mediumPass);
//        } else if (playRandomizer == 10) { // 10% of the time it will be a long pass
//            yardsGainedFromPlay = longPass;
//            System.out.format("long pass - completed for %s yards", longPass);
//        }
//    }
//
//
//
//    // activate choices on 4th down.
//
//    private void continueOrPunt(){
//
//        int firstDownRandomizer = r1.nextInt(10) + 1; // generating num from 1 - 10
//
//        if(firstDownRandomizer <= 5) { // 60% of the time they get it.
////            calculateYardsPerPlay(choosePassOrRun(playChoice));
//            while(touchdownYardsToGo > 0){
//                driveBall();
//            }
//        } else {
//            System.out.println("You didn't make it :( Time to punt..... ");
//        }
//    }
//
//    private void analyzeDownAndDistance(){
//         if (firstDownYardsToGo <= 0) {
//             System.out.println("\n1st down!!!!!!");
//             resetDownAndDistance();
////             printCurrentDownAndDistance();
//             driveBall();
//        } else if(currentDown == 4) {
//            System.out.format("\nIt's 4th and %s! You have a 60 percent chance of getting a 1st down. type 'run' , 'pass', or 'punt'..actually, don't type punt because i havent built that out yet. ", firstDownYardsToGo);
//            continueOrPunt();
//        }
//    }
//
//
//    private void driveBall(){
//        do {
//            printCurrentDownAndDistance();
//            System.out.println("Would you like to pass or run?");
//            playChoice = scanTest.next();
//            choosePassOrRun(playChoice);
//            randomizeSuccessRate(passOrRun);
//            calculateYardsTilFirstDown(yardsGainedFromPlay);
////            calculateYardsTilTouchdown(totalYardsGained);
//            System.out.println("\n-------------------------------------");
//
//        } while(currentDown < 4 && firstDownYardsToGo > 0);
//    }
//
//
//
//    public static void main(String[] args) {
//
////        Random rand = new Random();
////
////        int playCall = rand.nextInt(3);
////        int yardsGainedPerPlay = rand.nextInt(10);
////
////
//        Scanner scan = new Scanner(System.in);
////
////
////        Team[] teams = new Team[8];
////
////        teams[0] = new Team("Green Bay", "Packers", "NFC", "North");
////        teams[1] = new Team("Atlanta","Falcons", "NFC", "South" );
////        teams[2] = new Team("Seattle", "Seahawks", "NFC", "West");
////        teams[3] = new Team("Dallas","Cowboys","NFC", "East");
////        teams[4] = new Team("Pittsburgh","Steelers", "AFC", "North");
////        teams[5] = new Team("Houston", "Texans", "AFC", "South");
////        teams[6] = new Team("New England", "Patriots", "AFC", "East");
////        teams[7] = new Team("Las Vegas","Raiders", "AFC", "West");
////
////
////        System.out.println("Pick your team:\n");
////
////        int count = 1;
////        for(Team team : teams) {
////            System.out.format("%d - %s %s%n", count, team.location, team.name);
////            count++;
////        }
////
////        Team teamPicked = teams[0]; // actually set this to whatever they picked.
////        Team opposingTeam = teams[7];
//
//
//        // football field //
//
//
////        char[][] field = {
////                {'|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ','@',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|',' ','X','X',' ',' ',' ','O','O',' ',' ',' ',' ',' ','|',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ',' ','|'},
////                {'|','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','_','|'},
////        };
////
////        for (char[] row : field) {
////            System.out.println(row);
////
////        }
//
//
//
//
//
//        // ----- special cases ------- //
//
//        // touchdown - rewarded after you gain 80 yards.
//        // fumble or turnover.
//        // for 4 it could be an interception
//        // for 5 it could be a field goal
//
//
//
//
//        // ---- scoreboard ------ //
//
//
////        System.out.format("|%10s|%10s|%n", teamPicked.name, opposingTeam.name);
////        System.out.format("|%10d|%10d|", 8, 10);
//        GameApplication game = new GameApplication();
//
//
//        do {
//            game.printCurrentDownAndDistance(); // printing from inside the method.
//            System.out.println("Would you like to pass or run?"); // keep asking while currentDown is < 4
//            game.playChoice = scan.next();
//            game.choosePassOrRun(game.playChoice);
//            game.randomizeSuccessRate(game.passOrRun);
//            game.calculateYardsTilFirstDown(game.yardsGainedFromPlay);
////            game.calculateYardsTilTouchdown(game.totalYardsGained);
//            System.out.println("\n-------------------------------------");
//
//        } while(currentDown < 4 && firstDownYardsToGo > 0);
//
//        game.analyzeDownAndDistance();
//
//        game.playChoice = scan.next();
//
//        game.driveBall();
//
//
//
//
//
//    }
//}
