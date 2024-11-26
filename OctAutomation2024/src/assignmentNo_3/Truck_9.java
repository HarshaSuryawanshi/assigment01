package assignmentNo_3;

public class Truck_9 extends Vehicle_9{

	 private double payloadCapacity;  // in pounds

	    public Truck_9(String make, String model, int year, String fuelType, double payloadCapacity) {
	        super(make, model, year, fuelType);
	        this.payloadCapacity = payloadCapacity;
	    }

	    // Calculate fuel efficiency for Truck (miles per gallon)
	    public double calculateFuelEfficiency() {
	        return 15;  // Example: trucks typically have lower fuel efficiency
	    }

	    // Calculate maximum speed for Truck (miles per hour)
	    @Override
	    public double calculateMaxSpeed() {
	        return 100;  // Example: maximum speed for trucks
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Payload Capacity: " + payloadCapacity + " lbs");
	    }
}
