import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {

        Map<String,Student> students = new HashMap<>();

        Scanner scan = new Scanner(System.in);

        // Create at least 4 student objects with at least 3 grades each, and add them to the map

        Student s1 = new Student("Brody");
        Student s2 = new Student("Adrien");
        Student s3 = new Student("Bethany");
        Student s4 = new Student("Albert");

        s1.addGrade(98);
        s1.addGrade(97);
        s1.addGrade(90);

        s2.addGrade(55);
        s2.addGrade(40);
        s2.addGrade(38);

        s3.addGrade(72);
        s3.addGrade(88);
        s3.addGrade(93);

        s4.addGrade(62);
        s4.addGrade(78);
        s4.addGrade(83);

        students.put("brody88", s1);
        students.put("crazyadrien", s2);
        students.put("bethany1251", s3);
        students.put("albert7", s4);

        System.out.println(s1.getName());
        System.out.println(s2.getName());
        System.out.println(s3.getName());
        System.out.println(s4.getName());

        System.out.println("which username would you like to see more of?");

        String usernameRequested = scan.nextLine();


        if(students.containsKey(usernameRequested)){
            System.out.println(students.get(usernameRequested).getGradeAverage());
        }




    }
}
