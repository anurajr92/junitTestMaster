package com.junit.test;

import java.util.Date;
import java.util.TimeZone;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

public class CommonTest {
	
	public static void main(String args[]) throws DatatypeConfigurationException
	{
		TimeZone depTimeZone = TimeZone.getTimeZone("Asia/Amman");
		
		
		XMLGregorianCalendar xmlFrom = DatatypeFactory.newInstance()
				.newXMLGregorianCalendar(2019, 01, 30, 12, 31, 0, DatatypeConstants.FIELD_UNDEFINED, depTimeZone.getOffset(new Date().getTime()) / 1000 / 60);
		System.out.println(xmlFrom);
		
	}

}
