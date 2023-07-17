package pl.javastart.task;

public class Main {

    public static void main(String[] args) {
        Car[] cars = new Car[3];
        Car c1 = new Car("Ford", 60, 7, false);
        Car c2 = new Car("Toyota", 50, 5, false);
        Truck t1 = new Truck("Mercedes", 400, 15, false, 10_000);
        cars[0] = c1;
        cars[1] = c2;
        cars[2] = t1;

        showVehicles(cars);
        turnAirConditionerOnForAllVehicles(cars);
        showVehicles(cars);
    }

    public static void showVehicles(Car[] cars) {
        for (Car car : cars) {
            System.out.printf("%s Zasięg: %.2f%n", car.getInfo(), car.calculateRange());
        }
    }

    public static void turnAirConditionerOnForAllVehicles(Car[] cars) {
        for (Car car : cars) {
            car.setAirConditionerOn(true);
        }
    }
}
