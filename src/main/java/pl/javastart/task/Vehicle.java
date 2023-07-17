package pl.javastart.task;

public class Vehicle {
    protected static final int PER_100 = 100;
    protected String name;
    protected double capacity;
    protected double avgFuelUsage;

    public Vehicle(String name, double capacity, double avgFuelUsage) {
        this.name = name;
        this.capacity = capacity;
        this.avgFuelUsage = avgFuelUsage;
    }

    public double calculateRange() {
        return PER_100 * capacity / getFinalFuelUsage();
    }

    protected double getFinalFuelUsage() {
        return avgFuelUsage;
    }

    public String getInfo() {
        return String.format("Name: %s Capacity: %.2f Average fuel usage: %.2f", name, capacity, avgFuelUsage);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getAvgFuelUsage() {
        return avgFuelUsage;
    }

    public void setAvgFuelUsage(double avgFuelUsage) {
        this.avgFuelUsage = avgFuelUsage;
    }
}
