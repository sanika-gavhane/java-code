/*5) Left Rotate an Array by a Given Number of Positions

Implement a Java program that rotates an array to the left by a specified number of positions.*/

import java.util.*;
class LeftRotateArray
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of the array.");
		int n=obj.nextInt();
		int a[]=new int[n];
		System.out.println("Enter array .");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		
		System.out.println("Enter the index where you want perform  the roatation ");
		int inx=obj.nextInt();
		int b[]=new int[n];
		int t=0;
		for(int i=inx;i<a.length;i++,t++)
		{
			b[t]=a[i];
		}
		
		for(int i=0;i<inx;i++,t++)
		{
			b[t]=a[i];
		}
		
		System.out.println("After rotation");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(b[i]);
		}
		
	}
}
