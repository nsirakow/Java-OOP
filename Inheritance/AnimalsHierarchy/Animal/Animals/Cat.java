package Animal.Animals;
import Animal.Animal;

public class Cat extends Animal {
  
    public Cat(String name, int age, String gender) {
        super(name, age, gender);
    }
  
    @Override
    public String produceSound() {
        return ("Meow meow");
    }
}
