import java.util.Scanner;
public class AsciiValue {
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   System.out.println("please enter your string");
   String inputString = scan.nextLine();
   for(int i =0; i < inputString.length(); i++)
   {
      System.out.println("Ascii Value --"+(int)inputString.charAt(i));
   }
    scan.close();
  }
}