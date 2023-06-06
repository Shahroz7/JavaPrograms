package filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;



public class EmloyeeSerialize {

	public static void main(String[] args) {
	Employee employee=new Employee(1001,"Tom");
	File file=new File("empSerialText.ser");
	
	FileOutputStream fOut;
	try {
		fOut = new FileOutputStream(file);
		ObjectOutputStream oStream=new ObjectOutputStream(fOut);
		oStream.writeObject(employee);
		oStream.close();
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	
	}

}
