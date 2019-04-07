package players;

public class GameApp {

    public static void main(String[] args) {

        Input input = new Input();

        Team packers = new Team("Green Bay", "Packers", "NFC", "North");
        Team falcons = new Team("Atlanta", "Falcons", "NFC", "South");
        Team seahawks = new Team("Seattle", "Seahawks", "NFC", "West");
        Team cowboys = new Team("Dallas", "Cowboys", "NFC", "East");
        Team steelers = new Team("Pittsburgh", "Steelers", "AFC", "North");
        Team texans = new Team("Houston", "Texans", "AFC", "South");
        Team patriots = new Team("New England", "Patriots", "AFC", "East");
        Team raiders = new Team("Las Vegas", "Raiders", "AFC", "West");

//        System.out.println(packers.players.size());
        Team myTeam = new Team();



//        System.out.println(myTeam.players.add(playerqb));
//        System.out.println(myTeam.getPlayers());
//        myTeam.buildTeam("Packers");
//        myTeam.buildTeam("Falcons");
//        myTeam.buildTeam("Seahawks");
        myTeam.buildTeam("Cowboys");
//        myTeam.buildTeam("Steelers");
//        myTeam.buildTeam("Texans");
//        myTeam.buildTeam("Patriots");
//        myTeam.buildTeam("Raiders");


        myTeam.returnTeamPlayers(myTeam);



//        System.out.println("\n\nPass or Run?");
//
//        Input.choosePassOrRun();

//        myTeam.returnTeamQb(packers);

//        System.out.println();



//        Quarterback.passBallBasedOnQbStats(myQB.getCompletionPercentage());

//        myTeam.getPlayers().run(5);
//
//
//        qb.passBall(70.00);

//        myTeam.returnTeamQb(patriots).run(5);

    }
}