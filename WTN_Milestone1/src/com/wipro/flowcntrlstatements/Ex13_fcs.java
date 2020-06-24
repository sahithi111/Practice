package com.wipro.flowcntrlstatements;

public class Ex13_fcs {
public static void main(String[] args) {
	int c;
	for(int i=10;i<99;i++)
	{
		c=0;
		for(int j=1;j<=i;j++)
		{
			if(i%j==0)
				c++;
				
		}
		if(c==2)
		System.out.println(i);
	}
}
}
