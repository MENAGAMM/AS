package assign;
import java.util.Arrays;

public class New {
	public static void main(String args[])	//This method sorts the array alphabetically
	{
		String arrstr[]= {"ahdujsad","asjdjad","asdsa","ads","ferf","fer","wefrew","ewfwf","ewffw","rhtrh"};
		int i;
		System.out.println("The original arrays is");
		for(i=0;i<arrstr.length;i++)
		{
			System.out.println(i+ ":"+ arrstr[i]);
		}
		Arrays.sort(arrstr);
		System.out.println("The sorted array is");
		for(i=0;i<arrstr.length;i++)
		{
			System.out.println(arrstr[i]);
		}
	}
}

	
		
			