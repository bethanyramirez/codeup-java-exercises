import java.util.*;

public class Student {

    private String name;
//    private int grades;
    private List<Integer> grades;

    Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();

    }

    public String getName(){
        return name;
    }

    public void addGrade(int grade){

        grades.add(grade);
    }

    public double getGradeAverage(){
        double  total = 0;

        for(int i = 0; i < this.grades.size(); i++){
            total += this.grades.get(i);
        }
        return total / grades.size();
    }



    public static void main(String[] args) {

        Student student1 = new Student("bethany");

        student1.addGrade(95);
        student1.addGrade(97);

        System.out.println(student1.getGradeAverage());

    }
}
