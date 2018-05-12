package data_structures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/**
 * Sample input
5
5 41 77 74 22 44
1 12
4 37 34 36 52
0
3 20 22 33
5
1 3
3 4
3 1
4 3
5 5
 *
 */
public class ArrayListWithScanner {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int lines = scan.nextInt();
        System.out.println("\nLINES: " + lines);
        int arrSize  = 0;
        ArrayList[] nl = new ArrayList[lines];
        
        scan.nextLine();
        for (int  i = 0 ; i < lines; i ++ ) {
        	String in = scan.nextLine();
        	System.out.println("IN: " +in);
        	String[] tokens = in.split(" ");
        	arrSize = Integer.parseInt(tokens[0]);
        	nl[i] = new ArrayList(arrSize+1);
        	for (int k = 1; k < arrSize+1; k++) {
        		nl[i].add(Integer.parseInt(tokens[k]));
        	}
        	System.out.println("Content of arraylist# "+ i + nl[i].toString() + " size " + nl[i].size());
        	
        }
    	
        int ll = 0;
        int ind = 0;
        int queries = scan.nextInt();
        System.out.println("\nQUIRIES: " + queries);
        scan.nextLine();
        
        while (scan.hasNextLine()) {
        //for (int  i = 0 ; i < queries; i ++ ) {
        	String in2 = scan.nextLine();
        	System.out.println("IN2: " +in2);
        	String[] tokens2 = in2.split(" ");
        	ll = Integer.parseInt(tokens2[0])-1;
        	ind = Integer.parseInt(tokens2[1])-1;
        	System.out.println("checking line " + ll + ", on index: " + ind);
        	
        	if (ind >= nl[ll].size()) {
        		System.out.println("ERROR1! Size on line " + ll + " is: " + nl[ll].size() + " for index of " + ind);
        	}else if (nl[ll].size() == 0) {
        		System.out.println("ERROR2!");
        	} else if (nl[ll].get(ind) != null) {
        		System.out.println(nl[ll].get(ind));
        	}
        	

        }
    	
    }
}