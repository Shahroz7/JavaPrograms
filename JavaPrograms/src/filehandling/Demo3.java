package filehandling;
import java.io.FileWriter;
import java.io.IOException;


public class Demo3 {
	
	public static void main(String[]args){
		
		String str="file handling in java with writer and reader";
        try {
			FileWriter fw=new FileWriter("text");
			
			for(int i=0;i<str.length();i++){
				fw.write(str.charAt(i));
			}
			fw.close();
		} catch (IOException e) {
			System.out.println(e);
			e.printStackTrace();
		}
	
	
	}
	
           	

}
