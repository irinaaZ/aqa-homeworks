package lesson4.task7;

public class SportCar extends Car {
    private String color;
    private int currentVelocity;
    private int currentDirection;

    public SportCar(String name, String size, int year, int petrolLevel,String color) {
        super(name, size, year, petrolLevel);
        this.color = color;
        this.currentVelocity = 0;
        this.currentDirection = 0;
    }

    public String getColor() {
        return color;
    }

    public void changeColor(Colors newColor){
        System.out.println("The color of the car was changed on " + newColor);
        color = newColor.toString();
    }
}
