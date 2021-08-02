package interviewQ;

import java.util.Set;
import java.util.TreeSet;

class RemoveDuplicatesAndSort{
	
	public static void main(String[]args){
		
		int a[] = {4,3,7,9,11,67,89,3,9,52,7,6};
		Set<Integer> set = new TreeSet<Integer>();
		
		for(int x=0;x<a.length;x++){
			System.out.println("arrays"+a[x]);
			set.add(a[x]);
		}
		System.out.println(set);
		
	}
}