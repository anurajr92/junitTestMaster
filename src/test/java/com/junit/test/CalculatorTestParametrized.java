package com.junit.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.junit.service.CalculatorService;

@RunWith(Parameterized.class)
public class CalculatorTestParametrized {
	

	@Parameters
	public static Collection<Object[]> CalculatorParaTest()
	{
		return Arrays.asList(new Object[][]
				{{2,4},{8,16}});
	}
	
	
	 private int inputNumber;
	 private int expectedResult;
	
	public CalculatorTestParametrized(int inputNumber, int expectedResult) {
	      this.inputNumber = inputNumber;
	      this.expectedResult = expectedResult;
	   }
	
	@Test
	public void parameterizedTest()
	{
		CalculatorService service = new CalculatorService();
		assertEquals(expectedResult,  service.MultiplicationCalculator_WithFixedNo(inputNumber));
	}
	
}
