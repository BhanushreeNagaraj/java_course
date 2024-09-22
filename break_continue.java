package java_progs;

public class break_continue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//break in for loop
		/*for(int i=0;i<5;i++) {
			System.out.println(i);
			System.out.println("Java is great");
			if(i==2) {
				System.out.println("end the loop");
				break;
			}
		}*/
// break in while loop
	/*	int j = 0;
		while( j<5) {
			System.out.println(j);
			System.out.println("Java is great");
			if(j==2) {
				System.out.println("end the loop");
				break;
			
		}
			j++;
	}
//break in do while loop
		int k=0;
		do {
				System.out.println(k);
				System.out.println("Java is great");
				if(k==2) {
					System.out.println("end the loop");
					break;
				
			}
				k++;
		}while(k<5);*/
		
		//continue in for loop
		/*for(int i=0;i<5;i++) {
			if(i==2) {
				System.out.println("skip the iteration in the loop");
				continue;
		}
			System.out.println(i);
			System.out.println("Java is great");
		}*/
		// continue in while loop
		/*int i=0;
		while(i<5) {
			i++;
			if(i==2) {
				System.out.println("skip the iteration in the loop");
				continue;
		}
			System.out.println(i);
			System.out.println("Java is great");
			
		}*/
		//continue in do while loop
		int i=0;
		do {
			i++;
			if(i==2) {
				System.out.println("skip the iteration in the loop");
				continue;
			}
				System.out.println(i);
				System.out.println("Java is great");

		

		}while(i<5);
	}
}


