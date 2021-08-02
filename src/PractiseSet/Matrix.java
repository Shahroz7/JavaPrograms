package PractiseSet;
import java.util.*;


public class Matrix {
	public static void main(String[]args){
		System.out.println("Enter size of the array");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int a1[][]=new int[n][n];
		int a2[][]=new int[n][n];
		int a3[][]=new int[n][n];
		System.out.println("Enter array 1");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			a1[i][j]=scan.nextInt();
		   }
		}
		System.out.println("Enter array 2");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			a2[i][j]=scan.nextInt();
		   }
		}
		//System.out.println("Matrix Multiplication");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
				for(int k=0;k<n;k++){
					a3[i][j]=a3[i][j]+a1[i][k]*a2[k][j];
				}
			}
		}
		System.out.println("Matix after multiplication");
		for(int i=0;i<n;i++){
			for(int j=0;j<n;j++){
			System.out.println(a3[i][j]);
		    }
		}
	}
}
