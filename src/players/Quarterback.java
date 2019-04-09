package players;

import java.util.Random;

public class Quarterback extends Player  {

    public String position = "QB";
    public Quarterback(){}

    public Quarterback(String name, int number, String team, String position, double completionPercentage) {
        super(name, number, team, position, completionPercentage);
    }

    public Quarterback(String name, int number, String team) {
        super(name, number, team);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public int getNumber() {
        return super.getNumber();
    }

    @Override
    public String getTeam() {
        return super.getTeam();
    }

    public double getQBCompletionPercentage() {
//        System.out.printf("\nCompletion percentage for %s is %s", quarterback, quarterback.getCompletionPercentage());
        return super.getCompletionPercentage();
    }

    @Override
    public String getPosition() {
        return super.getPosition();
    }


    public static int passBallBasedOnQbStats(double completionPercentage) {
        Random random = new Random();
        int successRandomizer = random.nextInt(101) + 1;
        int incompletePassNum;

        Field.setCurrentDown();

       if(successRandomizer <= completionPercentage) {
           // return a 1 if it is successful
           incompletePassNum = 1;
           Randomize.randomizePassYardsGained();
       }  else {
           // return a 0 if it is unsuccessful
           incompletePassNum = 0;
           Field.yardsGainedFromPlay = 0;
           System.out.println("\nIncomplete Pass");
       }
       return incompletePassNum;
    }




    public void run(int rushYards){

        System.out.format("%s with the Quarterback sneak for %s yards", this.getName(), rushYards);
    }



}

