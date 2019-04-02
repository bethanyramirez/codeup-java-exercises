package players;

public class Team {

    protected String location;
    protected String name; // = "San Antonio Brodies";
    protected String league; // = "Cat League";
    protected String division;


    public Team(String location, String name, String league, String division) {
        this.location = location;
        this.name = name;
        this.league = league;
        this.division = division;

    }
}
