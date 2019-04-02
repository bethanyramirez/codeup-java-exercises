import java.util.Random;

public class ServerNameGenerator {

    public String[] adjectives = {"pretty", "stinky", "aggressive", "offensive", "delightful", "ridiculous", "underwhelming", "witty", "pretentious", "outgoing"};

    public String[] nouns = {"grasshopper", "kemosabe", "guy", "kid", "banana", "chief", "schmuck", "idiot", "weirdo", "bore"};


    public String returnRandomName(){
        Random rand = new Random();


        int randomInt = rand.nextInt(adjectives.length - 1);
        int randomInt2 = rand.nextInt(nouns.length - 1);

        return (adjectives[randomInt] + "-" + nouns[randomInt2]);

    }

    public static void main(String[] args) {
        ServerNameGenerator nameGenerator = new ServerNameGenerator();

        System.out.println(nameGenerator.returnRandomName());
    }
}
