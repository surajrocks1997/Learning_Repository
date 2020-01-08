import java.util.*;
/* simple example of argument passing method type question
 * Program is simply converting inch to meter
 */
public class passingArgumentEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number in inch: ");
		double a = scan.nextDouble();
		double y = toMeters(a);
		System.out.print(a + " Inch = " + y + " Meters");
		
	}
	
	public static double toMeters(double inch) {
		inch = inch * 0.0254;
		return inch;
	}
}
