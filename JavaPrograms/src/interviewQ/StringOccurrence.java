package interviewQ;


import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


public class StringOccurrence{

	public static void main(String[]args){
		
//		 ArrayList<String> list = new ArrayList<String>();
//	        list.add("Geeks");
//	        list.add("for");
//	        list.add("Geeks");
//	        
		List<String> list = Arrays.asList("Ram", "Sam", "Sam","Kam","Bam" );
		
		Set<String> set = new HashSet<String>(list);
		for(String s: set){
			System.out.println(s+": "+ Collections.frequency(list, s));
		}
		
	}

}
