import java.util.* ; 
public class Exercise5
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a month name: ") ; 
		String month = input.nextLine() ; 
		month = month.toLowerCase() ; 
		if(month.equals("january") || month.equals("february") || month.equals("december"))
		{
			System.out.println("Winter") ; 
		}
		else if (month.equals("march") || month.equals("april") || month.equals("may"))
		{
			System.out.println("Spring") ;
		}
		else if (month.equals("june") || month.equals("july") || month.equals("august"))
		{
			System.out.println("Summer") ; 
		}
		else if (month.equals("september") || month.equals("october") || month.equals("november"))
		{
			System.out.println("Fall") ; 
		}
		else
		{
			System.out.println("Error, not a valid month") ; 
		}
	}
}