package java_progs;

import java.util.Scanner;

public class problem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
System.out.println("enter maths:");
float maths=sc.nextFloat();
System.out.println("enter java:");
float java=sc.nextFloat();
System.out.println("enter eng:");
float eng=sc.nextFloat();
System.out.println("enter technical:");
float technical=sc.nextFloat();
System.out.println("enter apttitude:");
float apttitude=sc.nextFloat();
float perc=(maths+java+eng+technical+apttitude)/500*100;
System.out.println(perc);
sc.close();
	}

}
