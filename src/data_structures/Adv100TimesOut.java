package data_structures;

import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Adv100TimesOut {

    // Complete the solve function below.
    static int solve(int[] arr) {
    	int result = 0;

    
    	for (int i = 0; i < arr.length; i++ ) {
    		for (int j = i+1; j < arr.length; j++ ) {
    			
    			if (arr[i] * arr[j] <= findMaxInRange(arr, i, j)) {
    				System.out.println( " Looking at i (a[i]): " + i + "("+ arr[i]+ ")"+"  and j: " + j + "("+ arr[j]+ ")"+ " MAX: " + findMaxInRange(arr, i, j));
    				result++;
    			} else {
    				System.out.println( " Looking at i (a[i]): " + i + "("+ arr[i]+ ")"+"  and j: " + j + "("+ arr[j]+ ")"+ " LARGER THAN MAX " + findMaxInRange(arr, i, j));
    				
    			}
    			
    		}
    	}
    
    	return result;
    }

    static int findMaxInRange (int[] arr, int a, int b) {
    	
    	int max = arr[a];
    	for (int i = a; i <= b; i++) {
    		//System.out.println(i + " Looking for max in array size of " + arr.length + " starting at " + a + " to " + b);	
    		if (arr[i] > max) {
    			max = arr[i];
    			//System.out.println(i + " FOUND MAX: " + max);
    		}
    	
    	}
    	
    	return max;
    }
    
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("out.txt"));

        int arrCount = scanner.nextInt();
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        scanner.nextLine();
        
        int[] arr = new int[arrCount];

        String[] arrItems = scanner.nextLine().split(" ");
        //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int arrItr = 0; arrItr < arrCount; arrItr++) {
            int arrItem = Integer.parseInt(arrItems[arrItr]);
            arr[arrItr] = arrItem;
        }

        int result = solve(arr);

        System.out.println(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
