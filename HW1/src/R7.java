//KPhillips
import java.util.Scanner;

//Write a short Java method that takes an integer n and returns the sum of the
//squares of all positive integers less than or equal to n.
public class R7 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int n = 0;
		int sum = 0;
		
	System.out.print("Enter your n value: ");
	
	n = input.nextInt();
	
	if(n <= 0)
	{
	System.out.print("Please enter a valid value: ");
	
	n = input.nextInt();
	}
sum = sumOfSquares(n);

System.out.println("The sum of the squares is: " + sum);
	}

public static int sumOfSquares(int n)
{

	int sum = 0;
	
	for (int i=1; i <=n; i++)
		sum += i*i;
		return sum;
		
}
}
