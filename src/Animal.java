import java.util.Date;


public class Animal {


    public String species;

    public Date birthdate;

    public void sayHello(String food) {

        System.out.printf("the %s eats the %s\n", this.species, food);
    }

}
