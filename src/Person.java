public class Person {

    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.format("Hello from %s", this.getName());
    }

    public Person(String personName){
        this.name = personName;
    }


    public static void main(String[] args) {

        Person cat = new Person("Brody");

        System.out.println(cat.name);
        cat.setName("Broder");
        System.out.println(cat.name);


        cat.sayHello();






    }
}
