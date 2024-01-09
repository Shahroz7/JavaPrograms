package interviewQ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8 {

	public static void main(String[] args) {

		List<String> listWithDuplicates = Arrays.asList("Shahroz", "Alam", "Deepak", "Deepak", "Rohit", "Mohit",
				"Rohit");

		//////// to remove duplicates using streams
		List<String> list3 = listWithDuplicates.stream().distinct().collect(Collectors.toList());
		list3.forEach(System.out::println);
		

		///////// print equal strings
		List<String> list1 = listWithDuplicates.stream().filter(e -> e.equals("Alam")).collect(Collectors.toList());
		list1.forEach(System.out::println);

		
		/////// to print string occurrence
		List<String> list = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		list = Arrays.asList("Ram", "Sam", "Dam", "Man", "Kam", "Jam", "Sam", "Ram");
		list2 = Arrays.asList(1, 4, 6, 8, 3, 8, 5, 9, 3, 2, 1, 8);

		Map<Integer, Long> map2 = list2.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

		map2.forEach((Key, Value) -> {
			System.out.println(Key + " " + Value);
		});

		
		//////// User POJO
		List<User> userList = new ArrayList<>(Arrays.asList(
				new User("John", 33),
				new User("Robert", 27),
				new User("Mark", 26),
				new User("Mathew",35),
				new User("Brandon", 45)));

		//Sort using comparator
		List<User> sortedList = userList.stream().sorted(Comparator.comparing(User::getAge)).collect(Collectors.toList());
		sortedList.forEach(System.out::println);

		//group by name
		Map<String, List<User>> usersList = userList.stream().collect(Collectors.groupingBy(User::getName,Collectors.toList()));
		System.out.println("Group by ");
		usersList.forEach((Key,Value)-> System.out.println(Key+" "+Value));
		
		//find minimum
		Optional<User> minList = userList.stream().min(Comparator.comparing(User::getAge));
		System.out.println(minList);
		//find maximum
		Optional<User> maxList = userList.stream().max(Comparator.comparing(User::getAge));
		System.out.println(maxList);
		
		//////// find the nth salary or age of an employee
		Optional<Integer> nth = userList.stream().map(e -> e.getAge()).sorted(Comparator.naturalOrder()).skip(1)
				.findFirst();
		System.out.println(nth.get());

		 
		
		//////Sliding ages
		List<User> slidingAges = userList.stream().skip(1).limit(2).collect(Collectors.toList());
		System.out.println(slidingAges);
		
		
		//////Name concatenation
		List<String> nameList = userList.stream().map(emp ->emp.getName()).collect(Collectors.toList());
		String names = nameList.stream().map(name -> name.toUpperCase()).collect(Collectors.joining("~"));
		System.out.println(names);
		
		
		System.out.println("Get Max, Min, Count, Sum, Avg");
		/////Max, Min, Count, Sum, Avg
		List<Integer> listAges = userList.stream().map(emp -> emp.getAge()).collect(Collectors.toList());
		IntSummaryStatistics summary = listAges.stream().mapToInt(x -> x).summaryStatistics();
		
		System.out.println("Average: "+summary.getAverage());
		System.out.println("Count: "+summary.getCount());
		System.out.println("Max: "+summary.getMax());
		System.out.println("Min: "+summary.getMin());
		System.out.println("Sum: "+summary.getSum());
		
		
		
		
		
		
		
		
		
		
		
		
		System.out.print("---------------xxxx----------------");
		System.out.println("----------------------------------");
		
		//max/min age or salary from each department
				Map<String, Optional<User>> maxAgeFromEachName =
						userList.stream().collect(Collectors.groupingBy(User::getName,
								Collectors.reducing(BinaryOperator.minBy(Comparator.comparing(User::getAge)))
								));
				
				System.out.println("Max by each department");
				maxAgeFromEachName.forEach((Key, Value)->{
				System.out.println(Key+"'"+Value);});
		
	}
	

}


class User {

	private String name;
	private int age;

	User() {
	}

	User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return "Name" + " " + name + " " + "Age" + " " + age;
	}

}
