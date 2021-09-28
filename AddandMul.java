package task27sept;
import java.util.Scanner;
public class AddandMul {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First Number");
	int a=sc.nextInt();
	System.out.println("Enter First Number");
	int b=sc.nextInt();
	System.out.println("Selecct operator + or -");
	char ch=sc.next().charAt(0);
	if(ch=='+') {
		System.out.println("Sum of two Number : "+add(a,b));
	}
	else {
		System.out.println("multiplication  of two Number : "+mul(a,b));
	}
    
	
}
public static int add(int a,int b) {
	return a+b;
}
public static int mul(int a,int b) {
	return a*b;
}
}
