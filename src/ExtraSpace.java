import java.util.*;

public class ExtraSpace {
   public static void main(String[]args){
	   Scanner scan=new Scanner(System.in);
	   System.out.println("Enter String to break");
	   String s=scan.nextLine();
	   StringBuffer sb=new StringBuffer();
	   StringTokenizer st=new StringTokenizer(s," ");
	   while(st.hasMoreTokens()){
		sb.append(st.nextToken()).append(" ");
	   }
	   System.out.println(sb);
   }
}
