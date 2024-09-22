package java_progs;

public class explaining_note {
	static void change(int x) {
	 x=78;
	}
    static void change2(int[] arr) {
    	arr[0]=87;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a=76;
change(a);
System.out.println(a);
int[] marks= {45,78,69,34,98};
change2(marks);
System.out.println(marks[0]);
	}

}
