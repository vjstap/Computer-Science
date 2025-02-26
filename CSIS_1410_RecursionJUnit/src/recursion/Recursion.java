package recursion;

/**
 * @author vincentstapley
 * 
 */
public class Recursion {
	/**
	 * Returns the sum of each of the digits, also makes the output non-negative
	 * 
	 * @param n digit that is being split into each individual digit that comprises it
	 * @return returns total of every digit in n
	 */
	public static int sumOfDigits(int n) {
		int total = 0;
		if (n < 0) {
			n = n * -1;
		}
		while (n > 0) {
			total += (n % 10);
			n /= 10;
		}
		return total;
	}
	/**
	 * Returns the original string with a space in between each character, including spaces
	 * @param str string input spaces will be appended into
	 * @return returns the string with " " between each character
	 */
	public static String toUpper(String str) {
		str = str.toUpperCase();
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < str.length(); i++) {
			sb.append(str.charAt(i));
			if (i < str.length() - 1) {
				sb.append(" ");
			}
		}
		return sb.toString();
	}
	/**
	 * 
	 * @param letters
	 * @param index
	 * @return
	 */
	public static int countSmiles(char[] letters, int index) {
		if (letters == null || letters.length < 2 || index < 0 || index >= letters.length - 1) {
			return 0;
		}

		int count = 0;
		for (int i = index; i < letters.length - 1; i++) {
			if (letters[i] == ':' && letters[i + 1] == ')') {
				count++;
			}
		}

		return count;
	}

	public static double harmonic(int n) {
		if (n == 0) {
			throw new IllegalArgumentException("The argument n can't be zero.");
		}
		if (n == 1) {
			return 1;
		} else if (n < 0) {
			return -1 * harmonic(-n);
		} else {
			return 1.0 / n + harmonic(n - 1);
		}
	}
}
