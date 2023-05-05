package week4.day1.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class FindSecondLargest {

	public static void main(String[] args) {
		int[] data = {3,2,11,4,6,7,2,3,3,6,7};
		Set<Integer> num = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++) {
			num.add(data[i]);
		}
		System.out.println(num);
		
		List<Integer> x = new ArrayList<Integer>(num);
		System.out.println(x);
		int elem = x.get(x.size()-2);
		System.out.println(elem);
		
	}
	
}
