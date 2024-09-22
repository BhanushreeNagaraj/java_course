package java_progs;

import java.util.Scanner;

public class practice_set6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*float[] num;
num=new float[5];
 num[0]=25.6f;
 num[1]=7.8f;
 num[2]=32.4f;
 num[3]=16.6f;
 num[4]=11.6f;
 float sum=num[0]+num[1]+num[2]+num[3]+num[4];
 System.out.println("the sum of the nums is:"+sum);*/
		
Scanner sc=new Scanner(System.in);
/*System.out.println("enter the integer which is need to be check wether it is present in array or not");
int integer=sc.nextInt();
int[]arrays= {11,40,65,2,22};
if(integer>=arrays[0] && integer<=arrays[4]) {
	System.out.println("the given integer is present in the arrays");
}
else {
	System.out.println("the given integer is not in the arrays");
}*/
/*float sum=0;
float[] marks= {76,52.5f,86,92.5f,99,32.5f,64};
for(float element:marks) 
	 sum = sum+element;

float avg=sum/7;
System.out.println("the average of the marks is:"+avg);*/

/*int[][] array1={{1,2,3},
		   {4,5,6}};
int[][] array2= {{7,8,9},
		{0,4,3}};
int [][]result= {{0,0,0},
		{0,0,0}};
for(int i=0;i<2;i++) {
	for(int j=0;j<3;j++) {
		result[i][j]=array1[i][j]+array2[i][j];
		System.out.println("the result is:"+result[i][j]);
	}
}*/
/*int[] arr= {1,2,3,4,5,6};
int l=arr.length;
for(int i=0;i<l/2;i++) {
int temp=arr[i];
arr[i]=arr[l-1-i];
arr[l-1-i]=temp;

System.out.println(arr[i]);
}*/

/*int[] arr= {20,57,11,6,32};
int max=arr[0];
int min=arr[0];
for(int i=1;i<arr.length;i++) {
	if(arr[i]>max) {
		max=arr[i];
	}
}
	System.out.println("the maximum element in the array is:"+max);
	for(int j=1;j<arr.length;j++) {
		if(arr[j]<min) {
			min=arr[j];
		}
	}
		System.out.println("the minimum element in the array is:"+min);*/

int[] a= {6,17,19,34,100,45,50};
boolean sorted=true;
for(int i=0;i<=a.length;i++) {
	if(a[i]>a[i+1]) {
		sorted=false;
		break;
	}
}
System.out.println(sorted);
	/*if(sorted) {
		System.out.println("it is sorted");
	}
	else {
		System.out.println("it is not sorted");
	}*/
	}
}


