package com.wipro.arrays;

public class Ex6_arr {
public static void main(String[] args) {
	int a[]=new int[] {8,6,9,7,2,1};
	int temp;
	for (int i=0;i<a.length;i++)
	{     
        for (int j=i+1;j<a.length;j++)
        {     
           if(a[i]>a[j]) {    
               temp=a[i];    
               a[i]=a[j];    
               a[j]=temp;    
           }     
        }     
    }
	for (int i=0;i<a.length;i++) 
	{     
		System.out.println(a[i]);
	}
}
}
