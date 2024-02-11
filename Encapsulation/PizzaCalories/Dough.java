public class Dough {
  
    private String flourType;
    private String bakingTechnique;
    private double weight;
  
    public Dough(String flourType, String bakingTechnique, double weight) {
        setFlourType(flourType);
        setBakingTechnique(bakingTechnique);
        setWeight(weight);
    }
    private void setWeight(double weight) {
        if (weight >= 1 && weight <= 200) {
            this.weight = weight;
        } else {
            throw new IllegalStateException("Dough weight should be in the range [1..200]");
        }
    }
    private void setFlourType(String flourType) {
        if (flourType.equals("White") || flourType.equals("Wholegrain")) {
            this.flourType = flourType;
        } else {
            throw new IllegalStateException("Invalid type of dough.");
        }
    }
    private void setBakingTechnique(String bakingTechnique) {
        if (bakingTechnique.equals("Crispy") || bakingTechnique.equals("Chewy") || bakingTechnique.equals("Homemade")) {
            this.bakingTechnique = bakingTechnique;
        } else {
            throw new IllegalStateException("Invalid type of dough.");
        }
    }
    public double calculateCalories() {

        double flourModifier = 0;
        switch (flourType) {
            case ("White") -> flourModifier = 1.5;
            case ("Wholegrain") -> flourModifier = 1.0;
        }
        double bakingModifier=0;
        switch (bakingTechnique) {
            case ("Crispy") -> bakingModifier = 0.9;
            case ("Chewy") -> bakingModifier = 1.1;
            case ("Homemade") -> bakingModifier = 1.0;
        }
        return (2*this.weight)*flourModifier*bakingModifier;
    }
}
