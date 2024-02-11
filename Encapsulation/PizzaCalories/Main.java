import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] nameAndToppingsCount = scanner.nextLine().split(" ");
        String pizzaName = nameAndToppingsCount[1];
        int toppingsCount = Integer.parseInt(nameAndToppingsCount[2]);

        Pizza pizza = new Pizza(pizzaName, toppingsCount);

        String [] doughSpecifications = scanner.nextLine().split(" ");
        String flourType = doughSpecifications[1];
        String bakingTechnique = doughSpecifications[2];
        double doughWeightInGrams = Double.parseDouble(doughSpecifications[3]);

        Dough dough = new Dough(flourType, bakingTechnique, doughWeightInGrams);
        pizza.setDough(dough);

        String toppingsInput = scanner.nextLine();

        while (!toppingsInput.equals("END")){
            String [] toppingSpecifications = toppingsInput.split(" ");
            String toppingType = toppingSpecifications[1];
            double toppingWeightInGrams = Double.parseDouble(toppingSpecifications[2]);

            Topping currentTopping = new Topping(toppingType, toppingWeightInGrams);
            pizza.addTopping(currentTopping);
            toppingsInput = scanner.nextLine();
        }
        System.out.printf("%s - %.2f", pizza.getName(), pizza.getOverallCalories());
    }
}
