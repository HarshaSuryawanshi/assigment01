package assignmentNo_3;

public class MainVehicle_9{

		public static void main(String[] args) {
	        // Creating instances of Truck, Car, and Motorcycle
	        Vehicle_9 truck = new Truck_9("Ford", "F-150", 2023, "Gasoline", 2000);
	        Vehicle_9 car = new Car_9("Toyota","Camry",2022,"Hybrid",4);
	        Vehicle_9 motorcycle = new Motorcycle_9("Harley-Davidson", "Street 750", 2021, "Gasoline", false);
	        // Displaying information and calculating values
	        System.out.println("Truck Info:");
	        truck.displayInfo();
	        System.out.println("Fuel Efficiency: " + truck.calculateFuelEfficiency() + " MPG");
	        System.out.println("Max Speed: " + truck.calculateMaxSpeed() + " MPH");
	        System.out.println("Distance traveled with 10 gallons: " + truck.calculateDistanceTraveled(10) + " miles\n");

	        System.out.println("Car Info:");
	        car.displayInfo();
	        System.out.println("Fuel Efficiency: " + car.calculateFuelEfficiency() + " MPG");
	        System.out.println("Max Speed: " + car.calculateMaxSpeed() + " MPH");
	        System.out.println("Distance traveled with 10 gallons: " + car.calculateDistanceTraveled(10) + " miles\n");

	        System.out.println("Motorcycle Info:");
	        motorcycle.displayInfo();
	        System.out.println("Fuel Efficiency: " + motorcycle.calculateFuelEfficiency() + " MPG");
	        System.out.println("Max Speed: " + motorcycle.calculateMaxSpeed() + " MPH");
	        System.out.println("Distance traveled with 10 gallons: " + motorcycle.calculateDistanceTraveled(10) + " miles");
	  }
}