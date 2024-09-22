package java_progs;

import java.util.Scanner;

public class methods_using_obj {
	int multipy(int x,int y){
		int z;
		z=x*y;
		return z;
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the values of a and b");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c;
		methods_using_obj obj=new methods_using_obj();
		c=obj.multipy(a, b);
		System.out.println(c);

	}

}
