package com.junit.test;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

import com.junit.service.CalculatorService;

public class CalculatorTest {
	
	CalculatorService service = new CalculatorService();
	@Test
	public void testAddition()
	{
		
		assertEquals(5, service.additionCalculator(2, 3));
	}
	
	
	@Test
	public void testMultiplication()
	{
		assertEquals(0, service.MultiplicationCalculator(0, 2));
		
	}
	
	@Test
	public void testCalc()
	{
		assertNotNull(service.getMessage("df"));
	}
	
	@Test
	public void testAssertFalse()
	{
		//assertFalse(service.MultiplicationCalculator(0, 2) == 0); //True
		assertFalse(service.MultiplicationCalculator(0, 2)> 0); // False
	}
	
	@Test
	public void testAssertTrue()
	{
		assertTrue(service.MultiplicationCalculator(0, 2) == 0);
	}
	
	@Test(timeout = 10)
	public void testPerformace_Multiplication()
	{
		for(int i=0; i< 10000; i++)
		{
			System.out.println(service.MultiplicationCalculator(2, 2));
		}
	}
	
	@Test
	public void testArray_Comparision()
	{
		int[] arr1 = {10, 20,30};
		int[] arr2 = {10, 20,30};
		//assertTrue(Arrays.equals(expected, actual));
	}
	
	@Test(expected = ArithmeticException.class)
	public void testExceptionTest()
	{
		int[] arr1 = {10, 20,30};
		int[] arr2 = {10, 20,30};
		assertEquals(0, service.divisionCalculator(2, 0));
	}
	
	
	
	
	
	
	
	
	
	

	
	
}
