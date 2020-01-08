import java.util.*;
/*
 * This program matches the number from the given array
 */
public class matchingArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = scan.nextInt();
		
		int[] array2 = new int[5];
		
		for(int i=0;i<array2.length;i++)
		{
			System.out.println("a[" + i + "]: ");
			array2[i] = scan.nextInt();
		}
		
		matching(array2,n);
		
	}
	
	public static void matching(int[] array1, int num) {
		for(int n: array1) 
		{
			if(num==n) 
			{
				System.out.println("match");
			}
		}		
		
						
	} 
}
