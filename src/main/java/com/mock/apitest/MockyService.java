package com.mock.apitest;

public class MockyService {
	
	MockyInterface mockInterface;
	
	public MockyService(MockyInterface mockInterface)
	{
		this.mockInterface = mockInterface;
	}
	
	
	public int getResponseSize()
	{
		String responseStr = mockInterface.getStringResponse();
		return responseStr.length();
	}
	
	
	public static void main(String args[])
	{
		MockyInterface mockInter = new MockyImpl();
		System.out.println(mockInter.getStringResponse() + " "+ mockInter.getStringResponse().length());
	}
	
}
