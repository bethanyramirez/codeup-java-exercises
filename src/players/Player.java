package players;

public class Player {

    public String name;
    public int number;
    public String team;
    public String position;
    public double completionPercentage = 0.0;
//    int xLocation;
//    int yLocation;


    public Player(String name, int number, String team){
        this.name = name;
        this.number = number;
        this.team = team;
    }


    public Player(String name, int number, String team, String position, double completionPercentage) {
        this.name = name;
        this.number = number;
        this.team = team;
        this.position = position;
        this.completionPercentage = completionPercentage;
    }


    public void run(int rushYards){
        System.out.format("ran for %s yards");
    }

    public String getPosition() {
        return position;
    }

    public String getName() {
        return name;
    }

    public String getTeam() {
        return this.team;
    }

    public int getNumber() {
        return number;
    }

//    public double getCompletionPercentage() {
//        return completionPercentage;
//    }

    //    abstract void randomize();

//    abstract void randomize(double num); // overloading to add passer rating later...
// user Lists and arrayLists.


}


// more examples of when we would use hashmaps...
// we really aren't using them for databases.

// if permission level isn't up to par with then we can throw a permission exception.


// throw exception is like a TRY...

// you either need to catch it if you can deal with it at this level..

// if you are doing something inside the method that will throw an exception, you need to see it in the method title that it throws a specific exception and then when you call the method,the method needs to be inside a try/catch block.

//

