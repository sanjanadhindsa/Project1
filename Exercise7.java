import java.util.* ; 
public class Exercise7
{
	public static void main(String [] args)
	{
		double balance = 0.0 ; 
		Scanner input = new Scanner(System.in) ; 
		System.out.println("1. View your Balance") ; 
			System.out.println("2. Deposit Cash") ; 
			System.out.println("3. Withdraw Cash") ; 
			System.out.println("4. Exit") ; 
			System.out.println(" ") ; 
			System.out.print("Enter your selection: ") ; 

			int choice = input.nextInt() ;
		do {
			if (choice ==4)
				break ; 
			
			if (choice == 1)
			{
				System.out.println("Your current balance: " + balance) ; 
			}
			else if (choice == 2)
			{
				System.out.print("Enter how much you want to deposit: ") ;
				double deposit = input.nextDouble() ; 
				balance += deposit ; 

			}
			else if (choice ==3)
			{
				System.out.print("Enter how much you want to withdraw: ") ; 
				double withdraw = input.nextDouble() ; 
				if (withdraw > balance)
					System.out.println("Sorry! You don't have enough balance") ; 

				else
					balance -=withdraw ; 

			}
			System.out.println("1. View your Balance") ; 
			System.out.println("2. Deposit Cash") ; 
			System.out.println("3. Withdraw Cash") ; 
			System.out.println("4. Exit") ; 
			System.out.println(" ") ; 
			System.out.print("Enter your selection: ") ; 

			choice = input.nextInt() ;
			


		
		}
		while (choice !=4) ; 
		
		System.out.println("Goodbye") ; 
	}
}