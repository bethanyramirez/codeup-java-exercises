import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String userConvo = scanner.nextLine();


        if(userConvo.endsWith("?")) {

            System.out.println("Sure");

        } else if (userConvo.endsWith("!")){

            System.out.println("Whoa, chill out!");

        } else if (userConvo.length() == 0) {

            System.out.println("Fine. Be that way!");

        } else {

            System.out.println("Whatever...");

        }





    }
}
