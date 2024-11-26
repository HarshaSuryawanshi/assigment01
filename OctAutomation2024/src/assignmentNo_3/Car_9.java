package assignmentNo_3;

public class Car_9 extends Vehicle_9 {

	   private int numDoors;

	    public Car_9(String make, String model, int year, String fuelType, int numDoors) {
	        super(make, model, year, fuelType);
	        this.numDoors = numDoors;
	    }

	    // Calculate fuel efficiency for Car (miles per gallon)
	    @Override
	    public double calculateFuelEfficiency() {
	        return 25;  // Example: cars generally have better fuel efficiency than trucks
	    }

	    // Calculate maximum speed for Car (miles per hour)
	    @Override
	    public double calculateMaxSpeed() {
	        return 120;  // Example: average maximum speed for cars
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Number of Doors: " + numDoors);
	    }
}
