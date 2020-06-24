package com.wipro.arrays;

public class Ex7_arr {
public static void main(String[] args) {
	int a[]=new int[] {8,6,9,7,2,1,7,3,1};
	int n=a.length;
	for(int i=0;i<n-1;i++){
		for(int j=i+1;j<n;j++)
		{
			if(a[i]==a[j])
{
	a[j]=n-1;
	n--;
}
				
				
		}
		
	}
	for(int i=0;i<n;i++)
	{
      System.out.println(a[i]);
	
}
}
}
