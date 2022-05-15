package assignment_dsa;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
 * 	"1. Write a program to read string and find the product of all the digits in that string.

String s = ""as13r52e1u2""
Output -> 60

2. Remove all the special characters in a given string
String s = ""afgt%y^u#"";
Output -> afgtyu

3. Write a program to read a string and count total number of digits, alphabets and special characters.
String s = ""12as%^y&""

Output -
Digits : 2
Alphabets : 3
Special Characters : 3

4. Remove all the special characters and Upprcase from the String

String s = ""Aste6%e#12(loP""

Output - ste6e12lo

"
 */
public class may_11 {
	public static void main(String args[])   
	{  
		
	String str= "This#string%contains^special*characters&.";   
	replaceSpecial(str);
	
	
	Scanner sc= new Scanner(System.in);
	System.out.print("\nPlease Enter Alpha Numeric Special String =  ");
	String aldisp_str = sc.nextLine();
	displayAll(aldisp_str);

	String s = "Aste6%e#12(loP";
    System.out.println("After removing uppercase characters: " + removingUpperCaseCharacters(s));
    
    System.out.println("After removing special characters: "+ removingSpecialCharacters(s));
	
	}

	private static void replaceSpecial(String str) {
		str = str.replaceAll("[^a-zA-Z0-9]", " ");  
	System.out.println(str);  
	
		
	}  
	public static void displayAll(String aldisp_str) {
		
		int i, alph, digi, spl;
		alph = digi = spl = 0;
		char ch;
		
		for(i = 0; i < aldisp_str.length(); i++)
		{
			ch = aldisp_str.charAt(i);
			if(ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z' ) {
				alph++;
			}
			else if(ch >= '0' && ch <= '9') {
				digi++;
			}
			else {
				spl++;
			}
		}		
		System.out.println("\nNumber of Alphabet Characters  =  " + alph);
		System.out.println("Number of Digit Characters     =  " + digi);
		System.out.println("Number of Special Characters   =  " + spl);
	
}
	public static String removingSpecialCharacters(String str)
    {
 
        // Create a regular expression
        String regex = "[^A-Za-z0-9]";
 
        // Compile the regex to create pattern
        // using compile() method
        Pattern pattern = Pattern.compile(regex);
 
        // Get a matcher object from pattern
        Matcher matcher = pattern.matcher(str);
 
        // Replace every matched pattern with the
        // target string using replaceAll() method
        return matcher.replaceAll("");
    }
	 public static String removingUpperCaseCharacters(String str)
	    {
	 
	        // Create a regular expression
	        String regex = "[A-Z]";
	 
	        // Compile the regex to create pattern
	        // using compile() method
	        Pattern pattern = Pattern.compile(regex);
	 
	        // Get a matcher object from pattern
	        Matcher matcher = pattern.matcher(str);
	 
	        // Replace every matched pattern with the
	        // target string using replaceAll() method
	        return matcher.replaceAll("");
	    }
	
}
