package players;

public class RunningBack extends Player {

    private String position = "RB";

    public String getPosition() {
        return position;
    }

    public RunningBack(String name, int number, String team) {
        super(name, number, team);
    }

    @Override
    public void run(int rushYards) {
        System.out.format(this.getName() + " runs for %s yards", rushYards);
    }
}
