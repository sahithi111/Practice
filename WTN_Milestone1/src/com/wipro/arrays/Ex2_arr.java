package com.wipro.arrays;

public class Ex2_arr {
	public static void main(String[] args) {
		int temp;
		int a[]=new int[]{1,2,3};
		temp=a[0];
		for(int i=0;i<3;i++)
		{
			if(a[i]>temp)
			temp=a[i];
			
		}
		System.out.println(temp);
		for(int i=0;i<3;i++)
		{
			if(a[i]<temp)
			temp=a[i];
			
		}
		System.out.println(temp);
	}
}
