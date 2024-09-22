package java_progs;

public class varargs {
	static int sum(int ...arr) {
		int result=0;
		for(int a:arr) {
			result+=a;
		}
			return result;
			
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(sum(2,6));
System.out.println(sum(2,6,7));
System.out.println(sum(2,6,2,5));
System.out.println(sum(2,6,7,0,8));
System.out.println(sum());
	}

}
