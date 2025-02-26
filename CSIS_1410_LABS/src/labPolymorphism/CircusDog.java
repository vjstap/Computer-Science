package labPolymorphism;
/**
 * @author CSIS + vincentstapley
 */
public class CircusDog extends Dog
{
	/**
	 * Constructor for creating Object Dog that is specifically a CircusDog
	 * @param b parameter inherited from Dog superclass for breed
	 */
    public CircusDog(String b)
    {
        super(b);
    }
    /**
     * Overrides Dog's walk method which outputs "run" with "tightrope walking"
     */
    @Override
    public void move()
    {
        System.out.println("tightrope walking");
    }
}
