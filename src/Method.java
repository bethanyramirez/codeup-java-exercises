public class Method {
    public static void main(String[] args) {

        String message = "hello, zion";

        message = modify(message);

        System.out.println(message);

        addThings(3, 7);
    }


        public static String modify(String original) {
             original += " something";
             return original;
        }

        public static int addThings(int firstNum, int secondNum){
            return firstNum + secondNum;
        }

        public static String sayHello(String name) {
            return sayHello(name, "hello!");
        }

        public static String sayHello(String name, String greeting) {
            return String.format("%s, %s", greeting, name);
        }





        

}



