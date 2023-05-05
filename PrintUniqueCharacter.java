package week4.day1.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter {

	public static void main(String[] args) {
		String name = "SophiaDevi";
		char[] nameArray = name.toCharArray();
		System.out.println(Arrays.toString(nameArray));
		
		Set<Character> x = new LinkedHashSet<Character>();
		for(int i=0;i<nameArray.length;i++) {
		x.add(nameArray[i]);
		}
		System.out.println(x);
			
	}
	}


