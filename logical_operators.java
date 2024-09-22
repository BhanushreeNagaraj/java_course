package java_progs;

public class logical_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//AND
		boolean a=true;
		boolean b=false;
		boolean c=true;
		if(a&&b&&c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		 
		//OR
		if(a||b||c) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		//NOT
		System.out.println("not(a) is:");
		System.out.println(!a);
		System.out.println("not(b) is:");
		System.out.println(!b);
	}

}
