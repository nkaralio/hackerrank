package proficiency;
import java.io.*;
import java.util.*;

public class Anagrams {
	static boolean isAnagram(String a, String b) {
		int count=0;
		boolean result  = true;
		a = a.toLowerCase().trim();
		b = b.toLowerCase().trim();
		
		if (a.length() == b.length()) {

		for (int  k = 0 ; k < a.length(); k++) {
			if (countChar(a, a.charAt(k)) != countChar(b, a.charAt(k)))  {
				result = false;
			}
		}
		
		
		
		} else {
			result = false;
		}
		return result;
    }
	
	static int countChar(String a, char c) {
		int count = 0;
		for (int i = 0; i < a.length(); i++) {
		    if (a.charAt(i) == c) {
		        count++;
		    }
		}
		return count;
	}
	
	
	public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
