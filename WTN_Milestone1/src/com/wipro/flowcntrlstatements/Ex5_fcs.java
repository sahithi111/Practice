package com.wipro.flowcntrlstatements;

public class Ex5_fcs {
public static void main(String[] args) {
	char var='5';
	if((var>=65&&var<=90)||(var>=97&&var<=122))
		System.out.println("Alphabet");
	else if(var>=48&&var<=57)
		System.out.println("Digit");
	else
		System.out.println("Spl Character");
}
}
