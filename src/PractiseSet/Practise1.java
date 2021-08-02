package PractiseSet;

import java.util.Arrays;
import java.util.List;

class Practise1{
	
	public static void main(String[]args){
		
		List<Integer> list = Arrays.asList(5,8,9,3,5,1,7);
		list.stream().limit(5).forEach(System.out::println);
		list.stream().skip(4).forEach(System.out::println);
	}
}