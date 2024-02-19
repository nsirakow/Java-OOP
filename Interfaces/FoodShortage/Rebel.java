public class Rebel extends Human {
  
    private String group;

    public Rebel(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }
  
    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 5);
    }
  
    @Override
    public int getFood() {
        return super.getFood();
    }
}
