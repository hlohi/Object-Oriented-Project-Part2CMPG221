class SportsCar extends Car {
    private double topSpeed;
    private double zeroToHundred;
    private boolean launchControl;

    public SportsCar(String make, String model, int year,
                     double topSpeed, double zeroToHundred, boolean launchControl) {
        super(make, model, year);
        this.topSpeed = topSpeed;
        this.zeroToHundred = zeroToHundred;
        this.launchControl = launchControl;
    }
    
    public void setTopSpeed(double topSpeed) {
        this.topSpeed = topSpeed;
    }

    public double getZeroToHundred() {
        return zeroToHundred;
    }

    public void setZeroToHundred(double zeroToHundred) {
        this.zeroToHundred = zeroToHundred;
    }

    public boolean hasLaunchControl() {
        return launchControl;
    }

    public void setLaunchControl(boolean launchControl) {
        this.launchControl = launchControl;
    }
    
    @Override
    public double calculateRange() {
        return 400.0;
    }

    @Override
    public double getTopSpeed() {
        return topSpeed;
    }
    
    @Override
    public String toString() {
        return super.toString() +
               " [0â€“100 km/h: " + zeroToHundred + "s, Top Speed: " + topSpeed +
               " km/h, Launch Control: " + launchControl + "]";
    }
}
