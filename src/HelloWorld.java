import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args){
//        System.out.print("Hello,");
//        System.out.print(" Brody");

//        String myName = "bethany";
//        int myAge = 28;
//
//        System.out.println("My name is " + myName + ". I am " + myAge + " years old");
//
//        System.out.format("\nMy name is %s. I am %d years old.", myName, myAge);

//%f.2 to return 2 spaces after the decimal

        Scanner scanner = new Scanner(System.in); // constructs a new instance of the scanner class and returns it to us. assign that to the scanner variable which is of type 'Scanner'.
//        System.out.print("Enter something: ");
//        String userInput = scanner.nextLine(); //.next is a blocking call and it will stop our code and wait for the user to enter something.
//
//
//        System.out.format("You entered: --> \"%s\" <--", userInput);

        //========== creating an address label ==========/

//        System.out.println("Enter your first and last name");
//        String userName = scanner.nextLine();
//
//        System.out.println("Enter your street address");
//        String addressLine1 = scanner.nextLine();
//
//        System.out.println("Enter the city, state, and zip for your street address");
//        String addressLine2 = scanner.nextLine();
//
//        System.out.format("Your mailing label is: %n %s%n %s%n %s%n", userName, addressLine1, addressLine2);

        //========== EXERCISE AT THE END OF THE MODULE =========//

//        System.out.println("Enter an integer");  //if the user enters anything that isn't a number than an exception is thrown
//        int userNumber = scanner.nextInt();
//
//        System.out.println("You entered--->" + userNumber);
//
//
//        //Prompt a user to enter 3 words and store each of them in a separate variable, then display them back, each on a newline.**//
//
//        System.out.println("Enter 3 random words");
//
//        String firstWord = scanner.next();
//        String secondWord = scanner.next(); // this next returns the word the user input AFTER the previous next method was run.  You can't chain these on.
//        String thirdWord = scanner.next();
//
//        System.out.format("You entered: %s, %s, %s", firstWord, secondWord, thirdWord);


        //Prompt the user to enter values of length and width of a classroom at Codeup.
        // Use the .nextLine method to get user input and cast the resulting string to a numeric type.
        //
        //Assume that the rooms are perfect rectangles.
        //Assume that the user will enter valid numeric data for length and width.//

        System.out.println("\nEnter the length and width of the classroom");

        int length = scanner.nextInt();

        int width = scanner.nextInt();

        int area = length * width;

        int perimeter = (length * 2) + (width * 2);

        System.out.format("\nThe area is %d. The perimeter is %d", area, perimeter);
//
    }
}
