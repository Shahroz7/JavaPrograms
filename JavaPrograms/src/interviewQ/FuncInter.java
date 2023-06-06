package interviewQ;

interface MultipleInter{
	
	int multiply(int a,int b);
	
}

public class FuncInter {

	public static void main(String[] args) {

		MultipleInter mi= (a,b)->a*b;
		System.out.println(mi.multiply(4, 6));
		
		
	}

}
