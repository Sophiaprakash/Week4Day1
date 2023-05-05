package week4.day1.assignments;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesWords {

	public static void main(String[] args) {
		String text = "We learn java basics as part of java sessions in java week1";
		String[] split = text.split(" ");
		System.out.println(Arrays.toString(split));
						
		Set<String> x = new LinkedHashSet<String>();
		for(int i=0;i<=split.length-1;i++) {
			x.add(split[i]);
		}
		System.out.println(x);
		
		Object[] ch = x.toArray();
		for(int i=0;i<=ch.length-1;i++) {
			System.out.print(ch[i]+" ");
		}
	}

}
