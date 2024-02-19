public class Human implements Buyer {
  
    private String name;
    private int age;
    private int food;

    public Human(String name, int age) {
        this.name = name;
        this.age = age;
        this.food = 0;
    }
  
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setFood(int food) {
        this.food = food;
    }
  
    @Override
    public void buyFood() {}
    public int getFood() {
        return food;
    }
}
