package pl.javastart.task;

public class Car extends Vehicle {
    protected static final double ADDITIONAL_FUEL_USAGE_WITH_AIR_CONDITIONER = 0.8;
    protected boolean isAirConditionerOn;

    public Car(String name, double capacity, double avgFuelUsage, boolean isAirConditionerOn) {
        super(name, capacity, avgFuelUsage);
        this.isAirConditionerOn = isAirConditionerOn;
    }

    @Override
    protected double getFinalFuelUsage() {
        if (isAirConditionerOn) {
            return avgFuelUsage + ADDITIONAL_FUEL_USAGE_WITH_AIR_CONDITIONER;
        }
        return avgFuelUsage;
    }

    @Override
    public String getInfo() {
        return String.format("%s Is air conditioner on: %b", super.getInfo(), isAirConditionerOn);
    }

    public boolean isAirConditionerOn() {
        return isAirConditionerOn;
    }

    public void setAirConditionerOn(boolean airConditionerOn) {
        isAirConditionerOn = airConditionerOn;
    }
}
