package Com.capgemini.lab5;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class Junit {
	
		@Test
		public void testGetFullName()
		{
		System.out.println("from TestPerson2");
		DemoJunit per = new DemoJunit("Robert","King");
		Assert.assertEquals("Robert King",per.getFullName());
		}
		@Test (expected=IllegalArgumentException.class)
		public void testNullsInName()
		{
			System.out.println("from TestPerson2 testing exceptions");
			DemoJunit per1 = new DemoJunit (null,null);
		}
		
	}



