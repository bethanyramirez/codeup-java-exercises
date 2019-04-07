public class Exceptions {

    public static void main(String[] args) {


        int[] numbers = {1, 2, 3};
        int x;

        try {
            x = numbers[3];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("That Array index isn't within bounds");
        } catch (Exception e) {
            System.out.println("Caught a generic exception!");
        } finally {
            System.out.println("This will always run.");
        }

    }
}