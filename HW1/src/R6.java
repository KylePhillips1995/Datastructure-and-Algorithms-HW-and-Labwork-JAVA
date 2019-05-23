//KPhillips
//Write a short Java method that takes an integer n and returns the sum of all the
//odd positive integers less than or equal to n.
public class R6 {

public static void main(String[] args)
{
	
	System.out.println("The sum of the odds is: " + sumOfO(21));
	
}


public static int sumOfO(int n)
{
	int sum = 0;
	
	for (int j=1; j<= n; j+=2)
	
	sum += j;
	return sum;
	
	
}
}


