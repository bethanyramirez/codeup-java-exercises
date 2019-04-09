package players;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Team {

    protected String location;
    protected String name; // = "San Antonio Brodies";
    protected String league; // = "Cat League";
    protected String division;
    protected List<Player> players; /// this is initialized below to an ArrayList.  If not, it will be a NullPointerException.

    public Team(){
        this.players = new ArrayList<>();
    }

    public Team(String location, String name, String league, String division) {
        this.location = location;
        this.name = name;
        this.league = league;
        this.division = division;
        this.players = new ArrayList<>();

    }

    public String getLocation(){
        return location;
    }


    public String getName(){
        return name;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTeam(String teamname){

        for(Team team : TeamsArray.findAllTeams()){
            if(teamname.equals(team.getName())){
                buildTeam(teamname);
            }
        }
    }

    public void buildTeam(String teamname) {

        for(Player player : PlayersArray.findAll()){
            if(player.getTeam().equals(teamname)){
                players.add(player);
            }
        }
    }

    public Player getQB() {
        return players.get(0);
    }

    public Player getReceiver() {
        Random random = new Random();
        int randomReceiver = random.nextInt(2); // generating either 0 or 1
        return (randomReceiver == 0) ? players.get(1) : players.get(2);
    }

    public void returnTeamPlayers(Team teamname){

        System.out.println("Here is your starting lineup:");
        System.out.println("\n______________________________________");
        for(Player player: teamname.players){
            System.out.format("%n# %-3s| %-18s| %-3s", player.getNumber(), player.getName(), player.getPosition());
        }
        System.out.println("\n______________________________________");
    }



    public void showStartingLineup(Team team) {
        team.returnTeamPlayers(team);
    }

//
//public Player returnTeamQb(Team teamname){
//
//    Player playerToReturn;
//
//    for(Player player : PlayersArray.findAll()){
//        if(player.getPosition().equals("QB") && player.getTeam().equals(teamname.getName())){
//            playerToReturn = player
//
//            ;
//            System.out.println("your qb is :" + playerToReturn.getName());
//            // call the pass method here... or the run method... or try anything. You are desperate at this point.
//        }
//
//
//
//    }
//    return playerToReturn;
//}


//    public void returnTeamQb(Team teamname){
//
//
//// if the team has a player with a position of QB, then return the QB
////
//
//        if(teamname.getPlayers().contains()){
//            System.out.println("contains a qb class");
//        }
//
//    }




    // create a method that has a loop and assigns the chosen team players to respective roles. Quarterback, RB, WR

    // create a method that



    // create a method (maybe?) that takes in a String teamname and instantiates a new Team class with the players that match that team name...So maybe Player.getTeam.equals(teamName parameter); Also, need a getter method on the Player class.

}


