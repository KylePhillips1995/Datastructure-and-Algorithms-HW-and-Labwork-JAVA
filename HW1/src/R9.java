//KPhillips


//Write a short Java method that uses a StringBuilder instance to remove all the
//punctuation from a string s storing a sentence, for example, transforming the
//string "Let’s try, Mike!" to "Lets try Mike".
public class R9 {

	public static void main(String[] args)
{
		String OrigString = "Let's try, Mike!";
		System.out.println("The Original String is: " + OrigString);
		
		OrigString = removePunctuation(OrigString);
		System.out.println("String after removing all punctuation: " + OrigString);
		
}
	
	public static String removePunctuation(String s) {
		
		StringBuilder sb = new StringBuilder(s);
		
		for (int j=sb.length()-1; j>=0; j--)
		{
			
			if(!isOk((int)sb.charAt(j)))
				
				sb.deleteCharAt(j);
			
			s = sb.toString();
			
		}
		return(s);
	}
	
	public static boolean isOk(int i)
	{
		if(i == 32 | i >= 48 && i <= 57 | i >= 65 && i<=90 | i >= 97 && i <= 122)
			
			return true;
		
		else 
			return false;
		
	}
	
	}

