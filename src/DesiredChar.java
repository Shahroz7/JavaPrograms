import java.util.Scanner;

public class DesiredChar {
   public static void main(String[] args) {
   Scanner scan = new Scanner(System.in);
   
   String inputString = "";
   char searchCharacter = ' ';
   int searchCharacterPosition = -1;
   
   System.out.println("please input your string");
   inputString = scan.nextLine();
   System.out.println("please input the character which want to search or print");
   searchCharacter = scan.next().charAt(0);
   
   for(int i=0; i<inputString.length(); i++){
   if(searchCharacter == inputString.charAt(i)){
   searchCharacterPosition = i;
   break;
   }
   else
   {
     continue;
   }
  }
  if(searchCharacterPosition != -1)
   {
     System.out.println("Occurence is found at position and character is :"+searchCharacterPosition +"-: "+searchCharacter);
   }
  else
   {
     System.out.println("sorry...the character you sare looking for is not present");
   }
     scan.close();
  }
}