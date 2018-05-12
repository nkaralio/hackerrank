package data_structures;
import java.util.*;
class Solution{
	
	private static boolean checkBrackets( char charAt0, char pd0 ) {
		System.out.print(" " + charAt0 + " | "+ pd0 + " ");
		boolean result = false;
		Character pd = (Character)pd0;
		Character charAt = (Character)charAt0;
		
		if   (   ((pd.equals('('))&&(charAt.equals(')'))) || ((pd.equals('{'))&&(charAt.equals('}'))) || ((pd.equals('['))&&(charAt.equals(']')))    )
		{
			result = true;
		}
		
		System.out.println("---------------------EQUAL???" + result);
		
		return result;
	}
	
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
		
		Stack<Character> opening = new Stack<Character>();
		Stack<Character> closing = new Stack<Character>();
		
		
		boolean status = true;
		char pd;
		boolean pdb;
		
		while (sc.hasNext()) {
			String input=sc.nextLine();
            //Complete 
			System.out.println("----------------------------------------STRING???" + input);
			for (int i = 0 ; i < input.length(); i++) {
				if ((input.charAt(i) == '(') || (input.charAt(i) == '{') || (input.charAt(i) == '[')) {
					opening.push(input.charAt(i));
					System.out.println(i + " Pushing " + input.charAt(i));
					
				}
				
				
				
				if ((input.charAt(i) == ')') || (input.charAt(i) == '}') || (input.charAt(i) == ']')) {
					
					pd = opening.pop();
					pdb = checkBrackets(pd, input.charAt(i) );
					if (!pdb) {
						status = false;
					}
					System.out.println(i + " Comparing " + pd + " with " + input.charAt(i)  + " status: "  + pdb) ;

				}

			}
			if ((status) && (opening.isEmpty()) ) {
				System.out.println("FINAL: true");
			} else {
				System.out.println("------------------------------------FINAL: false\n\n");
			}
			
			
			
		}//eof while
	
		
		
		
	}


}

