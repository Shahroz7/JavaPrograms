package filehandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;



public class DemoProg{
	
	public static void main(String[]args) throws IOException{
	
		
		FileReader reader=new FileReader("info.properties");
		
		Properties p=new Properties();
        p.load(reader);
		
//		p.setProperty("name", "Computer Admin");
//		p.setProperty("email", "comp@admin.com");
//		p.setProperty("user","system");
//		p.setProperty("password","root");
//		
        System.out.println(p.getProperty("user"));
        System.out.println(p.getProperty("password"));	
	
		
		
//	p.store((new FileWriter("info.properties")), "Property File");
//	
	}
}