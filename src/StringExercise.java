import java.sql.SQLOutput;

public class StringExercise {
    public static void main(String[] args) {

        String message = "We don't need no education";

        System.out.println(message.replace("education","thought control"));

        message += "\nCheck \"this\" out!, \"s inside of \"s!";

        message += "\nIn windows, the main drive is usually C:\\";

        message += "\nI can do backslashes \\, double backslashes \\\\, and the amazing triple backslash \\\\\\";

        System.out.println(message);

        System.out.println("testing...");
    }
}
