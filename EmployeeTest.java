package Com.capgemini.lab5;


	import org.junit.Test;

	public class EmployeeTest {
		@Test(expected=ExceptionCheck.class)
		public void testSetSalary() throws ExceptionCheck
		{
			Employee employee=new Employee("Esha Jain",2000,"Programmer","Scheme A");
			employee.setSalary(employee.getSalary());
		}
	}


