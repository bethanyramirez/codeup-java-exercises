package players;

import static players.Input.choosePassOrRun;
import static players.Input.playScan;


public class GameApp {



    public static void main(String[] args) {

//        Input input = new Input();

        Team packers = new Team("Green Bay", "Packers", "NFC", "North");
        Team falcons = new Team("Atlanta", "Falcons", "NFC", "South");
        Team seahawks = new Team("Seattle", "Seahawks", "NFC", "West");
        Team cowboys = new Team("Dallas", "Cowboys", "NFC", "East");
        Team steelers = new Team("Pittsburgh", "Steelers", "AFC", "North");
        Team texans = new Team("Houston", "Texans", "AFC", "South");
        Team patriots = new Team("New England", "Patriots", "AFC", "East");
        Team raiders = new Team("Las Vegas", "Raiders", "AFC", "West");


        Team myTeam = new Team();

            System.out.println("Choose your team:\n");
        for(Team team : TeamsArray.findAllTeams()){
            System.out.println(team.getName());
        }

         String teamChosen = playScan.nextLine();

        myTeam.setTeam(teamChosen);


//        packers.buildTeam("Packers");  // dont think i need this anymore.
//        falcons.buildTeam("Falcons");
//        seahawks.buildTeam("Seahawks");
//        cowboys.buildTeam("Cowboys");
//        steelers.buildTeam("Steelers");
//        texans.buildTeam("Texans");
//        patriots.buildTeam("Patriots");
//        raiders.buildTeam("Raiders");

//        System.out.println(myTeam.getPlayers());
        System.out.println();
        System.out.println();
        myTeam.returnTeamPlayers(myTeam);
        System.out.println();
        System.out.println();

        // enter a coin toss..... //

        System.out.println("You are starting at the 20 yard line, and need 80 yards for a Touchdown.  Would you like to pass or run?");



//        Input.choosePassOrRun(myTeam.getQB());

        if(Input.choosePassOrRun(myTeam.getQB()) == 2) {
            Quarterback.passBallBasedOnQbStats(myTeam.getQB().getCompletionPercentage());
        }

        Field.printCurrentDownAndDistance();
//        System.out.println("\n\nPass or Run?");


//        passBallBasedOnQbStats(myTeam.getQB().getCompletionPercentage());

//////
////
//////
////
//        System.out.println(myQB.getName());

//        myTeam.getPlayers().run(5);
//
//
//        qb.passBall(70.00);

//        myTeam.returnTeamQb(patriots).run(5);

    }
}