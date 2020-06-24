package com.wipro.flowcntrlstatements;

public class ex7_fcs {
	public static void main(String[] args) {
		char var='A';
		int temp;
		if(var>=65&&var<=90)
		{
			temp=(int)var;
	        temp=temp+32;
	        var=(char)temp;
			
			System.out.println(var);
		}
		else if(var>=97&&var<=122)
		{
			temp=(int)var;
	        temp=temp-32;
	        var=(char)temp;
		
			System.out.println(var);
}
	}
}
