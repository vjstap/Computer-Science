package recursion;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HarmonicTest {
    private static final double DELTA = 1e-9;

	@Test
	void harmonic_PositiveNumber() {
		assertEquals(1.0 + 0.5 + 0.333333333 + 0.25, Recursion.harmonic(4), DELTA);
	}
	@Test
	void harmonic_NegativeNumber() {
		assertEquals(-1.0 - 0.5 - 0.333333333 - 0.25, Recursion.harmonic(-4), DELTA);
	}
	@Test
	void harmonic_One() {
		assertEquals(1.0, Recursion.harmonic(1), DELTA);
	}
	@Test
	void harmonic_Zero() {
		assertThrows(IllegalArgumentException.class, () -> {Recursion.harmonic(0);});
	}
	@Test
	void harmonic_BigNumber() {
		assertEquals(1.0 + 0.5 + 0.333333333 + 0.25 + 0.2 + 0.166666667 + 0.142857143 + 0.125 + 0.111111111 + 0.1, Recursion.harmonic(10), DELTA);
	}
}
