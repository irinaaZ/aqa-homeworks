package lesson4.task7;

public class VehicleApp {
    public static void main(String[] args) {
        Car car = new Car("Pegeot", "2830", 2018,60);
        SportCar sportCar = new SportCar("Mazda","3000",2019,66, "blue");
        Vehicle vehicle = new Vehicle("Audi","9999");

        car.increasePetrolLevel(40);
        car.move(32,2);
        sportCar.changeColor(Colors.BLUE);
        vehicle.descreaseVelocity(33);
        car.changeGear(Gears.SECOND);
    }
}
