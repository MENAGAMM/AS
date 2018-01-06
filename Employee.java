package Com.capgemini.lab5;

public class Employee {

	
		public long empId;
		public String empName;
		public double salary;
		public String designation;
		public String scheme;	
		static protected long numId;	
		//to initialize only static var
		static{
			numId=(int) (1000+Math.random());
		}
		//initializer block
		{
			empId=1000000 + numId++;
		}	
		//getter setter	
		
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary)throws ExceptionCheck {
			if(salary<3000)
				throw new ExceptionCheck("Employee exception");
			this.salary = salary;
		}
		public long getEmpId() {
			return empId;
		}
		public void setEmpId(long empId) {
			this.empId = empId;
		}
		public String getEmpName() {
			return empName;
		}
		public void setEmpName(String empName) {
			this.empName = empName;
		}
		public String getDesignation() {
			return designation;
		}
		public void setDesignation(String designation) {
			this.designation = designation;
		}
		public String getScheme() {
			return scheme;
		}
		public void setScheme(String scheme) {
			this.scheme = scheme;
		}
		
		//constructor
		public Employee(String name, double salary, String designation, String scheme) 
		{
			super();		
			this.empName = name;
			this.salary = salary;
			this.designation = designation;
			this.scheme = scheme;
		}
		public Employee() 
		{
			// TODO Auto-generated constructor stub
		}
		//step2:business method
		public void print(){
			System.out.println(""
					+ "\n================Employe Details=====================\n"
					+ "\n                Id          : "+empId
					+ "\n                Name        : "+empName
					+ "\n                Salary      : "+salary
					+ "\n                Designation : "+designation
					+ "\n                scheme      : "+scheme
					+ "\n====================================================\n"
					);
		}
	}


