package java_progs;

import java.util.Scanner;

public class factorialii {
	// using recursion method
	static int factorial(int n) {
		if(n==0||n==1) {
			return 1;
		}
		else {
			return n*factorial(n-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		System.out.println("the factorial of x is"+factorial(x));
//using normal method
		System.out.println("enter the value of n");
		Scanner c=new Scanner(System.in);
		int n=c.nextInt();
		int fact=1;
		for(int i=n;i>=1;i--) {
			fact=fact*i;
			}
		System.out.println("the factorial of"+n+"is:"+fact);
		}

}
