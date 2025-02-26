package labPolymorphism;
/**
 * @author vincentstapley CSIS + vincentstapley
 */
public class Dog
{
    private final String breed; //Final string for dog breed
    
    /**
     * Constructor for creating Object dog
     * @param b breed for dog
     */
    public Dog(String b)
    {
        breed = b;
    }
    /**
     * Method for Dog to communicate, outputs "bark bark"
     */
    public void communicate()
    {
        System.out.println("bark bark");
    }
    /**
     * Method for Dog to move, outputs "run"
     */
    public void move()
    {
        System.out.println("run");
    }
    /**
     * Getter method that retreives dogs breed
     * @return returns dog breed
     */
    public String getBreed()
    {
        return breed;
    }
    @Override
    public String toString() {
    	return this.getClass().getSimpleName() + ": " + this.getBreed();
    }
}
