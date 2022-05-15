package assignment_dsa;
import java.io.*;
import java.util.Arrays; 

/*
 * 	"1.Sum of all Odd length Sub Arrays
https://leetcode.com/problems/sum-of-all-odd-length-subarrays/

2. Largest Sum Contiguous Subarray
https://www.geeksforgeeks.org/largest-sum-contiguous-subarray/"
 */
public class may_9 {
	public static void main (String[] args)
	{
		
		int[] arr = { 1,4,2,5,3 };

		System.out.print(OddLengthSum(arr));
		 int [] a = {-2, -3, 4, -1, -2, 1, 5, -3};
	        System.out.println("\nMaximum contiguous sum is " + maxSubArraySum(a));
	                                      
	}


	//1.Sum of all Odd length Sub Arrays
 public static int OddLengthSum(int[] arr)
	{
		int sum = 0;
		int l = arr.length;
		for(int i = 0; i < l; i++) 
		{
			for(int j = i; j < l; j += 2) 
			{
				for(int k = i; k <= j; k++) 
				{
					sum += arr[k];
				}
			}
		}
		return sum;
	}
 
 
 //2.Largest Sum Contiguous Subarray
 public static int maxSubArraySum(int a[])
 {
     int size = a.length;
     int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;

     for (int i = 0; i < size; i++)
     {
         max_ending_here = max_ending_here + a[i];
         if (max_so_far < max_ending_here)
             max_so_far = max_ending_here;
         if (max_ending_here < 0)
             max_ending_here = 0;
     }
     return max_so_far;
 }

}
