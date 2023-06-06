package filehandling;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;


public class Test {

	
	public static void main(String[] args) throws IOException {
		
		System.out.println("Main start");
		
	
		
		
		String atr="dsd";
		OutputStream out = null;
		//out.flush();
		
		
		
		PrintStream ptr=new PrintStream(System.out);
		ptr.println(atr);
		int i=System.in.read();
		System.out.write(i);
		
		System.out.println(i);
		
	}

}
 