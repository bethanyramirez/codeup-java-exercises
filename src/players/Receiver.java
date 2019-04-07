package players;


public class Receiver extends Player {
    public String position = "WR";

    @Override
    public String getPosition() {
        return position;
    }

    public Receiver(String name, int number, String team) {
        super(name, number, team);
    }
    // implement a scorer interface ??
}
