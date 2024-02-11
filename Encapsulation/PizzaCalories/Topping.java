public class Topping {
  
    private String toppingType;
    private double weight;
  
    public Topping(String toppingType, double weight) {
        setToppingType(toppingType);
        setWeight(weight);
    }
    private void setToppingType(String toppingType) {
        if (toppingType.equals("Meat") || toppingType.equals("Veggies") || toppingType.equals("Cheese") || toppingType.equals("Sauce")) {
            this.toppingType = toppingType;
        } else {
            throw new IllegalStateException("Cannot place " + toppingType + " on top of your pizza.");
        }
    }
    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 50) {
            this.weight = weight;
        } else {
            throw new IllegalStateException(this.toppingType + "weight should be in the range [1..50].");
        }
    }
    public double calculateCalories() {
        double toppingModifier = 0;
        switch (this.toppingType) {
            case ("Meat") -> toppingModifier = 1.2;
            case ("Veggies") -> toppingModifier = 0.8;
            case ("Cheese") -> toppingModifier = 1.1;
            case ("Sauce") -> toppingModifier = 0.9;
        }
        return (2 * this.weight) * toppingModifier;
    }
}
