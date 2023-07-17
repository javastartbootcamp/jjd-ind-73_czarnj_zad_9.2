package pl.javastart.task;

public class Truck extends Car {
    private static final double ADDITIONAL_FUEL_USAGE_FOR_LOAD = 0.5;
    private double loadWeight;

    public Truck(String name, double capacity, double avgFuelUsage, boolean isAirConditionerOn, double loadWeight) {
        super(name, capacity, avgFuelUsage, isAirConditionerOn);
        this.loadWeight = loadWeight;
    }

    @Override
    protected double getFinalFuelUsage() {
        double fuelUsageWithLoad = ADDITIONAL_FUEL_USAGE_FOR_LOAD * loadWeight / PER_100;
        if (isAirConditionerOn) {
            return avgFuelUsage + fuelUsageWithLoad + ADDITIONAL_FUEL_USAGE_WITH_AIR_CONDITIONER;
        }
        return avgFuelUsage + fuelUsageWithLoad;
    }

    @Override
    public String getInfo() {
        return String.format("%s Weight of load: %.2f", super.getInfo(), loadWeight);
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }
}
