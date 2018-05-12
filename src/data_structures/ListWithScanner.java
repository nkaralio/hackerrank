package data_structures;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/**
 * Sample input:
5
12 0 1 78 12
2
Insert
5 23
Delete
0

 * Sample output:
0 1 78 12 23
 */
public class ListWithScanner {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int listSize = scan.nextInt();
        

        LinkedList<Integer> aList = new LinkedList<Integer>();

        
        for (int  i = 0 ; i < listSize; i ++ ) {
        	aList.add(scan.nextInt());        	
        }

    	
        int numOfQueries = scan.nextInt();
        scan.nextLine();
        int ind = 0;
        int el = 0;
        for (int  i = 0 ; i < numOfQueries; i ++ ) {
        	String in = scan.nextLine();
        	//System.out.println("QUERIE: " +in);
        	in= in.toLowerCase().trim();
        	if (in.equals("insert")) {
	        	ind = scan.nextInt();
	        	el = scan.nextInt();
                if (scan.hasNextLine()) {
                scan.nextLine();
                }
	        	//System.out.println("IND: " +ind + " ELE " + el);
        	} else if (in.equals("delete")) {
               	ind = scan.nextInt();
                if (scan.hasNextLine()) {
                scan.nextLine();
                }
               	//System.out.println("IND: " +ind );
        	}
        	//scan.nextLine();
        	if  ( (in.equals("delete")) && (ind < aList.size()))  {
        		aList.remove(ind);
        	}
        	
        	if  ( (in.equals("insert")) && (ind <= aList.size()))  {
        		aList.add(ind, new Integer(el));
        	}
	
        }//eof for loop
        
        String out  = "";
        for (Integer a: aList) {
        	out += a + " ";
        }
        
        
        System.out.println(out.trim());
    	
    }
}