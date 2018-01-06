package ass_lab2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PersoMain {

	public static void main(String[] args) throws ParseException {
		
		Perso p=new Perso();
		p.setFirstName("abcd");
		p.setLastName("xyed");
		p.setGender('M');
		String name1="abcd";
		String name2="xyed";
		 String birthdateStr = "11-01-1991";
	        SimpleDateFormat df = new SimpleDateFormat("dd-mm-yyyy");
	        Date birthdate = df.parse(birthdateStr);
	        System.out.println("First Name:"+p.getFirstName());
	        System.out.println("Last Name: "+p.getLastName());
	        System.out.println("Gender: "+p.getGender());
	        System.out.println("Age: "+calculateAge(birthdate));
	        System.out.println("Weight: 85.55");
	        System.out.println("Full Name: "+getFullName(name1, name2));
	       
	        
		
	}

	    public static int calculateAge(Date birthdate) {
	        Calendar birth = Calendar.getInstance();
	        birth.setTime(birthdate);
	        Calendar today = Calendar.getInstance();

	        int yearDifference = today.get(Calendar.YEAR)
	                - birth.get(Calendar.YEAR);

	        if (today.get(Calendar.MONTH) < birth.get(Calendar.MONTH)) {
	            yearDifference--;
	        } else {
	            if (today.get(Calendar.MONTH) == birth.get(Calendar.MONTH)
	                    && today.get(Calendar.DAY_OF_MONTH) < birth
	                            .get(Calendar.DAY_OF_MONTH)) {
	                yearDifference--;
	            }

	        }

	        return yearDifference;
	    }

	   
	      public static String getFullName(String firstName, String lastName){
			    	  
	    	  return (firstName+" "+lastName);
	    	  
	      }

	    
}
