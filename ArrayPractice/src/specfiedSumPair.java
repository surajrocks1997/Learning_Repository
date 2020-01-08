import java.util.*;
/*
 * This program matches the number that wether any pair from array produces
 * that number
 */
public class specfiedSumPair {

	public static void main(String[] args) {
		//Scanner scan= new Scanner(System.in);
		int[] array = {
				22, 25, 17, 18, 19, 20
		};
		int sum = 42;
		pairSum(array,sum);
	}

	public static void pairSum(int[] arr, int x) {
		int i,j;
		System.out.println("Sum is matched with following pairs: ");
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length;j++)
			{
				if(i==j)
					j++;
				else
				{
					if(x==arr[i]+arr[j])
						System.out.print("(" + arr[i] + "," + arr[j] + ")");
				}
			}
		}
	}
}
