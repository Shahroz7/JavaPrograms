package interviewQ;

import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;

class RemoveDuplicatesAndSort{
	
	public static void main(String[]args){
		
		int a[] = {4,3,7,9,11,67,89,3,9,52,7,6};
		Set<Integer> set = new TreeSet<Integer>();
		
		System.out.println("arrays"+ Arrays.toString(a));
		for(int x=0;x<a.length;x++){
			
			set.add(a[x]);
		}
		System.out.println(set);
		
	}
}