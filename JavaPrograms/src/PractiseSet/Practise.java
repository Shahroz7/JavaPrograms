package PractiseSet;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;


public class Practise {

	public static void main(String[] args) {

		//Unique characters in a srting
		String str = "tomorrow";
		HashSet<Character> set = new HashSet<Character>();
		for(int i=0;i< str.length();i++)
			set.add(str.charAt(i));
		
		for(Character ch: set)
			System.out.println(ch);
		
		
		//occurrence of a character in a string
		char ch1[] = str.toCharArray();
		HashMap<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : ch1 )
			if(map.containsKey(ch)){
				map.put(ch, map.get(ch)+1);
		}
			else
				map.put(ch, 1);
	
		for (Map.Entry<Character,Integer> entry : map.entrySet())
            System.out.println("Key = " + entry.getKey() +
                             ", Value = " + entry.getValue());
		
		
		//Count the occurrence of the Strings in the list 
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list = Arrays.asList("Ram","Sam","Dam","Man", "Kam","Jam","Sam","Ram");
		list2 = Arrays.asList(1,4,6,8,3,8,5,9,3,2,1,8);
		
		Map<Integer, Long> map2 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		map2.forEach((Key,Value)->{
			System.out.println(Key+" "+ Value);
		});
		
		
		
		//using comparator using java 8
//		List<User> userList = new ArrayList<>(Arrays.asList(
//		        new User("John", 33), 
//		        new User("Robert", 27), 
//		        new User("Mark", 26), 
//		        new User("Brandon", 42)));
//
//		List<User> sortedList = userList.stream()
//		        .sorted(Comparator.comparing(User::getAge))
//		        .collect(Collectors.toList());
//
//		sortedList.forEach(System.out::println);
//		
//		
//		// find the nth salary or age of an employee
//		Optional<Integer> nth= userList.stream().map(e->e.getAge()).sorted(Comparator.naturalOrder()).skip(1).findFirst();
//		
//		System.out.println(nth.get());
		
		
		//count frequency of chars in String
		String s = "tomorrow";
		Map<Character, Integer> map3 = new HashMap<>();
		for (char c : s.toCharArray()) {
		    map3.merge(c,                  // key = char
		                1,                  // value to merge
		                Integer::sum);      // counting
		}
		System.out.println("Frequencies:\n" + map3);
		
	}
}


