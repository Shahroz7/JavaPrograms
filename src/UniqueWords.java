import java.util.*;

public class UniqueWords {
	void stringUnique(){
		String s="There are only three articles: the, a and an."
				+ " They are very small words which cause very large problems if used incorrectly."
				+ " If, for example, you wanted someone to hand you the book, but you accidentally said a book, "
				+ "the other person might take some time to go shopping for a book they thought you’d like. "
				+ "While one can never have too many books, "
				+ "work doesn’t get done if we go book shopping every time we need to look up a word in the dictionary."
				+ " Use of an article can also change the meaning of the noun:";
		String str[]=s.split(" ");
		for(String c:str){
			System.out.println(c);
		}	
		System.out.println("Total no. of words "+ s.length());
		System.out.println("----------------------------------------------------------------------------------");
		TreeSet<String> set=new TreeSet<String>();
		for(String c:str)
		   set.add(c);
		System.out.println("Total no. of  unique words  "+set.size()+"\n");
		for(String c:set)
			System.out.println(c);
	} 
	public static void main(String[]args){
		UniqueWords w=new UniqueWords();
		w.stringUnique();
	}
}
