package com.wipro.flowcntrlstatements;

public class Ex14_fcs {
 public static void main(String[] args) {
	int n=Integer.parseInt(args[0]);
	int r,sum=0;
	while(n!=0)
	{
		r=n%10;
		sum=sum+r;
		n=n/10;
	}
	System.out.println(sum);
}
}
