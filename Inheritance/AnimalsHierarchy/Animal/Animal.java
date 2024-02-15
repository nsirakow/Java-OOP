package Animal;

public class Animal {

    private String name;
    private int age;
    private String gender;

    public Animal (String name, int age, String gender){
        setName(name);
        setAge(age);
        setGender(gender);
    }

    public String produceSound(){

        return null;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Invalid input!");
        }

        this.name = name;

    }

    public void setAge(int age) {
        if (age<=0){
            System.out.println("Invalid input!");}
        else {
        this.age = age;
    }
    }

    public void setGender(String gender) {
        if (gender.isEmpty()) {
            System.out.println("Invalid input!");        }
        else }
        this.gender = gender;
    }
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }
}
