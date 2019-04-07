package util;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

    private Scanner myScanner;

    public Input(){
        myScanner = new Scanner(System.in);
    }

    public int getInt(){

        Integer num;
        String input = myScanner.nextLine();
        try {
            num = Integer.valueOf(input);
        } catch (NumberFormatException e){
            num = getInt();
        }
        return num;

    }

    public int getInt(int min, int max) {

        Integer userInt;
        String input = myScanner.nextLine();

        try {
            userInt = Integer.valueOf(input);
        } catch (NumberFormatException nfe){
            return getInt(min,max); // only called when it's NOT a number.
        }

        if(userInt >= min && userInt <= max){
            return userInt;
        }

        return getInt(min,max); // the number is  OUTSIDE the min/max but it IS an integer


    }





    public double getDouble(){

        Double num;
        String input = myScanner.nextLine();
        try{
            num = Double.valueOf(input);
        } catch (NumberFormatException nfe) {
            num = getDouble();
        }
        return num;
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

        double userDouble;
        String input = myScanner.nextLine();
        try{
            userDouble = Double.valueOf(input);
        } catch (NumberFormatException nfe){
            System.out.println(nfe);
            return getDouble(min, max);
        }

        if(userDouble >= min && userDouble <= max){
            return userDouble;
        }
        return getDouble(min,max);

    }





    public static void main(String[] args) {

        Input myInput = new Input();

//        System.out.println(myInput.getInt(9.9));

        System.out.println(myInput.getInt());


        System.out.println(myInput.getDouble());

    }






}