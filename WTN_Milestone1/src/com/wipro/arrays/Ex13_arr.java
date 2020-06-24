package com.wipro.arrays;

public class Ex13_arr {
public static void main(String[] args) {
	int n=args.length;
	 int a[][] = new int[2][2];
	if(n!=4)
			{
System.out.println("Please enter 4 integer numbers");	
}
	else
	{
		int f=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				a[i][j]=Integer.parseInt(args[f]);
				f++;
			
			System.out.println(a[i][j]);
			}
		}
	}
	System.out.println("The given array is:");
    for(int l=0;l<2;l++)
    {
        for(int m=0;m<2;m++)
        {
        System.out.print(a[l][m]+" ");
        }
        System.out.println();
        
    }
    System.out.println("The reverse of array is:");
    for(int p=1;p>=0;p--)
    {
        for(int o=1;o>=0;o--)
        {
        System.out.print(a[n][o]+" ");
        }
        System.out.println();
        
    }
}
}
