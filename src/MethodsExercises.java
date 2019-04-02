import java.util.Scanner;
import java.lang.Math;

public class MethodsExercises {
    public static void main(String[] args) {


//        System.out.println(subtraction(10,4));
//        System.out.println(multiplication(9,8));
//        System.out.println(division(100,25));
//        System.out.println(modulus(33,3));

        Scanner scanner = new Scanner(System.in);


        System.out.println(rollDice());



        // Calculate the factorial of a number.

//        boolean letsContinue = true;
//
//    do {
//        System.out.println("Enter an integer from 1 to 10");
//
//        int num = scanner.nextInt();
//
//        System.out.println(factorial(num));
//
//        System.out.println("would you like to continue? Y / N ?");
//
//        String continueOrNot = scanner.next();
//
//        if (continueOrNot.startsWith("n")) {
//            letsContinue = false;
//        }
//
//    } while (letsContinue);


    } // end of main method.


    public static String rollDice() {
        // dice stuff //
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of sides for a pair of dice");

        int numOfSides = scanner.nextInt();

        System.out.println("Would you like to roll the dice? Y / N ?");

        String keepRolling = scanner.next();

        if (keepRolling.startsWith("y")) {
            int dice1 = (int) (Math.random() * numOfSides + 1);
            int dice2 = (int) (Math.random() * numOfSides + 1);

            return String.format("You rolled: %d and %d", dice1, dice2);

        } else {
            return "You didn't roll";
        }

    }



//    public static int factorial(int num) {
//
//        int total = 1;
//        for (int i = 1; i <= num; i++) {
//           total *= i;
//        }
//        return total;
//    }


    public static int getInteger(int min, int max) {
        int output;
        Scanner sc = new Scanner(System.in);
        while(!sc.hasNextInt()){
            System.out.printf("Invalid input. Enter a valid integer between %d and %d: ", min, max);
            sc.next();
        }
        output = sc.nextInt();
        if(output < min || output > max) {
            System.out.printf("Invalid range. Enter a valid integer between %d and %d: ", min, max);
            return getInteger(min, max);
        }
        return output;
    }


//    public static int addition(int firstNum, int secondNum){
//
//        return firstNum + secondNum;
//
//        }
//
//
//    public static int subtraction(int firstNum, int secondNum){
//
//        return firstNum - secondNum;
//    }
//
//    public static int multiplication(int firstNum, int secondNum){
//
//        return firstNum * secondNum;
//    }
//
//    public static int division(int firstNum, int secondNum){
//
//        return firstNum / secondNum;
//    }
//
//    public static int modulus(int firstNum, int secondNum){
//
//        return firstNum % secondNum;
//
//    }


}






