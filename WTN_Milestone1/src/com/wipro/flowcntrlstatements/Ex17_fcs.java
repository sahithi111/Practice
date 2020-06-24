package com.wipro.flowcntrlstatements;

public class Ex17_fcs {
	public static void main(String[] args) {
		int n=Integer.parseInt(args[0]);
		int temp=n;
		int r,sum=0;
		while(n!=0)
		{
			r=n%10;
			sum=sum*10+r;
			n=n/10;
			
		}
		if(temp==sum)
		System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
	}
}
