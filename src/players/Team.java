package players;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

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

    public void buildTeam(String teamname) {

        Player[] playersFromArray = PlayersArray.findAll();
        for(Player player : playersFromArray){
            if(player.team.equals(teamname)){ // the team it is getting is null
                players.add(player);
            }
        }
    }

    public void returnTeamPlayers(Team teamname){

        System.out.println("Here is your starting lineup: ");

        for(Player player: teamname.players){

            System.out.format("\n# %-3s| %-18s| %-3s", player.getNumber(), player.getName(), player.getPosition());
        }
    }



    public void showStartingLineup(Team team) {
        team.returnTeamPlayers(team);
    }

//
public Player returnTeamQb(Team teamname){
    Player[] playersFromArray = PlayersArray.findAll();
    Player playerToReturn = new Quarterback("Brody", 5, "SA Brodies", "QB", 50.00);

    for(Player player : playersFromArray){
        if(player.position.equals("QB") && player.team.equals(teamname.name)){
            playerToReturn = player;
            // call the pass method here... or the run method... or try anything. You are desperate at this point.
        }

    }
    return playerToReturn;
}



    // create a method that has a loop and assigns the chosen team players to respective roles. Quarterback, RB, WR

    // create a method that



    // create a method (maybe?) that takes in a String teamname and instantiates a new Team class with the players that match that team name...So maybe Player.getTeam.equals(teamName parameter); Also, need a getter method on the Player class.

}

