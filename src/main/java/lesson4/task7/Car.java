package lesson4.task7;

public class Car extends Vehicle {
    private int petrolLevel;
    private int year;
    private int currentVelocity;
    private int currentDirection;

    public Car(String name, String size, int year, int petrolLevel) {
        super(name, size);
        this.year = year;
        this.currentVelocity = 0;
        this.currentDirection = 0;
        this.petrolLevel = petrolLevel;
    }

    public int getPetrolLevel() {
        return petrolLevel;
    }

    public void increasePetrolLevel (int level){
        if ((petrolLevel - level) < 0) {
            System.out.println("You have entered too large amount of level, try again");
        } else {
            System.out.println("The petrol level was successfully increased");
            petrolLevel += level;
        }
    }

    @Override
    public void move(int velocity, int direction){
        if (petrolLevel > 0) {
            currentVelocity = velocity;
            currentDirection = direction;
            petrolLevel -= 20;
            System.out.println("The " + getClass().getSimpleName()+ " moving at " + currentVelocity + " in direction " + currentDirection);
        } else {
            System.out.println("The petrol level is out, please recharge");
        }
    }
}
