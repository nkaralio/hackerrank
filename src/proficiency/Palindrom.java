package proficiency;
import java.io.*;
import java.util.*;
/**
 * 
 * sample input
madam
 *
 */
public class Palindrom {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
       boolean flag = true;
       A = A.trim();
       A = A.toLowerCase();
       if ((A.length() == 0) || (A== null)) {
    	   flag = false;
       } else {
    	   
    	
    		   
    		   for (int i = 0 ; i < A.length()/2; i++) {
    			   if (A.charAt(i) != A.charAt(A.length()-1-i)) {
    				   flag = false;
    			   }
    		   }
    		   
    	   
    	   
    	   
    	   
       } //eof outer else
       
       //print result
       if (flag) {
    	   System.out.println("Yes");
       } else {
    	   System.out.println("No");
       }
        
    }//end of main
}