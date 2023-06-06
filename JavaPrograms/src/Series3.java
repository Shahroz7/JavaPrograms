import java.util.*;

public class Series3 {
	public static void main(String[]args){
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter 4 dgit no. ");
		String s=scan.nextLine();
		int arr[]=new int[s.length()];
		for(int i=0;i<s.length();i++){
		arr[i]=s.charAt(i)-'0';	
		}
        for(int i=0;i<arr.length-1;i++){
        	for(int j=0;j<arr.length-1-i;j++){
        		if(arr[j]>arr[j+1]){
        			int temp=arr[j];
        			arr[j]=arr[j+1];
        			arr[j+1]=temp;
        		}
        	}
        }
        String d="";
        for(int i=0;i<arr.length;i++){
        	d=d+arr[i];
        }
        int fint=Integer.parseInt(d);
        System.out.println(fint);
        		
	}
}
