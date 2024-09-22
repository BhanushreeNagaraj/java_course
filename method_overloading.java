package java_progs;

public class method_overloading {
static void bhanu() {
	System.out.println("bhanu looooooves food");
}
static void bhanu(int a) {
	System.out.println("bhanu looooooves "+a+" varieties of food");
}
static void bhanu(int a,int b) {
	System.out.println("bhanu looooooves "+a+" varieties of food");
	System.out.println("bhanu looooooves "+b+" varieties of food");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		bhanu();
		int x=100;
		bhanu(x);
		int y=200;
		bhanu(x,y);
		

	}

}
