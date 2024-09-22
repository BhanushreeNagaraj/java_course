package java_progs;

public class fibinocci_series {
static int series(int n) {
	if(n<=1) {
		return n;
	}
	else {
		return series(n-1)+series(n-2);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=10;
		int num1=0,num2=1;
		System.out.println(num1);
		System.out.println(num2);
for(int i=2;i<x;i++) {
	int num3=num1+num2;
	System.out.println(num3);
	num2=num3;
	num1=num2;
	num3=0;
}
System.out.println("the fibinocci series is:"+series(x));
	}

}
