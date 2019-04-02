import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

//        int i = 5;
//
//        while (i <= 15){
//
//            System.out.println(i);
//            i++;
//        }


        // Alter your loop to count backwards by 5's from 100 to -10. //

//        int j = 100;
//
//        do {
//
//            System.out.println(j);
//            j -= 5;
//
//        } while (j >= -10);


        // Create a do-while loop that starts at 2, and displays the number squared on each line while the number is less than 1,000,000. //

        // refactor the previous two exercises to use a for loop instead

//        for(long k = 2; k < 70000; k *=k) {
//
//            System.out.println(k);
//        }



//        Fizzbuzz
//
//        One of the most common interview questions for entry-level programmers is the FizzBuzz test. Developed by Imran Ghory, the test is designed to test basic looping and conditional logic skills.
//
//                Write a program that prints the numbers from 1 to 100.
//        For multiples of three print “Fizz” instead of the number
//        For the multiples of five print “Buzz”.
//        For numbers which are multiples of both three and five print “FizzBuzz”.

//        for(int f = 1; f < 101; f++){
//
//            if(f % 5 == 0 && f % 3 == 0) {
//                System.out.println(f + " FizzBuzz");
//            } else if (f % 3 == 0) {
//                System.out.println(f + " Fizz");
//            } else if (f % 5 == 0) {
//                System.out.println(f + " Buzz");
//            } else {
//                System.out.println(f);
//            }
//
//        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("What number would you like to go up to?");

        int stopAtNum = scanner.nextInt();

        System.out.println("Number | Squared | Cubed");
        System.out.println("------ | ------- | -----");

        int i = 1;
        while(i <= stopAtNum) {

            System.out.format("%-7d|%-9d|%-7d\n",i,(i*i),(i*i*i));
            i++;
        }






//
//        System.out.println("Enter a numerical grade");
//        byte grade = scanner.nextByte();
//
//        if((grade <= 100) && (grade > 88)) {
//            System.out.println("You got an A!");
//        } else if ((grade < 88) && (grade >= 80)) {
//            System.out.println("You got a B!");
//        } else if ((grade < 80) && (grade >= 67)) {
//            System.out.println("You got a C!");
//        } else if ((grade < 67) && (grade >= 60)) {
//            System.out.println("You got a D!");
//        } else if (grade < 60) {
//            System.out.println("You got an F!");
//        } else {
//            System.out.println("You didn't enter anything");
//        }
//
//        System.out.println("Would you like to continue? Y / N");
//        String keepGoing = scanner.next();
//
//        if(keepGoing.equalsIgnoreCase("Y")){
//            System.out.println("you selected Y");
//        }


//        Daniel Fryar [11:55 AM]
//        Here are a few bonuses:
//        1) create three variables, start, end, and sum. Use a loop to find the summation of all the numbers between start and end (inclusive)





//

    }
}
