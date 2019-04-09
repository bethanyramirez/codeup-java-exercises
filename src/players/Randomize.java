package players;

import java.util.Random;

public class Randomize {


    public static void randomizeSuccessRate(int passOrRun) {
        Random r1 = new Random();

        int successRandomizer = r1.nextInt(11); // random num between 0 - 10
        Field.setCurrentDown();

        if(successRandomizer <= 7) { // 70% of the time they will be successful and gain yards.
            callPlayRandomizer(passOrRun);
        }  else {
            Field.yardsGainedFromPlay = 0;

            System.out.println("Run was stopped at the scrimmage line. 0 yards gained.");
        }
    }

    protected static void callPlayRandomizer(int passOrRun) {

        if(passOrRun == 1) {
            randomizeRushYardsGained();
        } else if(passOrRun == 2) {
            randomizePassYardsGained();
        }
        Field.calculateYardsTilTouchdown();   /// just added this.
    }

    protected static void randomizeRushYardsGained(){
        Random r1 = new Random();

        int babyRun = r1.nextInt(2) + 1; // comes up with number between 1 - 3.
        int regularRun = r1.nextInt(2) + 4; // generating number from 4 - 6.
        int playRandomizer = r1.nextInt(11); // setting calculations of 100%..

        if(playRandomizer <= 7){ // 60% of the time they will have a baby run.. 1  - 3 yards.
            Field.yardsGainedFromPlay = babyRun;
            System.out.format("short run - completed for %s yards", babyRun);
        } else { // 40 % of the time they will have a regular run.
            Field.yardsGainedFromPlay = regularRun;
            System.out.format("regular run - completed for %s yards", regularRun);
        }
    }

    protected static int randomizePassYardsGained(){
        Random r1 = new Random();

        int playRandomizer = r1.nextInt(11); // setting calculations of 100%..
        int shortPass = r1.nextInt(10) + 1; // generating num from 1 - 10
        int mediumPass = r1.nextInt(11) + 10; // generating num from 10 - 20
        int longPass = r1.nextInt(21) + 20; // generating num from 20 - 40

        if (playRandomizer <= 7) { // 60% of the time it will be a short pass
            return Field.yardsGainedFromPlay = shortPass;
//            return shortPass;
//            System.out.format("short pass - completed for %s yards", shortPass);
        } else if (playRandomizer <= 9) { // 20% of the time it will be a medium pass
            return Field.yardsGainedFromPlay = mediumPass;
//            return mediumPass;
//            System.out.format("medium pass - completed for %s yards", mediumPass);
        } else { // 10% of the time it will be a long pass
            return Field.yardsGainedFromPlay = longPass;
//            return longPass;
//            System.out.format("long pass - completed for %s yards", longPass);
        }
    }


}
