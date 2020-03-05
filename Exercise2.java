import java.util.* ; 
public class Exercise2
{
	public static int max(int num1, int num2)
		{
			int result = Math.max(num1, num2) ; 
			return result ; 

		}
	public static void main(String [] args)
	{
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter integer number 1: ") ; 
		int a = input.nextInt() ; 
		
		System.out.print("Enter integer number 2: ") ; 
		int b = input.nextInt() ; 
		
		int c = max(a,b) ; 
		System.out.println("The max of the two numbers is: " + c) ;  

	}
}