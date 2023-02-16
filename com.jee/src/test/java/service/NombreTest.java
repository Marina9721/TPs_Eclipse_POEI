package service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class NombreTest {
	
	@Test
	public void test_add_two_positive_integers() {
		
		int result = Nombre.addIntegers(128, 64);
		
		assertEquals(192, result);
	}
	
	@Test
	public void test_multiply_two_positive_integers() {
		
		Nombre n1 = new Nombre(3);
		Nombre n2 = new Nombre(8);
		
		assertEquals(24, n1.multiplication(n2).getMonNombre());
	}
	
	@Test
	public void test_multiply_positive_integer_by_negative_integer() {
		
		Nombre n1 = new Nombre(9);
		Nombre n2 = new Nombre(-11);
		
		assertEquals(-99, n1.multiplication(n2).getMonNombre());
	}
	
	@Test
	public void test_integer_squared() {
		
		Nombre n = new Nombre(12);
		
		assertEquals(144, n.square().getMonNombre());
	}
	
	@Test
	public void test_divide_positive_integer_by_positive_integer() {
		
		Nombre n1 = new Nombre(39);
		Nombre n2 = new Nombre(3);
		
		assertEquals(13, n1.division(n2).getMonNombre());
	}
	
	@Test
	public void test_divide_negative_integer_by_positive_integer() {
		
		Nombre n1 = new Nombre(-95);
		Nombre n2 = new Nombre(5);
		
		assertEquals(-19, n1.division(n2).getMonNombre());
	}
	
	@Test
	public void test_integer_to_the_power_an_integer() {
		
		Nombre n1 = new Nombre(4);
		Nombre n2 = new Nombre(3);
		n1.pow(n2);
		
		assertEquals(64, n1.getMonNombre());
	}
	
	@Test
	public void test_negative_integer_power_even_integer() {
		
		Nombre n1 = new Nombre(-5);
		Nombre n2 = new Nombre(4);
		n1.pow(n2);
		
		assertEquals(625, n1.getMonNombre());
	}
	
	@Test
	public void test_negative_integer_power_odd_integer() {
		
		Nombre n1 = new Nombre(-5);
		Nombre n2 = new Nombre(3);
		n1.pow(n2);
		
		assertTrue(n1.getMonNombre()<0);
	}
	
	@Test
	public void test_log2_of_4_return_2() {
		
		Nombre n = new Nombre(4);
		
		assertEquals(2, n.log2().getMonNombre());
	}
	
	@Test
	public void test_log2_of_1024_return_10() {
		
		Nombre n = new Nombre(1024);
		
		assertEquals(10, n.log2().getMonNombre());
	}
	
}
