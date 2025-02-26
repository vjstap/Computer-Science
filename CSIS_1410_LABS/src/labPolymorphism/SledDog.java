package labPolymorphism;
/**
 * @author CSIS + vincentstapley
 */
public class SledDog extends Dog
{
	/**
	 * Constructor for creating Object Dog that is specifically a SledDog
	 * @param b parameter inherited from Dog superclass for breed
	 */
    public SledDog(String b)
    {
        super(b);
    }
    /**
     * Method for SledDog to pull a sled, outputs "pulling the sled"
     */
    public void pullSled()
    {
        System.out.println("pulling the sled");
    }
}
