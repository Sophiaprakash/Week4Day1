package week4.day1.assignments;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingUsingCollection {

	public static void main(String[] args) {
		String [] s = {"HCL","Wipro","Aspire Systems","CTS"};
		int length = s.length;
		System.out.println(length);
		List<String> x =new ArrayList<String>();
		for(int i=0;i<s.length;i++) {
			x.add(s[i]);
		}
		Collections.sort(x);
		System.out.println(x);
		for(int i=x.size()-1;i>=0;i--) {
		System.out.print(x.get(i)+" ");
		}
		
				

	}

}
