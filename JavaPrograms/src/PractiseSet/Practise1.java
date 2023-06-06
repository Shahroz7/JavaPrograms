package PractiseSet;

import java.util.Arrays;
import java.util.List;

public class Practise1 {

    public static void main(String[] args) {
        generate("abc");
    }

    public static void generate(String word) {
        if (word.length() == 1) {
            System.out.println(word);
            return;
        }else{
            System.out.println(word);
            generate(word.substring(0, word.length()-1)); 
            generate(word.substring(1, word.length())); 
        }

    }

}