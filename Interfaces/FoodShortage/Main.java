import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
      
        Scanner scanner = new Scanner(System.in);

        List<Human> humanList = new ArrayList<>();
        int numberOfPeople = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < numberOfPeople; i++) {
            Human human;
            String[] tokens = scanner.nextLine().split(" ");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            if (tokens.length == 3) {
                String group = tokens[2];
                human = new Rebel(name, age, group);
            } else {
                String id = tokens[2];
                String birthDate = tokens[3];
                human = new Citizen(name, age, id, birthDate);
            }
            humanList.add(human);
        }

        String input = scanner.nextLine();
        while (!input.equals("End")) {
            String humanBoughtFood = input;
            humanList.stream().filter(h -> h.getName().equals(humanBoughtFood)).forEach(Human::buyFood);
            input = scanner.nextLine();
        }
        Integer totalBoughtFood = humanList.stream().map(Human::getFood).reduce(Integer::sum).orElse(0);
        System.out.println(totalBoughtFood);
    }
}
