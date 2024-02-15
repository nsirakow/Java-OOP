import Animal.Animal;
import Animal.Animals.Cat;
import Animal.Animals.Dog;
import Animal.Animals.Frog;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        List<Animal> animals = new ArrayList<>();
        String animalType = scanner.nextLine();

        while (!animalType.equals("Beast!")) {
            Animal animal = null;
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String gender = tokens[2];

            switch (animalType) {
                case ("Dog") -> animal = new Dog(name, age, gender);
                case ("Cat") -> animal = new Cat(name, age, gender);
                case ("Frog") -> animal = new Frog(name, age, gender);
            }
            addAnimalToList(animal, animals);
            animalType = scanner.nextLine();
        }
        for (Animal animal : animals) {
            System.out.println(animal.toString());
            System.out.printf("%s %d %s%n", animal.getName(), animal.getAge(), animal.getGender());
            System.out.println(animal.produceSound());
        }
    }

    private static void addAnimalToList(Animal animal, List<Animal> animals) {
        if (animal.getAge()>=0 && !animal.getGender().isEmpty() && !animal.getName().isEmpty()){
            animals.add(animal);
        }
    }
}
