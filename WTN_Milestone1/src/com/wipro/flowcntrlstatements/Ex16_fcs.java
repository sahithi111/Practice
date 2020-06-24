package com.wipro.flowcntrlstatements;

public class Ex16_fcs {
public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	
	int r,sum=0;
	while(n!=0)
	{
		r=n%10;
		sum=sum*10+r;
		n=n/10;
		
	}
	System.out.println(sum);
}
}
