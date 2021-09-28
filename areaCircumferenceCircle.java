package task27sept;
import java.util.Scanner;
public class areaCircumferenceCircle {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter radius ");
		int r= sc.nextInt();
	
		System.out.println("Area of circle : " +area(r));
		System.out.println("Circumference of circle : " +circumference(r));
		
	}
public static double area(int r) {
	return (Math.PI*r*r);
}
public static double circumference(int r) {
	return (2*Math.PI*r);
}
}
