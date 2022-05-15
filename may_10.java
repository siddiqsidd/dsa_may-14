package assignment_dsa;
import java.util.*;
import java.util.Arrays;
/*

1. Check if the sentence is Pangram
https://leetcode.com/problems/check-if-the-sentence-is-pangram/

2. Valid Anagram
https://leetcode.com/problems/valid-anagram/"""
 */
public class may_10 {
	public static void main(String[] args)
	{
		String str = "The quick brown fox jumps over the lazy dog";

		if (checkPangram(str) == true)
			System.out.print(str + "\n is a pangram.");
		else
			System.out.print(str + "\n is not a pangram.");
		

		char str1[] = { 't', 'e', 's', 't' };
		char str2[] = { 't', 't', 'e', 'w' };
	
		// Function Call
		if (areAnagram(str1, str2))
			System.out.println("\nThe two strings are"
							+ " anagram of each other");
		else
			System.out.println("\nThe two strings are not"
							+ " anagram of each other");
	
	
}
	
	
	//1. Check if the sentence is Pangram
		public static boolean checkPangram(String str)
		{
			boolean[] mark = new boolean[26];
			int index = 0;
			for (int i = 0; i < str.length(); i++) {
				if ('A' <= str.charAt(i) && str.charAt(i) <= 'Z')
					index = str.charAt(i) - 'A';
				else if ('a' <= str.charAt(i) && str.charAt(i) <= 'z')

					index = str.charAt(i) - 'a';
				else
					continue;
				mark[index] = true;
			}
			for (int i = 0; i <= 25; i++)
				if (mark[i] == false)
					return (false);
			return (true);
		}
		
		
//2. Valid Anagram	

			public static boolean areAnagram(char[] str1, char[] str2)
			{
				int n1 = str1.length;
				int n2 = str2.length;
				if (n1 != n2)
					return false;

				Arrays.sort(str1);
				Arrays.sort(str2);

				for (int i = 0; i < n1; i++)
					if (str1[i] != str2[i])
						return false;

				return true;
			}

}
