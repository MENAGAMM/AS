package Com.capgemini.lab5;

public class Demo2Junit {

		private String fName;
		private String lName;
		private char gender;

	    public  Demo2Junit() {
        super();
	    } 

		public Demo2Junit(String fName, String lName, char gender) {
			super();
			this.fName = fName;
			this.lName = lName;
			this.gender = gender;
		}

		public String getfName() {
			return fName;
		}

		public void setfName(String fName) {
			this.fName = fName;
		}

		public String getlName() {
			return lName;
		}

		public void setlName(String lName) {
			this.lName = lName;
		}

		public char getGender() {
			return gender;
		}

		public void setGender(char gender) {
			this.gender = gender;
		}

		@Override
		public String toString() {
			return  "\nFirst Name:" + fName
					+"\nLast Name:" + lName
					+"\nGender:" + gender;
		}

		public void print() {
			System.out.println(this);

		}

	}



