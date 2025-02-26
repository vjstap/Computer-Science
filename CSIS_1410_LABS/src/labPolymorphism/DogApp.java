package labPolymorphism;
/**
 * @author CSIS + vincentstapley
 */
public class DogApp
{	
	/**
	 * Main method where we create Dog objects and push each object into an array and print them out
	 * Also differntiating between SledDogs and non-SledDogs in the array and using the pullSled method if the Dog is a SledDog
	 * @param args
	 */
    public static void main(String[] args)
    {
        Dog myDog = new Dog("Greyhound");
        System.out.println(myDog);
        actAsDog(myDog);

        SledDog mySledDog = new SledDog("Husky");
        System.out.println(mySledDog);
        actAsDog(mySledDog);

        CircusDog myCircusDog = new CircusDog("Terrier");
        System.out.println(myCircusDog);
        actAsDog(myCircusDog);
        
        System.out.println("Using an Array:\n");
        Dog[] dogArray = {myDog, mySledDog, myCircusDog};
        for(Dog dog : dogArray) {
        	System.out.println(dog);
        	if(dog instanceof SledDog) {
        		((SledDog) dog).pullSled();
        	}
        	actAsDog(dog);
        }
    }
    /**
     * Method that runs the Dog object with other methods such as communicate and move.
     * @param d dog breed from constructor
     */
    private static void actAsDog(Dog d)
    {
        d.communicate();
        d.move();
        System.out.println();
    }
}
