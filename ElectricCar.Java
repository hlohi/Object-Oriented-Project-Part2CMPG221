
class ElectricCar extends Car {
    private double batteryCapacity;

    public ElectricCar(String make,String model, int year, double batteryCapacity){
          super(make, model, year);
          this.batteryCapacity = batteryCapacity;
    }
    
    public double getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(double batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
    
    @Override
    public double calculateRange() {
        // Estimate range based on battery capacity (simple assumption: 5 km per kWh)
        return batteryCapacity * 5;
    }

    @Override
    public double getTopSpeed() {
        return 180.0; // Default or assumed value
    }

    @Override
    public String toString() {
        return super.toString() +
               " [Battery Capacity: " + batteryCapacity + "kWh]";
    }
}
