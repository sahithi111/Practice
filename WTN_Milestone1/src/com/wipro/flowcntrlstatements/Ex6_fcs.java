package com.wipro.flowcntrlstatements;

public class Ex6_fcs {
public static void main(String[] a) {
	int b=Integer.parseInt(a[1]);
	if((a[0]=="Female")&&(b>=1&&b<=58))
	{
		System.out.println("POI:8.2%");
	}
	else if((a[0]=="Female")&&(b>=59&&b<=100))
		System.out.println("POI:9.2%");
	else if((a[0]=="Male")&&(b>=1&&b<=58))
		System.out.println("POI:8.4%");
	else if((a[0]=="Male")&&(b>=59&&b<=100))
		System.out.println("POI:10.5%");
}
}
