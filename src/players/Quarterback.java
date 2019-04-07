package players;

import java.util.Random;

public class Quarterback extends Player  {

//    public String name;
//    public int number;
//    public String team;
    public String position = "QB";
//    public double completionPercentage = 0.0;
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

//    public double extractPassCompletion(){
//    }

    //    @Override
    public static void passBallBasedOnQbStats(double completionPercentage) {
        Random random = new Random();
        int successRandomizer = random.nextInt(101) + 1; // random num between 1 - 100

//        System.out.format("%nHere is the random number: %s", successRandomizer);

        Field.setCurrentDown();

       if(successRandomizer <= completionPercentage) { // success of completion will depend on QB completion Percentage

//           System.out.println("\nComplete Pass");

           Randomize.callPlayRandomizer(2); // 2 is the parameter for "pass" to randomize the yardage gained.
       }  else {
           Field.yardsGainedFromPlay = 0;
           System.out.println("\nIncomplete Pass");
       }
    }




    public void run(int rushYards){

        System.out.format("%s with the Quarterback sneak for %s yards", this.getName(), rushYards);
    }



}

