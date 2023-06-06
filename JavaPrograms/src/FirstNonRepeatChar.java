import java.util.*;

public class FirstNonRepeatChar{
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("Enter the String");
       String inputString=scan.nextLine();
        System.out.println("The first non repeated character in ("+inputString+") is :  " + fNRC(inputString));
    }   
    public static Character fNRC(String inputString){
        Map<Character,Integer>  charMap= new LinkedHashMap<Character ,Integer>(); 
        char ar[]=inputString.toCharArray();
        char ch ;
        for (int i=0; i<ar.length; i++){
         ch=ar[i];
         if(charMap.containsKey(ch))   
             charMap.put(ch, charMap.get(ch)+1 );
         else       
        	 charMap.put(ch, 1) ;      
        }    
         for (int i=0; i<ar.length; i++ ){
         ch= ar[i];
         if( charMap.get(ch)  == 1 )   
           return ch;
        }
        return null ;
    }
}
