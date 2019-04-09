package players;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Arrays;

public class Input {

    private int passOrRun;
    private static String playChoice;

    static Scanner playScan = new Scanner(System.in);


    public static String getPassOrRun() {
         String playChoice =  playScan.next();
         return playChoice;
    }


    public static int choosePassOrRun() {
        String playChoice =  playScan.next();

        int passOrRun = 0;

        if (playChoice.equalsIgnoreCase("pass") || (playChoice.equalsIgnoreCase("p") && playChoice.endsWith("s"))) {
            passOrRun = 2;
//            System.out.printf("\n%s has a completion percentage of : %s", qb.getName(), qb.getCompletionPercentage());
        } else if (playChoice.equalsIgnoreCase("run") || playChoice.equalsIgnoreCase("r")) {
            // if run, call the randomizerunmethod
            passOrRun = 1;
            Randomize.randomizeSuccessRate(1);
        } else if (playChoice.equalsIgnoreCase("punt") || playChoice.endsWith("t")) {
            passOrRun = 3;
        }
        return passOrRun;
    }







    public static void main(String[] args) {

//        Team packers = new Team("Green Bay", "Packers", "NFC", "North");
//        Team falcons = new Team("Atlanta", "Falcons", "NFC", "South");
//        Team seahawks = new Team("Seattle", "Seahawks", "NFC", "West");
//        Team cowboys = new Team("Dallas", "Cowboys", "NFC", "East");
//        Team steelers = new Team("Pittsburgh", "Steelers", "AFC", "North");
//        Team texans = new Team("Houston", "Texans", "AFC", "South");
//        Team patriots = new Team("New England", "Patriots", "AFC", "East");
//        Team raiders = new Team("Las Vegas", "Raiders", "AFC", "West");
//
//
//
//
//
//        System.out.println(packers.players.size());
//
//        packers.buildTeam("Packers");
//        falcons.buildTeam("Falcons");
//        seahawks.buildTeam("Seahawks");
//        cowboys.buildTeam("Cowboys");
//        steelers.buildTeam("Steelers");
//        texans.buildTeam("Texans");
//        patriots.buildTeam("Patriots");
//        raiders.buildTeam("Raiders");
//
//        Team team = new Team();
//
//        team.returnTeamPlayers(packers);
//
////        System.out.println(packers.players.size());
////        System.out.println(falcons.players.size());
////        System.out.println(seahawks.players.size());
////        System.out.println(cowboys.players.size());
////        System.out.println(steelers.players.size());
////        System.out.println(texans.players.size());
////        System.out.println(patriots.players.size());
////        System.out.println(raiders.players.size());
//
//
//
//
//
////
////
////        patriots.addPlayerToTeamArrayList(qb2);
////
////
////
////        System.out.println(falcons.players);
////        System.out.println(patriots.players);
//
//
//
//
//
//
//        System.out.println("\nPass or Run?");
//
//        choosePassOrRun();
//
////        team.getPlayers().run(5);
//
//
////        qb.passBall(70.00);
//
//        System.out.println(packers.getName());

//
//        List<Team> teams = new ArrayList<>(); // eventually build this up to accept a home team var and a opposing team var.  Pass in the vars to the ArrayList
//
//        teams.add(packers);
//        teams.add(falcons);
//        teams.add(seahawks);
//        teams.add(cowboys);
//        teams.add(steelers);
//        teams.add(texans);
//        teams.add(patriots);
//        teams.add(raiders);
//
//
//        for (Team team : teams) {
//
//            System.out.println(team.getName());
//        }
//Player[] players = new Player[];
//
//        Team testTeam = new Team("Green Bay", "Packers", "NFC", "North",  );
//
    }
}