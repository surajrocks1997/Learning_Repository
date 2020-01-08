import java.util.Arrays;
/*
 * This program sorts the array in which the biggest number comes first
 * then smallest, then second biggest number, then second smallest number
 * and so on.
 */
public class alternateBigSmall {

	public static void main(String[] args) {
		int[] arr = {
				4, 6, 5, 3, 1, 7, 2, 8
		};
		int[] result = new int[arr.length];
		
		System.out.println("Original Array: " + Arrays.toString(arr));
		
		
		result = bigsmall(arr);
		
		System.out.println("Final Array:" + Arrays.toString(result));
	}
	
	public static int[] bigsmall(int array[]) {
		int i=0,j=0,k=0;
		int m=3,n=0;
		Arrays.sort(array);
		int[] a = new int[4];
		int[] b = new int[4];
		int[] temp = new int[array.length];
		for(i=0;i<4;i++)
		{
			a[j]=array[i];
			j++;
		}
		for(i=4;i<array.length;i++)
		{
			b[k]=array[i];
			k++;
		}
		for(i=0;i<array.length;i+=2)
		{
			temp[i]=b[m];
			m--;
		}
		
		
		for(i=1;i<array.length;i+=2,n++)
		{
			temp[i]=a[n];
		}
		array=temp;
		return array;
	}

}
