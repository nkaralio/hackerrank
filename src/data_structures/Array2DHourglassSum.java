package data_structures;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

/**
 * Sample input
1 1 1 0 0 0
0 1 0 0 0 0
1 1 1 0 0 0
0 0 2 4 4 0
0 0 0 2 0 0
0 0 1 2 4 0
 *
 *Sample output
 19
 */

public class Array2DHourglassSum {

	static int solve(int[][] arr) {
		int tmp = 0;
		int maxsum = arr[0][0]+ arr[0][1] +arr[0][2]+ 
				arr[2][0]+ arr[2][1] +arr[2][2]+ arr[1][1] ;
		int counter = 0;
        for (int i = 0; i < 4; i++) { //rows
            for (int j = 0; j < 4; j++) {  //columns
                tmp += arr[i][j] + arr[i][j+1] + arr[i][j+2] + //top
                	   arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2] +  //bottom
                	   arr[i+1][j+1] 	; //middle
                
                if (tmp > maxsum) {
                	maxsum = tmp;
                }
                //System.out.println(counter + " SUM: " + tmp);
                counter++;
                //reset
                tmp = 0;
            }
            
        }
		
		return maxsum;
	}

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            //scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }
        System.out.println(solve(arr));
        scanner.close();
        
    }
}