package interviewQ;
import java.util.*;

class RemoveDupStrings{
	static void removeDupWord(String str) {

        StringTokenizer st = new StringTokenizer(str);
        Set<String> hsh = new HashSet<>();

        while (st.hasMoreTokens()) {
            String word = st.nextToken();

            while (!hsh.contains(word)) {
                System.out.print(word + " ");
                hsh.add(word);
            }
        }
    }

    public static void main(String[] args) {
        String str = "Java for Java for Computer Science portal for Java";
        removeDupWord(str);
    }
}