package Com.capgemini.lab5;



	import static org.junit.Assert.assertEquals;
	import static org.junit.Assert.assertNotNull;

	import org.junit.Assert;
	import org.junit.Test;

	public class EmplyeeJunit {
		@Test
		public void testtoString() {
			System.out.println("Testing the Date with valid input");
			Date o=new Date(3,3,1996);
			Assert.assertEquals("3/3/1996",o.toString());
		}
		
		@Test
		public void testSetDay() {
			Date o=new Date();
			// fail("Not yet implemented");
			assertNotNull("Day not set!", o.getDay());
		}
		
		@Test
		public void testGetDay() {
			// fail("Not yet implemented");
			 Date date=new Date(12,12,2012);
			assertEquals(date.getDay(), 12);
		}
		
		@Test
		public void testSetMonth() {
			Date o=new Date();
			// fail("Not yet implemented");
			assertNotNull("Month not set!", o.getMonth());
		}
		
		@Test
		public void testGetMonth() {
			// fail("Not yet implemented");
			System.out.println("MOnth ");
			 Date date=new Date(12,12,2012);
			assertEquals(date.getMonth(), 12);
		}
		
		@Test
		public void testSetYear() {
			Date o=new Date();
			// fail("Not yet implemented");
			assertNotNull("Month not set!", o.getYear());
		}
		
		@Test
		public void testGetYear() {
			// fail("Not yet implemented");
			 Date date=new Date(12,12,2012);
			assertEquals(date.getYear(), 2012);
		}
	}


