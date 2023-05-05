package week4.day1.assignments;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "PayPal India";
		String lowerCaseString = s.toLowerCase();
		char[] ch = lowerCaseString.toCharArray();
		System.out.println("Initial Character Array: " + new String(ch));
		
		Set<Character> charSet=new LinkedHashSet<Character>();
		Set<Character> dupCharSet=new LinkedHashSet<Character>();
		
		for(Character character:ch) {
			if(!charSet.add(character)) {
				dupCharSet.add(character);
			}
		}
		
		System.out.println("Initial Charset: " + charSet);
		System.out.println("Duplicate CharSet: " + dupCharSet);
		
		charSet.removeAll(dupCharSet);
		charSet.remove(' ');
		System.out.println("Final CharSet: " + charSet);
		
				
	}
								
}	
			
		

	


