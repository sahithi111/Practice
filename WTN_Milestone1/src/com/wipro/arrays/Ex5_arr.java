package com.wipro.arrays;

public class Ex5_arr {
public static void main(String[] args) {
	int a[]=new int[] {1,2,3,4,8};
	int temp;
	int c1=a[0],c2=a[1],c3=a[0],c4=a[1];
	
	if (c1>c2)
	{
		temp=c1;
		c1=c2;
		c2=temp;
	}
for(int i=2;i<a.length;i++)
	{
		if(a[i]>c1)
		{
			c2=c1;
			c1=a[i];
		}
		else if(a[i]>c2&&a[i]!=c1)
			
		{
			c2=a[i];
		}
	}
System.out.println("largest");
System.out.println(c1);
System.out.println(c2);
if (c3<c4)
{
	temp=c3;
	c3=c4;
	c4=temp;
}
for(int i=2;i<a.length;i++)
{
	if(a[i]<c3)
	{
		c4=c3;
		c3=a[i];
	}
	else if(a[i]<c4&&a[i]!=c2)
		
	{
		c4=a[i];
	}
}
System.out.println("smallest");
System.out.println(c3);
System.out.println(c4);
}
}
