package docComments;

/**
 * A planner for trips including departure, arrival, and distance
 * @author VincentStapley
 * @version 1 01/27/2025
 */

public class TripPlanner {
	private String departure; //Starting point of trip
	private String arrival; //Ending point of trip
	private int distance; //Distance of the trip
	private Car car; //Car used for trip
	
	/**
	 * Constructor for TripPlanner
	 * @param departure the location where trip starts
	 * @param arrival the location where trip ends
	 * @param distance the distance between departure and arrival
	 * @param car the car used to travel distance
	 */
	public TripPlanner(String departure, String arrival, int distance, Car car) {
		this.departure = departure;
		this.arrival = arrival;
		this.distance = distance;
		this.car = car;
	}
	
	/**
	 * Calculates the fuel consumption of the car on the trip
	 * @param car the car used for the trip
	 * @return the amount of fuel that will be consumed on trip
	 */
	public double fuelConsumption(Car car) {
		return (double) distance / car.getMpg();
	}
	
	/**
	 * Turns TripPlanner info into string
	 * @param string with departure, arrival, and distance
	 */
	public String toString() {
		return "TripPlanner [departure=" + departure + ", arrival=" + arrival + ", distance=" + distance + ", car= " + car.getModel() +"]";
	}
}
