package lesson4.task7;

/*
7. Start with a base class of a Vehicle, then create a Car class that inherits from this base class.
Finally, create another class, a specific type of Car that inherits from the Car class.
You should be able to hand steering, changing gears, and moving(speed in other words).
You will want to decide where to put the appropriate state and behaviours(fields and methods).
As mentioned above, changing gears, increasing/decreasing speed should be included.
For you specific type of vehicle you will want to add something specific for that type of car.
 */

public class Vehicle {
    private String name;
    private String size;
    private int currentVelocity;
    private int currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public void steer(int direction) {
        this.currentDirection += direction;
        System.out.println("Vehicle.steer(): Steering at " + currentDirection + "degrees.");
    }
    public void move(int velocity, int direction){
        currentVelocity = velocity;
        currentDirection = direction;
        System.out.println("The " + getClass().getSimpleName()+ " moving at " + currentVelocity + " in direction " + currentDirection);

    }

    public void changeGear (Gears gear){
        System.out.println("The gear was successfully changed on " + gear);
    }

    public int descreaseVelocity (int velocity) {
        if (currentVelocity == 0) {
            System.out.println("Current velocity is 0");
        }
        return currentVelocity -= velocity;
    }

    public int increaseVelocity (int velocity){
        return currentVelocity += velocity;
    }


    public void stop(){
        this.currentVelocity = 0;

    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}

