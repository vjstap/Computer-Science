package recursion;

/**
 * @author vincentstapley
 * 
 */
public class Recursion {
	/**
	 * Returns the sum of each of the digits, also makes the output non-negative
	 * @param n digit that is being split into each individual digit that comprises it
	 * @return returns total of every digit in n
	 */
	public static int sumOfDigits(int n) {
		int total =  0;
		if(n < 0) {
			n = n * -1;
		}
		while(n > 0) {
			total += (n % 10);
			n /= 10;
		}
		return total;
	}
	public static String toUpper(String str) {
		str.toUpperCase();
		for(int i = 0; i < str.length(); i++) {
			
		}
		//TODO This method separates all characters by a space and changes all lowercase letters to uppercase letters.
	}
	public static int countSmiles(char[] letters, int index) {
		//TODO This method counts the number of colons followed by a closing parenthesis starting at the specified index.
		//An empty character array should return 0.
	}
	public static double harmonic(int n) {
		//TODO
		/*
		 * If n is positive, the method should return the n-th harmonic number, which is calculated like this:  1/1 + 1/2 + 1/3 + ... + 1/n.
		 *	If n is negative, the method should return the additive inverse of the n-th harmonic number.
		 *	If n is zero, an IllegalArgumentException should be thrown.
		 */
		if(n == 0) {
			throw new IllegalArgumentException("The argument n can't be zero.");
		}
		if(n == 1) {
			return 1;
		} else if(n < 0) {
			return -1 * harmonic(-n);
		} else {
			return 1.0/n + harmonic(n-1);
		}
	}
}
