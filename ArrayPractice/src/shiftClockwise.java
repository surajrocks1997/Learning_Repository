import java.util.Arrays;
/*
 * This array shifts the array clockwise by 1
 */

public class shiftClockwise {

	public static void main(String[] args) {
		int[] arr = {
				12,45,78,98,65,32
		};
		System.out.println("Original Array: " + Arrays.toString(arr));
		rotate(arr);
		System.out.println("Rotated Array: " + Arrays.toString(arr));
	}

	public static int[] rotate(int[] array) {
		int last = array[array.length-1];
		int i;
		for(i=array.length-1;i>0;i--)
		{
			array[i]=array[i-1];
		}
		array[0]=last;
		return array;
	}
}
