import java.lang.reflect.Array;
/*
 * This program shows you the pair which is closest to 0
 */
import java.util.*;
public class sumClosetoZero {

	public static void main(String[] args) {
		int[] array = {
				14, 46, -89, 64, -12, -1, 1
		};
		
		System.out.println("Original Array: " + Arrays.toString(array));
		
		closetoZero(array);
		
	}

	public static void closetoZero(int[] arr) {
		int i=0,j=0;
		int l=0, r=arr.length-1;
		int small = arr[l]+arr[r];
		
		for(l=0;l<arr.length;l++)
		{
			for(r=arr.length-1;r>l;r--)
			{
				int temp = Math.abs(arr[l]+arr[r]);
				if(temp<small)
				{
					small=temp;
					System.out.println("Smallest sum pair is:" + arr[l] + " & " + arr[r]);
					System.out.println("Sum is: " + small);
				}
			}
		}
		
	}
}
