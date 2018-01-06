package Com.capgemini.lab5;



	public class ExceptionCheck  extends Exception{
		public ExceptionCheck() {
			super();
			// TODO Auto-generated constructor stub
		}

		public ExceptionCheck(String message) {
			super(message);
			System.out.println(message);
		}

	}



