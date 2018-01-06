import java.util.Scanner;


public class BySwitchCase
{
	
		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);

			System.out.println("1.Add The String to Itself ");
			System.out.println("2.Replace odd positions with # ");
			System.out.println("3.Remove duplicate characters in the String ");
			System.out.println("4.Change odd characters to upper case ");
			 String str = new String("abbc");
			
			System.out.print("Enter choice: ");
			int ch = sc.nextInt();
			switch (ch) {
			case 1:
				System.out.println("The string is: "+str);
				String str1="";		
				
				str1= str.concat(str);
				System.out.println("Add the string : " +str1);			
						
				System.out.println();
				break;			
			case 2:
				System.out.println("The string is: "+str);
				String st="";
				for(int i=0;i<str.length();i++)
				{
					if(!(i%2==0))
					{
						st=st.concat("#");
					}
					else
					{
						st=st.concat(new Character(str.charAt(i)).toString());
					}
				}
				System.out.println("Replacing odd positions with # : "+st);
				break;

			case 3:
				System.out.println("The string is: "+str);
				String output = "";
				for (int i = 0; i < str.length(); i++) {
				   if (str.charAt(i % str.length()) != str.charAt((i + 1) % str.length())) 
				   {

						output =output + str.charAt(i);

					}
				}
				System.out.println("After removing duplicates: "+output);
				break;
			case 4:
				System.out.println("The string is: "+str);
				System.out.print("The altered string is: ");
					for (int i = 0;i < str.length(); i++) {
					char c = str.charAt(i);
					if (i % 2 == 0) {
						System.out.print(Character.toLowerCase(c));
					} else {
						System.out.print(Character.toUpperCase(c));
					}
				}
				System.out.println();
				break;

			}

		}
	}


