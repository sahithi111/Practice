package com.pract.a;

public class Test
{
	public static void main(String[] args) {
	    int input1=3521,input2=2452,input3=1352;
	    int r1,r2,r3,r11,r22,r33,r111,r222,r333,r1111,r2222,r3333;
	    r1=input1%10;
	    r2=input2%10;
	    r3=input3%10; 

	    r11=(input1/10)%10;
	    r22=(input2/10)%10; 
	    r33=(input3/10)%10; 
	    
	    r111=(input1/100)%10; 
	    r222=(input2/100)%10; 
	    r333=(input3/100)%10; 

	    r1111=input1/1000;
	    r2222=input2/1000;
	    r3333=input3/1000;


	int min1=Math.min(r1,Math.min(r11,(Math.min(r111,r1111))));
	int min2=Math.min(r2,Math.min(r22,(Math.min(r222,r2222))));
	int min3=Math.min(r3,Math.min(r33,(Math.min(r333,r3333))));

	int max1=Math.max(r1,Math.max(r11,(Math.max(r111,r1111))));
	int max2=Math.max(r2,Math.max(r22,(Math.max(r222,r2222))));
	int max3=Math.max(r3,Math.max(r33,(Math.max(r333,r3333))));
	        
		//System.out.println(min1+""+min2+""+min3+""+max1+""+max2+""+max3);
		int a=(min1+min2+min3)-(max1+max2+max3);
		
	           System.out.println(a);
		
	}
	}
