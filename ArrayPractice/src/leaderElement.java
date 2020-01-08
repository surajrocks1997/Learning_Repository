import java.util.*;
/*
 * This program gives you the element which is Leader in the given array.
 * meaning it is greater than all the element present on the right side of it
 */
public class leaderElement {

	public static void main(String[] args) {
		int[] array = {
				10, 14, 23, 15, 0, 9		
		};
		System.out.println("The Array: " + Arrays.toString(array));
		System.out.print("Leader Elements: ");
		leader(array);
	}
	
	public static void leader(int[] arr) {
		int i=0,j=0;
		while(i<arr.length-1)
		{
			while(j<arr.length-1)
			{
				if(arr[i]<arr[j+1])
				{
					i++;j++;
				}
				else if(arr[i]>arr[j+1])
				{
					j++;
					if(j==arr.length-1)
					{
						System.out.print(" " + arr[i]);
						i++;
						j=i;
					}
				}
			
			}
		}
		System.out.print(" " + arr[arr.length-1]);
	}

}
