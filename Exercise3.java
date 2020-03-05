import java.util.* ; 
public class Exercise3{
	public static char randomGenerator(int num1, int num2)
		{
			int a = num1 + (int)(Math.random() * num2) ; 
			char b = ((char) a) ; 
			return b ; 

		}
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter letter 'a' to generate ranom char (a-z), or enter 'A' to generate a random char between (A-Z): ") ; 
		String userInput = input.nextLine() ; 
		while (userInput.equals("a") == false && userInput.equals("A") == false)
		{
			System.out.println("Invalid entry, please try again") ; 
			System.out.print("Enter 'a' or 'A'") ; 
			userInput = input.nextLine() ; 
		}
		if (userInput.equals("a"))
		{
			System.out.println(randomGenerator(97,27)) ; 
		}
		else if (userInput.equals("A")) 
		{
			System.out.println(randomGenerator(65,27)) ; 
		}


	}
}