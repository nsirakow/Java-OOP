public class Citizen extends Human {
  
    private String id;
    private String birthDate;

    public Citizen(String name, int age, String id, String birthDate) {
        super(name, age);
        this.id = id;
        this.birthDate = birthDate;
    }
  
    @Override
    public String getName() {
        return super.getName();
    }
  
    @Override
    public int getAge() {
        return super.getAge();
    }
  
    @Override
    public void buyFood() {
        super.setFood(super.getFood() + 10);
    }
  
    @Override
    public int getFood() {
        return super.getFood();
    }
}
