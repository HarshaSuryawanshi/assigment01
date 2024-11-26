package assignmentNo_3;

public abstract class Vehicle_9 {
	    // Common properties for all vehicles
	    protected String make;
	    protected String model;
	    protected int year;
	    protected String fuelType;

	    // Constructor to initialize the properties
	    public Vehicle_9(String make, String model, int year, String fuelType) {
	        this.make = make;
	        this.model = model;
	        this.year = year;
	        this.fuelType = fuelType;
	    }

	    // Abstract method for calculating fuel efficiency
	    public abstract double calculateFuelEfficiency();  // miles per gallon (MPG)

	    // Abstract method for calculating maximum speed
	    public abstract double calculateMaxSpeed();  // in miles per hour (mph)

	    // Method to calculate distance traveled
	    public double calculateDistanceTraveled(double fuelAmount) {
	        return calculateFuelEfficiency() * fuelAmount;
	    }

	    // Display vehicle information
	    public void displayInfo() {
	        System.out.println("Make: " + make);
	        System.out.println("Model: " + model);
	        System.out.println("Year: " + year);
	        System.out.println("Fuel Type: " + fuelType);
	    }
	}

	
