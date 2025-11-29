public abstract class Car implements Comparable<Car> {
    
    private String make;
    private String model;
    private int year;

    public Car(String make, String model, int year) {
        // initialise instance variables
        this.make = make;
        this.model = model;
        this.year = year;
    }
    
    public String getMake(){
       return make;
    }
    
    public void setMake(String make){
       this.make = make;
    }
    
    public String getModel(){
       return model;
    }
    
    public void setModel(String model){
       this.model = model;
    }
    
    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    public abstract double calculateRange();
    
    public abstract double getTopSpeed();

    @Override
    public int compareTo(Car other) {
        // Sort firstly by year (ascending)
        if (this.year != other.year) {
            return Integer.compare(this.year, other.year);
        }
        // If years are equal, sort alphabetically by make
        return this.make.compareTo(other.make);
    }

    @Override
    public String toString(){
       return make + " " + model + " (" + year + ")";
    }
}
