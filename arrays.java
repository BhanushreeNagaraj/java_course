package java_progs;

public class arrays {
	public static void main(String[] args) {
		//3 main types to declare and initailize the array in java 
		//1.
		//int [] marks;
		//marks=new int[5];
		//2.
		//int [] marks=new int[5];
		//3.
		//int [] marks= {100,90,80,70,60};
		//marks[0]=100;
		//marks[1]=90;
		//marks[2]=80;
		//marks[3]=70;
		//marks[4]=60;
		//System.out.println(marks[4]);
		//System.out.println(marks.length);
		//String[] friends=new String[5];
		//String[] friends= {"nandu","kavya","abhijith","hithu","kanchi"};
		//for(int i=0;i<friends.length;i++) {
			//System.out.println(friends[i]);
		//}
	//int[] height=new int[5];
		//height[0]=5;
		//height[1]=3;
		//height[2]=6;
		//height[3]=4;
		//height[4]=5;
		//for(int j=4;j>=0;j--){
			//System.out.println(height[j]);
		//}
		//float j;
		//float[] heights=new float[5];
		//heights[0]=5f;
		//heights[1]=3f;
		//heights[2]=6f;
		//heights[3]=4f;
		//heights[4]=5f;
		//for(j=4f;j>=0;j--){
			//System.out.println(heights[j]);*/
		}
		//two dimensional arrays
	int[][]marks1=new int[2][3];{
	marks1[0][0]=100;
	marks1[0][1]=101;
	marks1[0][2]=102;
	marks1[1][0]=103;
	marks1[1][1]=104;
	marks1[1][2]=105;
	for(int i=0;i<2;i++) {
		for(int j=0;j<3;j++) {
			System.out.println(marks1[i][j]);
		}
	}
		
	
	}
 
}
