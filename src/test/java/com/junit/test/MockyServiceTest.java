package com.junit.test;

import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import static org.mockito.Mockito.*;
import static org.junit.Assert.*;

import com.mock.apitest.MockyInterface;
import com.mock.apitest.MockyService;

public class MockyServiceTest {
	
	MockyInterface mockyInterface = mock(MockyInterface.class);
	@Test
	public void testMockyServiceResponseLenght()
	{
		String expected = "{\"hello\": \"world\"}";
		when(mockyInterface.getStringResponse()).thenReturn(expected);
		MockyService service = new MockyService(mockyInterface);
		assertEquals(service.getResponseSize(), 18);
		 
	}
	
}
