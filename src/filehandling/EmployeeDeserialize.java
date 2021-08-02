package filehandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;


public class EmployeeDeserialize {


	public static void main(String[] args) {
	
		Employee employee=null;
		File readFile=new File("empSerialText.ser");
	
	try {
		FileInputStream fIn=new FileInputStream(readFile);
		ObjectInputStream iStream=new ObjectInputStream(fIn);
		
		employee=(Employee)iStream.readObject();
		iStream.close();
		System.out.println("Employee id: "+ employee.id);
		System.out.println("Employee Name: "+ employee.name);
	} catch (FileNotFoundException e) {
		
		e.printStackTrace();
	} catch (IOException e) {
		
		e.printStackTrace();
	} catch (ClassNotFoundException e) {
		
		e.printStackTrace();
	}

	}

}
