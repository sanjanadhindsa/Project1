import java.util.* ; 
public class Exercise4 {


public static void gradeCalculator(int gr)
{
	if (gr<65)
		System.out.println("You entered " + gr + " which is an F") ; 
	else if (65 <= gr && gr <= 73)
		System.out.println("You entered " + gr + " which is a D") ; 
	else if (74 <= gr && gr <= 76)
		System.out.println("You entered " + gr + " which is a C") ; 
	else if (77 <= gr  && gr <= 79)
		System.out.println("You entered " + gr + " which is a C+") ; 
	else if (80 <= gr && gr <= 83)
		System.out.println("You entered " + gr + " which is a B-") ; 
	else if (84<= gr && gr<=86)
		System.out.println("You entered " + gr + " which is a B") ; 
	else if (87 <= gr && gr<=89)
		System.out.println("You entered " + gr + " which is a B+") ; 
	else if (90<= gr && gr <= 93)
		System.out.println("You entered " + gr + " which is an A-") ; 
	else if (94 <= gr && gr<=100)
		System.out.println("You entered " + gr + " which is an A") ; 
}

	public static void main (String [] args)
	{
		Scanner input = new Scanner(System.in) ; 
		System.out.print("Enter a grade: ") ; 
		int grade = input.nextInt() ; 

		gradeCalculator(grade) ; 
		}
}