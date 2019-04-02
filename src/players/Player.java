package players;

abstract public class Player {

    public String name;
    public int number;
    public String team;
//    int xLocation;
//    int yLocation;


    public Player(String name, int number, String team){
        this.name = name;
        this.number = number;
        this.team = team;
    }

}
