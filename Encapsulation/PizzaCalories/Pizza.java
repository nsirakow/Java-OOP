import java.util.ArrayList;
import java.util.List;

public class Pizza {

    private String name;
    private Dough dough;
    private List<Topping> toppings;
  
    public Pizza(String name, int numberOfToppings) {
        setName(name);
        setToppings(numberOfToppings);
    }
    private void setToppings(int numberOfToppings) {
        toppings = new ArrayList<>();
        if(numberOfToppings<0 || numberOfToppings>10){
            throw new IllegalStateException("Number of toppings should be in range [0..10]");
        }
    }
    private void setName(String name) {
        if (name.isEmpty() || name.length() > 15) {
            throw new IllegalStateException("Pizza name should be between 1 and 15 symbols");
        } else {
            this.name = name;
        }
    }
    public void setDough(Dough dough) {
        this.dough = dough;
    }
    public String getName() {
        return name;
    }
    public void addTopping(Topping topping) {
        if (toppings.size() + 1 <= 0 || toppings.size() + 1 > 10) {
            throw new IllegalStateException("Number of toppings should be in range [0..10]");
        } else {
            toppings.add(topping);
        }
    }
    public double getOverallCalories() {
        double sumAllToppings = 0;

        for (Topping topping : toppings) {
            sumAllToppings += topping.calculateCalories();
        }
        return sumAllToppings + dough.calculateCalories();
    }
}
