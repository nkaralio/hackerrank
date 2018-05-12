package data_structures;
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 * Sample input: 
5
1 -2 4 -5 1
* Output
9
 */

public class SubArrayMaxSum {
	
	static int getsum(int[] arr, int a, int b) {
		
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum+=arr[i];
		}
		System.out.println("SUM from " + a + " to " + b + " = " + sum);
		return sum;
	}

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int arrSize = scan.nextInt();
        int[] arr = new int[arrSize];
        
        for (int  i = 0 ; i < arrSize; i ++ ) {
        	arr[i] = scan.nextInt();        	
        }
        
        int counter = 0;
        for (int i = 0 ; i < arr.length; i++ ) {
        	for (int  j = i; j < arr.length; j++ ) {
        		if (getsum(arr, i, j) < 0 ) {
        			counter++;
        		}
        		
        	}
        }
        
        System.out.println(counter);
        
        
    }
}