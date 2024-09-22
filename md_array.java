package java_progs;

public class md_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][]flats;
		flats=new int[2][3];
			flats[0][0]=100;
			flats[0][1]=101;
			flats[0][2]=102;
			flats[1][0]=103;
			flats[1][1]=104;
			flats[1][2]=105;
			for(int i=0;i<2;i++) {
				for(int j=0;j<3;j++) {
					System.out.println(flats[i][j]);
				}
			}
				
			
	}

}
