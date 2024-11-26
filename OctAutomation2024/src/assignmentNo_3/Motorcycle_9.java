package assignmentNo_3;

public class Motorcycle_9 extends Vehicle_9{

	   private boolean hasSidecar;

	    public Motorcycle_9(String make, String model, int year, String fuelType, boolean hasSidecar) {
	        super(make, model, year, fuelType);
	        this.hasSidecar = hasSidecar;
	    }

	    // Calculate fuel efficiency for Motorcycle (miles per gallon)
	    @Override
	    public double calculateFuelEfficiency() {
	        return 50;  // Example: motorcycles are more fuel-efficient than cars or trucks
	    }

	    // Calculate maximum speed for Motorcycle (miles per hour)
	    @Override
	    public double calculateMaxSpeed() {
	        return 160;  // Example: maximum speed for motorcycles
	    }

	    @Override
	    public void displayInfo() {
	        super.displayInfo();
	        System.out.println("Has Sidecar: " + (hasSidecar ? "Yes" : "No"));
	    }
}
