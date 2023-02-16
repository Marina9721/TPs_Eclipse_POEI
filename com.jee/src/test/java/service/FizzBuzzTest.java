package service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class FizzBuzzTest {
	
	@Test
	public void test_input_3_return_fizz() {
		assertEquals("fizz", FizzBuzz.method(3));
	}
	
	@Test
	public void test_input_5_return_buzz() {
		assertEquals("buzz", FizzBuzz.method(5));
	}
	
	@Test
	public void test_input_15_return_fizz_buzz() {
		assertEquals("fizzbuzz", FizzBuzz.method(15));
	}
	
	@Test
	public void test_input_8_return_8() {
		assertEquals("8", FizzBuzz.method(8));
	}
	
	@Test
	public void assert_that_number_divisible_by_3_and_not_5_return_fizz() {
		assertEquals("fizz", FizzBuzz.method(3));
		assertEquals("fizz", FizzBuzz.method(6));
		assertEquals("fizz", FizzBuzz.method(9));
		assertEquals("fizz", FizzBuzz.method(12));
	}
	
	@Test
	public void assert_that_number_divisible_by_5_and_not_3_return_buzz() {
		assertEquals("buzz", FizzBuzz.method(5));
		assertEquals("buzz", FizzBuzz.method(10));
		assertEquals("buzz", FizzBuzz.method(20));
		assertEquals("buzz", FizzBuzz.method(25));
	}
}
