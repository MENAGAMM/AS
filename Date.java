package Com.capgemini.lab5;



	class Date
	{
	int intDay, intMonth, intYear;
	// Constructor
	Date(){
		
	}
		Date(int intDay, int intMonth, int intYear) 
		{
			/*if((intDay>=0 && intDay<=31)||(intMonth>0 && intMonth<=12)||(intYear>0 && intYear<=2222))
			{
				throw new IllegalArgumentException("Date is invalid");
			}*/
			this.intDay = intDay;
			this.intMonth = intMonth;
			this.intYear = intYear;
		}
	// setter and getter methods
		void setDay(int intDay)
		{
			this.intDay = intDay;
		}
		int getDay( )
		{
			return this.intDay;
		}
		void setMonth(int intMonth)
		{
			this.intMonth = intMonth;
		}
	    int getMonth( )
		{
			return this.intMonth;
		}
		void setYear(int intYear)
		{
			this.intYear=intYear;
		}
		int getYear( )
		{
			return this.intYear;	
		}
		//converts date obj to string.
		public String toString() 
		{
			return intDay+"/"+intMonth+"/"+intYear;
		}
	} // Date class

