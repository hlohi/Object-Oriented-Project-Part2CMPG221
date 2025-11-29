import java.util.Random;
import java.util.Arrays;
public class TestCar {
    
    public static void main(String[] args) {
        int arraySize = 10; // Number of cars to generate
        Car[] cars = new Car[arraySize];
        Random rand = new Random();

        // Arrays of sample makes and models for random selection
        String[] electricMakes = {"Tesla", "Nissan", "Chevy"};
        String[] electricModels = {"Model S", "Leaf", "Bolt"};
        String[] sportsMakes = {"Ferrari", "Lamborghini", "Porsche"};
        String[] sportsModels = {"488 GTB", "Huracan", "911"};

        // Randomly create ElectricCar or SportsCar instances and store in array
        for (int i = 0; i < arraySize; i++) {
            boolean createElectric = rand.nextBoolean();

            if (createElectric) {
                String make = electricMakes[rand.nextInt(electricMakes.length)];
                String model = electricModels[rand.nextInt(electricModels.length)];
                int year = 2010 + rand.nextInt(14); // years 2010 to 2023
                double batteryCapacity = 50 + rand.nextDouble() * 100; // 50 - 150 kWh
                
                cars[i] = new ElectricCar(make, model, year, batteryCapacity);
            } else {
                String make = sportsMakes[rand.nextInt(sportsMakes.length)];
                String model = sportsModels[rand.nextInt(sportsModels.length)];
                int year = 2010 + rand.nextInt(14);
                double topSpeed = 250 + rand.nextDouble() * 150; // 250-400 km/h
                double zeroToHundred = 2 + rand.nextDouble() * 4; // 2-6 seconds
                boolean launchControl = rand.nextBoolean();
                
                cars[i] = new SportsCar(make, model, year, topSpeed, zeroToHundred, launchControl);
            }
        }
        
          System.out.println(" Unsorted Cars ");
        for (Car c : cars) {
            System.out.println(c);
        }

        // Sort Cars using Comparable (year, then make)
        Arrays.sort(cars);

        // Print sorted cars
        System.out.println("\n Sorted Cars");
        for (Car c : cars) {
            System.out.println(c);
        }
        
          // Complexity analysis outputs

        System.out.println("\n Time Complexity Analysis ");

        System.out.println("\n1. Detailed method tau-notation:");
        // Rough estimation based on:
        // - Creating N cars:  N * (fetch/store and method calls)
        // - Sorting: O(N log N), approximate (N log N) * tau cost per comparison
        // - Printing: O(N)
        System.out.println("Creating N cars:  N * (30Ï„) (includes fetches, stores, method calls, object creation)");
        System.out.println("Sorting N cars:  (N log N) * (10Ï„) (approximate comparisons and swaps)");
        System.out.println("Printing N cars:  N * (15Ï„)\n");

        System.out.println("Total tau-notation estimate: ");
        System.out.println(" N * 30Ï„ + (N log N) * 10Ï„ + N * 15Ï„");
        System.out.println(" (55 * N) + 10 * N log N (all in units of Ï„)");

        System.out.println("\n2. Simplified method (each Ï„ = 1)");

        System.out.println("Creating N cars:  30N");
        System.out.println("Sorting N cars:  10 N log N");
        System.out.println("Printing N cars:  15N");
        System.out.println("Total time units â‰ˆ 55N + 10 N log N");

        System.out.println("\n3. Asymptotic Analysis (Big O notation):");
        System.out.println("Overall time complexity: O(N log N) due to sorting dominating");
        System.out.println("Object creation and printing are O(N), sorting is O(N log N)");

        System.out.println("\nNote: Constants are illustrative based on typical object construction and sorting operation costs.");
    }
}
