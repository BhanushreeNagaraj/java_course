package java_progs;

import java.util.Scanner;

public class else_if_ladder {

	public static void main(String[] args) {
	int age;
	System.out.println("enter age");
Scanner sc=new Scanner(System.in);
age=sc.nextInt();
/*if(age>56) {
	System.out.println("u are experienced");
}
else if(age>46) {
	System.out.println("u are semi-experienced");
}
else if(age>36) {
	System.out.println("u is semi-semi-experienced");
}
else {
	System.out.println("u r not experienced");
}*/

//switch
switch(age){
	case 18:
		System.out.println("u are going to become adult");
		break;
	case 23:
		System.out.println("u are going to get a job");
		break;
	case 60:
	System.out.println("u bare going to get retirement");
	break;
	default:
		System.out.println("enjoy ur life");
}
System.out.println("thanks for using my code");
	}

}
