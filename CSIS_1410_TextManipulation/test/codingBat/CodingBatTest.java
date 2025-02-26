package codingBat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class CodingBatTest {

	@Order(1)
	@Test
	void wordEnds_abcXY123XYijk_ShouldReturn_c13i() {
		assertEquals("c13i", CodingBat.wordEnds("abcXY123XYijk", "XY"));
	}
	@Order(2)
	@Test
	void wordEnds_XY123XY_ShouldReturn_13() {
		assertEquals("13", CodingBat.wordEnds("XY123XY", "XY"));
	}
	@Order(3)
	@Test
	void wordEnds_XY1XY_ShouldReturn_11() {
		assertEquals("11", CodingBat.wordEnds("XY1XY", "XY"));
	}
	@Order(4)
	@Test
	void wordEnds_XYXY_ShouldReturn_XY() {
		assertEquals("XY", CodingBat.wordEnds("XYXY", "XY"));
	}
	@Order(5)
	@Test
	void wordEnds_XY_ShouldReturn_EmptyString() {
		assertEquals("", CodingBat.wordEnds("XY", "XY"));
	}
	@Order(6)
	@Test
	void wordEnds_Hi_ShouldReturn_EmptyString() {
		assertEquals("", CodingBat.wordEnds("Hi", "XY"));
	}
	@Order(7)
	@Test
	void wordEnds_EmptyString_ShouldReturn_EmptyString() {
		assertEquals("", CodingBat.wordEnds("", "XY"));
	}
	@Order(8)
	@Test
	void wordEnds_abc1xyz1i1j_ShouldReturn_cxziij() {
		assertEquals("cxziij", CodingBat.wordEnds("abc1xyz1i1j", "1"));
	}
	@Order(9)
	@Test
	void wordEnds_abc1xyz1_ShouldReturn_cxz() {
		assertEquals("cxz", CodingBat.wordEnds("abc1xyz1", "1"));
	}
	@Order(10)
	@Test
	void wordEnds_abc1xyz11_ShouldReturn_cxz11() {
		assertEquals("cxz11", CodingBat.wordEnds("abc1xyz11", "1"));
	}
	@Order(11)
	@Test
	void wordEnds_abc1xyz1abc_ShouldReturn_11() {
		assertEquals("11", CodingBat.wordEnds("abc1xyz1abc", "abc"));
	}
	@Order(12)
	@Test
	void wordEnds_abc1xyz1abc_ShouldReturn_acac() {
		assertEquals("acac", CodingBat.wordEnds("abc1xyz1abc", "b"));
	}
	@Order(13)
	@Test
	void wordEnds_abc1abc1abc_ShouldReturn_1111() {
		assertEquals("1111", CodingBat.wordEnds("abc1abc1abc", "abc"));
	}
}
