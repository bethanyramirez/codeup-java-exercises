package util;
import java.util.Scanner;

public class Input {

    private Scanner myScanner;

    public Input(){
        myScanner = new Scanner(System.in);
    }

    public int getInt(){
        return myScanner.nextInt();
    }

    public int getInt(int min, int max) {

        int output;

        do {
            System.out.println("Enter a number...WITHIN THE RANGE");

            output = myScanner.nextInt();

        } while(output <= min || output >= max);

        return output;
    }



    public double getDouble(){
        return myScanner.nextDouble();
    }

    public String getString(){
         return myScanner.nextLine();
    }

    public boolean yesNo(){
        String result = myScanner.nextLine();
        while(result.equals("")) result = myScanner.nextLine(); // accounting for an empty string.
        return result.equalsIgnoreCase("y") || result.equalsIgnoreCase("yes");
    }



    public double getDouble(double min, double max) {

        double doubleoutput;

        do {
            System.out.println("Enter a number WITHIN THE RANGE");

            doubleoutput = myScanner.nextInt();

        } while(doubleoutput < min || doubleoutput > max);

        return doubleoutput;
    }





    public static void main(String[] args) {

        Input myInput = new Input();

        System.out.println(myInput.getInt(1,50));
        System.out.println(myInput.getDouble(1,60));

    }






}