
//KPhillips
import java.util.Scanner;

//Write a short Java method, isMultiple, that takes two long values, n and m, and
//returns true if and only if n is a multiple of m, that is, n = mi for some integer i.



public class R3 {
	
public static void main(String[] args) {
	
long a;
long b;

Scanner in = new Scanner(System.in);

System.out.println("Enter the a value:");

a = in.nextInt();

System.out.println("Enter the b value:");

b = in.nextInt();


System.out.println(isMultiple(a,b));
}

public static boolean isMultiple(long n, long m)
{
	System.out.println("is a a multiple of b?:");
	
	return (n % m == 0);
	
}
	

	

}
