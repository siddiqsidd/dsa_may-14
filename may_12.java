package assignment_dsa;
import java.util.*;
/*
 * 	"""1. Convert a sentence into its equivalent mobile numeric keypad sequence
https://www.geeksforgeeks.org/convert-sentence-equivalent-mobile-numeric-keypad-sequence/

2. Find all the substrings of a given String"""
 */

	import java.util.*;
	public class may_12 
	{
		public static void main(String[] args)
		{
			// storing the sequence in array
			String str[] = {"2","22","222",
							"3","33","333",
							"4","44","444",
							"5","55","555",
							"6","66","666",
							"7","77","777","7777",
							"8","88","888",
							"9","99","999","9999"
						};

			String input = "GEEKSFORGEEKS";
			System.out.println(printSequence(str, input));
			
			String s="Abc";
			allSubset(s);
		}

		
		//2.all subset
	private static void allSubset(String str) {
		int len = str.length();  
		int temp = 0;  
		String arr[] = new String[len*(len+1)/2];  
		for(int i = 0; i < len; i++) {  
        for(int j = i; j < len; j++) {  
            arr[temp] = str.substring(i, j+1);  
            temp++;  
        }  
    }  
    System.out.println("All subsets for given string are: ");  
    for(int i = 0; i < arr.length; i++) {  
        System.out.println(arr[i]);  
    }  
}  
			
		

	public static String printSequence(String arr[],
								String input)
		{
			String output = "";
		
			int n = input.length();
			for (int i = 0; i < n; i++)
			{
				if (input.charAt(i) == ' ')
					output = output + "0";
		
				else
				{
					int position = input.charAt(i) - 'A';
					output = output + arr[position];
				}
			}
		
			return output;
		}
		

	}


