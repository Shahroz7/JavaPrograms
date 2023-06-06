package AdvanceSet;

public class JosephusProblem {
	
	public static void main(String[]args) {
		
		int n=5;
		int k=3;
		System.out.println(Josephus(n,k));
	}
	
	public static int Josephus(int n, int k) {
		if(n==1)
			return 0;
		int x=Josephus(n-1,k);
		int y=(x+k)%n;
		return y;
	}

}
