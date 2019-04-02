package shapes;
import util.Input;



public class CircleApp {

    public static void main(String[] args) {
        System.out.println("enter a radius to get the area of a circle");


        Input scanner = new Input();

        int aNumber = scanner.getInt();

        Circle newCircle = new Circle(aNumber);




        System.out.println(newCircle.getArea(aNumber));




    }
}
