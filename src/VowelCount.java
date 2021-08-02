import java.util.*;
public class VowelCount {
	public static void main(String args[]) { 
		System.out.println("Please enter the String");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine(); 
		char[] letters = input.toCharArray();
		int vcount = 0,ccount=0,scount=0,wscount=0; 
		for (char c : letters) {
			switch (c) {
			case 'a': 
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				vcount++; 
				break;
			case ' ':wscount++;
			    break;
			case '$':
			case '@':
			case '#':
				scount++;
				break;
			default:ccount++;
			} 
		}
		System.out.println("Number of vowels in String [" + input + "] is : " + vcount);
		System.out.println("Number of consonants in String [" + input + "] is : " + ccount);
		System.out.println("Number of WhiteSpace in String [" + input + "] is : " + wscount);
		System.out.println("Number of Special Characters in String [" + input + "] is : " + scount);
		} 
	}

