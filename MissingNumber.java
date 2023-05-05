package week4.day1.assignments;

import java.util.Set;
import java.util.TreeSet;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr= {2,3,10,4,5,1,3,5,7,6,9};
		Set<Integer> num = new TreeSet<Integer>();
		for(int i=0;i<arr.length;i++) {
			num.add(arr[i]);
		}
		System.out.println(num);
		
	
		for(int i=1;i<=num.size();i++) {
			if(!num.contains(i)) {
				System.out.println(i);
			}
			
			}
		}
	}


