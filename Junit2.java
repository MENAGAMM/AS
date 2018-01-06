package Com.capgemini.lab5;


	import static org.junit.Assert.assertEquals;

	import org.junit.Assert;
	import org.junit.BeforeClass;
	import org.junit.Test;

	public class Junit2 {
		
		private static Demo2Junit person;
		@BeforeClass
		public static void getPerson() {
			person=new Demo2Junit ("Esha", "Jain", 'F');
		}
		@Test
		public void testGetfName() {
			//fail("Not yet implemented");
			assertEquals("Esha",person.getfName());
		}

		@Test
		public void testGetlName() {
			//fail("Not yet implemented");
			assertEquals("Jain",person.getlName());
		}

		@Test
		public void testGetGender() {
			//fail("Not yet implemented");
			assertEquals('F',person.getGender());
		}

		@Test
		public void testToString() {
			//fail("Not yet implemented");
			 String expected="\nFirst Name:Esha"
				+ "\nLast Name:Jain"
				+ "\nGender:F";
			 String actual=person.toString();
			 assertEquals(expected, actual);
		}
		
	}


