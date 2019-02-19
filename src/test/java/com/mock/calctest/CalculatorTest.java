package com.mock.calctest;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

	CalcImpl calcObj = mock(CalcImpl.class);

	CalcInterface calculator = Mockito.mock(CalcInterface.class);
	
	

	@Test
	public void testCheckSumIsPrime() {
		int a = 2;
		int b = 3;
		when(calculator.add(a, b)).thenReturn(a + b);
		CalcOperations op = new CalcOperations(calculator);
		assertTrue(op.checkSumIsPrime(a, b));

		// when(new CalcOperations(calcObj).checkPrimeNumber(2,
		// 3)).thenReturn(true);
		
		
	}
	
	
	@Test
	public void testCheckMultiplyOutputIsEven() {
		int a = 1;
		int b = 3;
		when(calculator.multiply(a, b)).thenReturn(a * b);
		CalcOperations op = new CalcOperations(calculator);
		assertTrue(op.checkMultiplyOutputIsEven(a, b));

		// when(new CalcOperations(calcObj).checkPrimeNumber(2,
		// 3)).thenReturn(true);
		
		
	}
	
	
	
}