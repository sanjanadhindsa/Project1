import java.util.* ; 
public class Exercise6
{
	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a password: ") ; 
		String password = input.nextLine() ; 
		if (password.length() < 8)
			System.out.println("Weak password") ; 
		else if(password.length()>12)
			System.out.println("Awesome password") ; 
		else if (password.length() <= 12 && password.length() >=8)
		{
			int alpha = 0 ; 
				int lower = 0 ; 
				int num = 0 ; 
				int letter = 0 ; 

			for(int i = 0; i<password.length(); i++)
			{
				

				if (Character.isLetter(password.charAt(i)))
				{
					if (Character.isUpperCase(password.charAt(i)))
					{
						letter +=1 ; 
						alpha +=1 ; 
					}
					else if (Character.isLowerCase(password.charAt(i)))
					{
						letter +=1 ; 
						lower +=1 ; 
					}
					
				}
				else if (Character.isDigit(password.charAt(i)))
				{
					num+=1 ; 
				}
				
				
			}
			if (letter>0 && num > 0 && alpha > 0 && lower ==0 || letter >0 && num> 0 && lower>0 && alpha ==0)
					System.out.println("Medium password") ; 
			else if (num >= 1 && letter > 0 && lower == 0 || num >=1 && letter > 0 && alpha ==0)
					System.out.println("OK password") ; 
			else if (num >=1 && lower >=1 && alpha >=1 )
					System.out.println("Strong password") ; 

		}
		
	}
}