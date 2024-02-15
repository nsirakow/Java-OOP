package Animal.Animals.Cats;
import Animal.Animals.Cat;

public class Tomcat extends Cat {

    public Tomcat(String name, int age) {
        super(name, age, "male");
    }

    public Tomcat (String name, int age, String gender){
        super(name, age, "male");
    }

    @Override
    public String produceSound() {
        return ("MEOW");
    }
}
