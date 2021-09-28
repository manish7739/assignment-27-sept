package task27sept;
import java.util.Scanner;
public class NumberCalculator {
public static void main(String args[]) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter First  number");
	int a=sc.nextInt();
	System.out.println("Enter Second  number");
	int b=sc.nextInt();
	System.out.println("Select your Operator (+ ,-,/,* )");
	char operator=sc.next().charAt(0);
	switch(operator) {
	case '+':{
		int sum=a+b;
		System.out.println("sum of two number :" +sum);
		break;
	}
	case '-':
	{
		int sub=a-b;
		System.out.println("subtract of two number :" +sub);
		break;
	}
	case '*':
	{
		int mul=a*b;
		System.out.println("multiplication of two number :" +mul);
		break;
	}
	case '/':
	{
		int div=a/b;
		System.out.println("division of two number :" +div);
		break;
	}
	default:{
		System.out.println("");
	}
	
	}
}
}
