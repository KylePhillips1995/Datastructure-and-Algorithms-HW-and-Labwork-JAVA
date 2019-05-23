
//KPhillips



//Write a short Java method that takes an integer n and returns the sum of all
//positive integers less than or equal to n

public class R5 {

	
public static void main(String[] args){
	System.out.println("The sum of all the numbers leading up to N is: "+sumOfN(21));
}

public static int sumOfN(int n)
{
	int sum = 0;
	
	for (int j=1; j <= n; j++)
		
		sum += j;
		return sum;
}

	
}
