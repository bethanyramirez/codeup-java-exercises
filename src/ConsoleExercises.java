import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {

        double pi = 3.14159;
        System.out.format("the value of pi is %.2f", pi);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter an integer: ");
        int num = scanner.nextInt();
        System.out.format("You entered: %d%n", num);

        System.out.println("Please enter 3 words: ");
        String word1 = scanner.next();
        String word2 = scanner.next();
        String word3 = scanner.next();
        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        scanner.nextLine(); // if this line isn't here then the nextLine() on line 26 won't work.


        System.out.println("Please enter a sentence");
        String sentence = scanner.nextLine();
        System.out.printf("Your sentence: %s%n", sentence);

        System.out.println("Please enter length of the classroom: ");
        double length = new Double(scanner.nextLine()); // look up autoboxing and auto unboxing to learn more about this line.
        System.out.println("Please enter width of the classroom: ");
        double width = scanner.nextDouble();
        System.out.printf("The area of the classroom is %.2f.", length * width); // the l & w will evaluate first
        System.out.printf("The perimeter of the classroom is %.2f feet.", 2*(length + width));


//        boolean needsHaircut = true;
//        boolean hasHaircutMoney = true;
//
//        if(hasHaircutMoney && needsHaircut) {
//            System.out.print("Go get a haircut");
//            hasHaircutMoney = false;
//        } else



    }
}
