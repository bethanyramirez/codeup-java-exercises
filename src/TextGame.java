import java.util.Scanner;

public class TextGame {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your hero name");

        String heroName = scanner.nextLine();

        System.out.format("Lets do this, %s!", heroName);

        System.out.println("Would you like to continue? Yes / No");

        System.out.println("");


//You’ll be creating a text based RPG in your console!
//–	Allow user to input their hero name.
//–	Ask if they are ready to start. If yes, then start the game.
//–	Give a display of enemy stats and hero stats. These values can be assigned by you.
//–	Decide on what actions your hero can take.
//–	For example:
//1.	Attack (each time 1 is input, enemy health should decrease)
//2.	Drink potion (adds to hero health.)
//3.	Run? (ends the game)
//–	Keep asking for user input until the enemy health reaches 0, then end the game.
//**BONUS:
//–	allow user to input enemy name.
//–	have the enemy attack the hero to decrease heroHealth after each time the hero takes an action
//–	if heroHealth reaches 0 before the enemy’s end game with message “Game Over.”
//–	Indicate how many potions your hero starts with. Decrement each time this action is used.
//
//~ Have fun and get creative!~








    }
}
