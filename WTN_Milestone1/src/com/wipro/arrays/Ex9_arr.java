package com.wipro.arrays;


public class Ex9_arr {
	public static void main(String[] args) {
	
		int[] a=new int[] {1,10,10,2,10};
		int n=a.length,k=0,c=0;
		int[] r=new int[] {0,0,0,0,0};
		for(int i=0;i<n;i++)
		{
			if(a[i]==10)
				c++;
		}
		while(k<n && k<(n-c))
		{
		for(int i=0;i<n;i++)
		{
				if(a[i]!=10)
				{
					r[k]=a[i];
					k++;
				}
		}
		}	
		for(int i=0;i<n;i++)
		{
			System.out.print(r[i]+" ");
		}
	}

}
