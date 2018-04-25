package core.HW_32_abc;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CalcTest {

	/*** Add tests ***/
	@Test
	public void test_add_1() {
		assertEquals("Not correct", add(60.0, 5.0), 65.0, 0.09);
	}

	@Test
	public void test_add_2() {
		assertEquals("Not correct", add(1.0, 1.0, 1.0), 3.0, 0.09);
	}

	@Test
	public void test_add_3() {
		assertEquals("Not correct", add(99.0, 1.0, 11.0, 40.0), 151.0, 0.09);
	}

	/*** Subtract tests ***/
	@Test
	public void test_subtract_1() {
		assertEquals("Not correct", subtract(100.0, 22.0), 78.0, 0.09);
	}

	@Test
	public void test_subtract_2() {
		assertEquals("Not correct", subtract(10.0, 10.0, 76.0), -76.0, 0.09);
	}

	@Test
	public void test_subtract_3() {
		assertEquals("Not correct", subtract(55.0, 5.0, 10.0, 7.0), 33.0, 0.09);
	}

	/*** Multiply tests ***/
	@Test
	public void test_multiply_1() {
		assertEquals("Not correct", multiply(2.0, 2.0), 4.0, 0.09);
	}

	@Test
	public void test_multiply_2() {
		assertEquals("Not correct", multiply(2.0, 2.0, 4.0), 16.0, 0.09);
	}

	@Test
	public void test_multiply_3() {
		assertEquals("Not correct", multiply(3.0, 2.0, 4.0, 2.0), 48.0, 0.09);
	}

	/*** Divide tests ***/
	@Test
	public void test_divide_1() {
		assertEquals("Not correct", divide(90.0, 7.0), 12.9, 0.09);
	}

	@Test
	public void test_divide_2() {
		assertEquals("Not correct", divide(4545.0, 33.0, 98765.0), 0.001, 0.009);
	}

	@Test
	public void test_divide_3() {
		assertEquals("Not correct", divide(9999.0, 23.0, 43.0, 54.0), 0.18, 0.09);
	}

	static double divide(double a, double b) {
		return a / b;
	}

	static double divide(double a, double b, double c) {
		return a / b / c;
	}

	static double divide(double a, double b, double c, double d) {
		return a / b / c / d;
	}

	static double add(double a, double b) {
		return a + b;
	}

	static double add(double a, double b, double c) {
		return a + b + c;
	}

	static double add(double a, double b, double c, double d) {
		return a + b + c + d;
	}

	static double subtract(double a, double b) {
		return a - b;
	}

	static double subtract(double a, double b, double c) {
		return a - b - c;
	}

	static double subtract(double a, double b, double c, double d) {
		return a - b - c - d;
	}

	static double multiply(double a, double b) {
		return a * b;
	}

	static double multiply(double a, double b, double c) {
		return a * b * c;
	}

	static double multiply(double a, double b, double c, double d) {
		return a * b * c * d;
	}
}
