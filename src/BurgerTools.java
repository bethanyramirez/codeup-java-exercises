public class BurgerTools {

    public static String MostPopularTopping = "cheese";
    public static int averageDaysBeforeExpiration = 10;
    public static int temperatureWhenCooked = 150;

    public static void grill(){
        System.out.println("Grilling burger....");
    }

    public static int setTempCooked(int temp){
        return BurgerTools.temperatureWhenCooked = temp;
    }
}
