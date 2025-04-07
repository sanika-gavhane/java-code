//duplicate elements in an array

import java.util.*;
class DuplicateElement
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of the array");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter array Elements");
		for(int i=0;i<n;i++)
		{
			a[i]=obj.nextInt();
		}
		System.out.println("duplicate elements");
		for(int i=0;i<n;i++)
		{
			for(int j=i+1;j<n;j++)
			{
				if(a[i]==a[j])
				{
					System.out.println(a[i]);
				}
			}
		}
	}
}