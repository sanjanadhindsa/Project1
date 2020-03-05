import java.util.* ; 
public class Exercise1{
	public static void main (String [] args){
		Scanner input = new Scanner(System.in) ; 
		String password = "NYU42day" ; 
		System.out.print("Please enter the password: ") ; 
		String userInput = input.nextLine() ; 
		if (userInput.equals(password))
			System.out.println("Valid password!") ; 
		else 
			System.out.println("Invalid password booo") ; 
	}
}