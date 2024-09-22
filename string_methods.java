package java_progs;

public class string_methods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String name="  Bhanu  ";
/*System.out.println(name.length());
System.out.println(name.trim());
System.out.println(name.toUpperCase());
System.out.println(name.toLowerCase());
System.out.println(name.replace('n', 't'));
System.out.println(name.startsWith("bh"));
System.out.println(name.endsWith("nu"));
System.out.println(name.charAt(2));*/
System.out.println(name.indexOf("nu"));
System.out.println(name.indexOf("an",3));
System.out.println(name.lastIndexOf("n"));
System.out.println(name.lastIndexOf("an",2));//it starts from right to left so frm "  B" dosn't consists of an hence returns -1
System.out.println(name.equals("Bhanu"));
System.out.println(name.equalsIgnoreCase("  bhanu  "));

	}

}
