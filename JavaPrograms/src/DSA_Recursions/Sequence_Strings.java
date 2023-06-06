package DSA_Recursions;

public class Sequence_Strings {

	public static void main(String[] args) {
		
		String str = "abcd";
		sequence(str);
	}

	public static void sequence(String str) {
	       
		if(str.length()==1) {
			System.out.println(str);
			return;
		}
		else {
			System.out.println(str);
            sequence(str.substring(0, str.length()-1)); 
            sequence(str.substring(1, str.length())); 
		}
		
	}

}
