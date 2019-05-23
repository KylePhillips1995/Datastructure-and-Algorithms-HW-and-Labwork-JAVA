//Kyle Phillips
//Lab 6
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;
public class TreeSetLab {

	public static <Type> Set<Type> setUnion(Set<Type> A, Set<Type> B){
		
		Set<Type> result = new TreeSet<Type>();
		
		Iterator<Type> iterA = A.iterator();
		
		while (iterA.hasNext()) {
			
			result.add(iterA.next());
			
		}
		
		Iterator <Type> iterB = B.iterator();
		
		while(iterB.hasNext()) {
			
			result.add(iterB.next());
			
		}
		return result;
		
	}
	
	
	public static<Type> Set<Type> SetIntersection(Set<Type> A, Set<Type> B){
		
		
		Set<Type> result = new TreeSet<Type>();
		Iterator <Type> iterA = A.iterator();
		
		while(iterA.hasNext()) {
			
			Type value = iterA.next();
			if(B.contains(value)) {
				
				result.add(value);
			}
			
		}
		
		return result;
		
		
	}
	
	
	public static<Type> Set<Type> SetDifference(Set<Type> A, Set<Type> B){
		
		Set<Type> result = new TreeSet<Type>();
		Iterator<Type> iterA = A.iterator();
		
		while(iterA.hasNext()) {
			
			Type value = iterA.next();
			
			if(! B.contains(value)) {
				
				result.add(value);
			}
		}
		
		
		return result;
		
	}
	
	
	public static void main(String[] args) {
		
		
		String[] array1 = {"Namath", "Sauer", "Maynard", "Boozer", "Snell"};
		String[] array2 = {"Maynard", "Boozer", "Snell", "Bradshaw", "Swann", "Williams"};
		Set<String> sample1 = new TreeSet<String>();
		Set<String> sample2 = new TreeSet<String>();
		
		
	for (int i = 0; i <array1.length; i++) {
		
		sample1.add(array1[i]);
	}
	
		for(int j = 0; j <array2.length; j++)
		{	
			sample2.add(array2[j]);	
		}
	
	System.out.println("Original TreeSets");
	System.out.println("----------------------------------------------------");
	System.out.println("");
	System.out.println(sample1);
	System.out.println(sample2);
	
	System.out.println("\n SetUnion, Intersection, and Difference");
	System.out.println("----------------------------------------------------");
	
	
	System.out.println(setUnion(sample1, sample2));
	System.out.println(SetIntersection(sample1, sample2));
	System.out.println(SetDifference(sample1, sample2));
	System.out.println("----------------------------------------------------");
	

	}

}


//Original TreeSets
//----------------------------------------------------
//
//[Boozer, Maynard, Namath, Sauer, Snell]
//[Boozer, Bradshaw, Maynard, Snell, Swann, Williams]

// SetUnion, Intersection, and Difference
//----------------------------------------------------
//[Boozer, Bradshaw, Maynard, Namath, Sauer, Snell, Swann, Williams]
//[Boozer, Maynard, Snell]
//[Namath, Sauer]
//----------------------------------------------------
