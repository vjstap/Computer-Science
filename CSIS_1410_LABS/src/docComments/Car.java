package docComments;

/**
 * Car that is going to be used for calculations in TripPlanner
 * @author VincentStapley
 * @version 1 01/27/2025
 */

public class Car {
	private String make; //Make of the car
	private String model; //Model of the car
	private int mpg; //Miles per gallon of the car

	/**
	 * Constructor for car with make, model, and mpg
	 * @param make the make of the car
	 * @param model the model of the car
	 * @param mpg the miles per gallon of the car
	 */
	public Car(String make, String model, int mpg) {
		this.make = make;
		this.model = model;
		this.mpg = mpg;
	}
	
	/**
	 * Returns the make of the car
	 * @return the make of the car
	 */
	public String getMake() {
		return this.make;
	}
	/**
	 * Returns the model of the car
	 * @return the model of the car
	 */
	public String getModel() {
		return this.model;
	}
	/**
	 * Returns the miles per gallon of the car
	 * @return the miles per gallon of the car
	 */
	public int getMpg() {
		return this.mpg;
	}
}
