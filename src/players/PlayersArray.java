package players;

public class PlayersArray {


    public static Player[] findAll() {
        return new Player[]{
                new Quarterback("Aaron Rodgers", 12, "Packers", "QB", 62.30), //  "QB", 62.3), //
                new Receiver("Davante Adams", 17, "Packers"),
                new Receiver("Geronimo Allison", 81, "Packers"),
                new RunningBack("Kapri Bibbs", 22, "Packers"),
                ///
                new Quarterback("Matt Ryan", 2, "Falcons", "QB", 50.00),
                new Receiver("Calvin Ridley", 17, "Falcons"),
                new Receiver("Devin Gray", 15, "Falcons"),
                new RunningBack("Kenjon Barner", 22, "Falcons"),
                /// seahawks
                new Quarterback("Russell Wilson", 3, "Seahawks", "QB", 50.00),
                new Receiver("Malik Turner", 17, "Seahawks"),
                new Receiver("Doug Baldwin", 89, "Seahawks"),
                new RunningBack("Chris Carson", 32, "Seahawks"),
                // Cowboys
                new Quarterback("Dak Prescott", 4, "Cowboys", "QB", 75.00),
                new Receiver("Randall Cobb", 18, "Cowboys"),
                new Receiver("Amari Cooper", 19, "Cowboys"),
                new RunningBack("Ezekiel Elliott", 21, "Cowboys"),
                // Steelers
                new Quarterback("Ben Roethlisberger", 7, "Steelers", "QB", 50.00),
                new Receiver("Tevin Jones", 14, "Steelers"),
                new Receiver("Eli Rogers", 17, "Steelers"),
                new RunningBack("Trey Edmunds", 33, "Steelers"),
                // Texans
                new Quarterback("Deshaun Watson", 4, "Texans", "QB", 50.00),
                new Receiver("Will Fuller", 15, "Texans"),
                new Receiver("Vyncint Smith", 17, "Texans"),
                new RunningBack("Lamar Miller", 26, "Texans"),
                // Patriots
                new Quarterback("Tom Brady", 12, "Patriots", "QB", 10.00),
                new Receiver("Julian Edelman", 11, "Patriots"),
                new Receiver("Phillip Dorsett", 13, "Patriots"),
                new RunningBack("Sony Michel", 26, "Patriots"),
                // Raiders
                new Quarterback("Derek Carr", 4, "Raiders", "QB", 50.00),
                new Receiver("Antonio Brown", 84, "Raiders"),
                new Receiver("Tyrell Williams", 16, "Raiders"),
                new RunningBack("Isaiah Crowell", 20, "Raiders"),
        };
    }
}

//packers.buildTeam("Packers");
//        falcons.buildTeam("Falcons");
//        seahawks.buildTeam("Seahawks");
//        cowboys.buildTeam("Cowboys");
//        steelers.buildTeam("Steelers");
//        texans.buildTeam("Texans");
//        patriots.buildTeam("Patriots");
//        raiders.buildTeam("Raiders");