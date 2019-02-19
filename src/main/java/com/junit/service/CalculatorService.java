package com.junit.service;

import java.util.Date;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.Instant;

public class CalculatorService {
	
	public void welcomeApp()
	{
		System.out.println("App initiated");
	}
	
	
	public String getMessage(String input)
	{
		if(input == null)
		{
			return null;
		}
		return "hello "+input;
	}
	public int additionCalculator(int num1, int num2)
	{
		return num1+num2; 
	}
	
	public int MultiplicationCalculator(int num1, int num2)
	{
		if(num1 == 0|| num2 == 0)
		{
			return 0;
		}
		return num1*num2; 
	}
	
	public int MultiplicationCalculator_WithFixedNo(int num)
	{
		if(num == 0)
		{
			return 0;
		}
		return num*2; 
	}
	
	public static void main(String...args)
	{
//		double a = 10.222;
//		System.out.println();
//		int i = (int)Math.round(a);
		
		try
		{
			TimeZone zone = TimeZone.getTimeZone("Europe/Istanbul");
			XMLGregorianCalendar from1 = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(2019, 1, 26, 8, 25, 0, DatatypeConstants.FIELD_UNDEFINED, zone.getOffset(new Date().getTime()) / 1000 / 60);
			System.out.println(from1);
			
			
			
			
			TimeZone tz = TimeZone.getTimeZone("Asia/Tbilisi");
			
			int offset = tz.getOffset(new Date().getTime()) / 1000 / 60;
			XMLGregorianCalendar from = DatatypeFactory.newInstance()
					.newXMLGregorianCalendar(2019, 1, 26, 8, 25, 0, DatatypeConstants.FIELD_UNDEFINED, offset);
			System.out.println(from);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	public int divisionCalculator(int num1, int num2)
	{
		if(num2 ==0)
		{
			throw new ArithmeticException();
		}
		return num1/num2; 
	}

}
