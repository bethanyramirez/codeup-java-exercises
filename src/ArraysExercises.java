import java.util.Arrays;
import java.util.ArrayList;
import java.util.*;

public class ArraysExercises {



    public static Person[] addPerson(Person[] personObjects, Person singlePerson) {

        // making a copy of the personObjects Array to assign it to the copy of the passed in array + 1;
        Person[] personObjectsCopy = Arrays.copyOf(personObjects, (personObjects.length + 1));

        // assigning the person to the last index of the person objects copy array
        personObjectsCopy[personObjectsCopy.length - 1] = singlePerson;

        return personObjectsCopy;
    }



    public static void main(String[] args) {


//        String[] friends = new String[4];
//
//        friends[0] = "Bethany";
//        friends[1] = "James";
//        friends[2] = "Jeremy";
//        friends[3] = "Adrien";
//
//        System.out.println(friends[0]);
//        System.out.println(friends[1]);
//        System.out.println(friends[2]);
//        System.out.println(friends[3]);


//        Person fakePerson1 = new Person("Mac"); // creating new people (guys).
//        Person fakePerson2 = new Person("Dee");
//        Person fakePerson3 = new Person("Charlie");
//        Person fakePerson4 = new Person("Dennis");
//        Person fakePerson5 = new Person("Frank");


        Person[] people = new Person[3]; // creating an array of Person objects

        people[0] = new Person("Mac"); // assigning the elements in the array to my new person I created
        people[1] = new Person("Dee");
        people[2] = new Person("Charlie");


        for (Person person : people) {
            System.out.println(person.getName());
        }


        Person myTestPerson = new Person("Brody");


//        System.out.print("========================================\n");
//
//        String[] theStrokes = {"julian", "albert", "fab", "nikolai", "nick"};
//
//
//        System.out.println(Arrays.toString(theStrokes));
//
//        String[] babyStrokes = Arrays.copyOf(theStrokes, 3);
//
//
//        if(Arrays.equals(theStrokes, babyStrokes)) {
//            System.out.println("they are equal");
//        } else {
//            System.out.println("these arrays are different");
//        }
//
//        System.out.println("\n==========logging new array======");
//
//
//
//        for(Person person : addPerson(people, myTestPerson)){ // for each person in the returned addPerson array
//            System.out.println(person.getName());
//        }
//
//
//
//        /**-------Server Name Generator-------------**/
//
//        ServerNameGenerator nameGenerator = new ServerNameGenerator();
//
//
//        System.out.println("=========returning a name===========");
//        System.out.println(nameGenerator.returnRandomName());


        /**------ ArrayList--------*/

//        String[] monthsArray = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};


        List<String> monthsArrayList = new ArrayList<>();


        monthsArrayList.add("jan");
        monthsArrayList.add("feb");

        System.out.println(monthsArrayList.size());


        for (int i = 0; i < monthsArrayList.size(); i++) {
            System.out.println(monthsArrayList.get(i));
        }

        for (String month : monthsArrayList) { // here it is "string" because thats what it inside the List. That's what builds up the list.

            System.out.println(month);
        }
    }
}