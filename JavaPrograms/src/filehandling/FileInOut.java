package filehandling;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;


public class FileInOut {

	
	public static void main(String[] args) throws IOException {
	 
		FileInputStream fi=new FileInputStream("abc.txt");
	
		int i=fi.read();
		System.out.println(i);
	}
}
