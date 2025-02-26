package docComments;

/**
 * Test for TripPlanner and Car
 * @author VincentStapley
 * @version 1 01/27/2025
 */
public class TravelApp {

	public static void main(String[] args) {
		Car m4 = new Car("BMW", "M4", 25);
		Car civic = new Car("Honda", "Civic", 42);
		
		System.out.println("Cars:");
		System.out.println(m4.getMake() + " " + m4.getModel() + " " + m4.getMpg() + " mpg");
		System.out.println(civic.getMake() + " " + civic.getModel() + " " + civic.getMpg() + " mpg");
		
		TripPlanner california = new TripPlanner("SF", "LA", 382, m4);
		TripPlanner florida = new TripPlanner("Tampa", "Miami", 280, civic);
		
		System.out.printf("\nCalifornia Trip Information \n" + california.toString() + "\nfuel consumption: %.1f" + " gallons\n", california.fuelConsumption(m4));
		System.out.printf("\nFlorida Trip Information \n" + florida.toString() + "\nfuel consumption: %.1f" + " gallons", florida.fuelConsumption(civic));
	}
}
