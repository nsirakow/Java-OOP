public class Player {
  
    private String name;
    private int endurance;
    private int sprint;
    private int dribble;
    private int passing;
    private int shooting;

    public Player (String name, int endurance, int sprint, int dribble, int passing, int shooting){
        setName(name);
        setEndurance(endurance);
        setSprint(sprint);
        setDribble(dribble);
        setPassing(passing);
        setShooting(shooting);
    }
  
    private void setName(String name) {
        if (!name.isEmpty()){
            this.name = name;}
        else {
            System.out.println("A name should not be empty.");
        }
    }
    public String getName() {
        return name;
    }
    public void setEndurance(int endurance) {
        if (statIsInRange(endurance)){
            this.endurance = endurance;
        }
        else {
            System.out.println("Endurance should be between 0 and 100.");
        }
    }
    public void setSprint(int sprint) {
        if (statIsInRange(sprint)){
            this.sprint = sprint;}
        else {
            System.out.println("Spring should be between 0 and 100.");
        }
    }
    public void setDribble(int dribble) {
        if (statIsInRange(dribble)){
            this.dribble = dribble;}
        else {
            System.out.println("Dribble should be between 0 and 100.");
        }
    }
    public void setPassing(int passing) {
        if (statIsInRange(passing)){
            this.passing = passing;}
        else {
            System.out.println("Passing should be between 0 and 100");
        }
    }
    public void setShooting(int shooting) {
        if (statIsInRange(shooting)){
            this.shooting = shooting;
        }
        else {
            System.out.println("Shooting should be between 0 and 100.");
        }
    }
    public double overallSkillLevel (){
        return (double) (this.endurance + this.sprint + this.dribble + this.passing + this.shooting) /5;
    }
    private boolean statIsInRange (int stat){
        if (stat<0 || stat>100){
            return false;
        }
        return true;
    }
    public int getDribble() {
        return dribble;
    }
    public int getEndurance() {
        return endurance;
    }
    public int getPassing() {
        return passing;
    }
    public int getShooting() {
        return shooting;
    }
    public int getSprint() {
        return sprint;
    }
}
