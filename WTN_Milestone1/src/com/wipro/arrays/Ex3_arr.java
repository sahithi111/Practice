package com.wipro.arrays;

public class Ex3_arr {
	public static void main(String[] args) {
		
		int n=Integer.parseInt(args[0]);
		int a[]=new int[]{1,4,34,56,7};
		for(int i=0;i<5;i++)
		{
			if(a[i]==n)
			{
				
				System.out.println(i);
			    break;	
			}
			if(i==4&&a[i]!=n)
			System.out.println("-1");
		
	}
		
}
}
