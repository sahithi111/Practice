package com.wipro.arrays;

public class Ex14_arr {
public static void main(String[] args) {
	 int a[][] = new int[6][6];
	 int f=0;
	for(int i=0;i<3;i++)
	{
		for(int j=0;j<3;j++)
		{
			a[i][j]=Integer.parseInt(args[f]);
			f++;
		}
	}
	int max=a[0][0];
	for(int k=0;k<3;k++)
	{
		for(int l=0;l<3;l++)
		{
			if(a[k][l]>max)
				max=a[k][l];
		}
	}
	System.out.println(max);
}
}
