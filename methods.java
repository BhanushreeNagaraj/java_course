package java_progs;
//calling the methods without using the objects 
/*bcoz the method named with the static and if the main method is static then we 
we can only call the static  function directly else we need to create object*/
import java.util.Scanner;

public class methods {
	static int sum(int x,int y) {
		int z;
		if(x>y) {
			 z=x/y;
		}
		else {
		  z=x*y;
		}
		return z;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=1;
int b=4;
int c;
c=sum(a,b);
System.out.println(c);
Scanner sc=new Scanner(System.in);
System.out.println("enter the value of p:");
int p=sc.nextInt();
System.out.println("enter the value of the q");
int q=sc.nextInt();
int r;
r=sum(p,q);
System.out.println(r);}

}
