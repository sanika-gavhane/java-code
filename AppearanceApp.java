/*find the majority element ina an array write a java program that n/2 times in an array ,where n is the array sizes*/

import java.util.*;
class AppearanceApp
{
	public static void main(String x[])
	{
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter size of the array:");
		int n=obj.nextInt();
		
		int a[]=new int[n];
		System.out.println("Enter array elemnts:");
		for(int i=0;i<a.length;i++)
		{
			a[i]=obj.nextInt();
		}
		int app=n/2;
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
				
			}
		}
		int max=0;
		int count=1;
		int index=0;
		boolean flag=false;
		for(int i=0;i<a.length;i++){
		
		if(i==n-1)
		{
			max=count;
			break;
		}
		else if(a[i]==a[i+1])
		{
			++count;
		}
		else{
			max=count;
			count=1;
		}
	
		
		if(max>(n/2))
		{
			flag=true;
			index=a[i];
			break;
		}
		else{
			flag=false;
		}
		}
		
		if(flag)	
		{
			System.out.println("majority array:"+index );
		}			
		else{
			System.out.println("no majority element is present.");
		}
	}
}