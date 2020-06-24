package com.wipro.cls_obj;

public class Ex2 {
	

	    public static void main(String[] args) {
	    System.out.println(Calci.powerDouble(85.0,2));
	    System.out.println(Calci.powerInt(85,3));
	    }
}

	class Calci
	{
	    static double powerInt(int num1,int num2)
	    {
	        return Math.pow(num1,num2);
	    }
	    static double powerDouble(double num1,int num2)
	{
	    return Math.pow(num1,num2);
	}
	}

