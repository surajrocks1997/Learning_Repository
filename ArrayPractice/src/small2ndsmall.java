import java.util.*;
/*
 * This program gives smallest and second smallest element from the array
 */

public class small2ndsmall {

	public static void main(String[] args) {
		
		int[] arr = {
				11, 46, 97, 14, 34, 2
		};
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		int smallest = 0, second_small=0;
		int i=0,j=0;
		
		while(i<arr.length-1 && j<arr.length-1)
		{
			if(arr[i]<arr[j+1])
				{
				j++;
				}
			else if(arr[i]>arr[j+1])
			{
				second_small = arr[i];
				i=j+1;
				j++;
				smallest = arr[i];
			}
		}
		System.out.println("Smallest value: " + smallest );
		System.out.println("Second Smallest Value: " + second_small);

	}

}
