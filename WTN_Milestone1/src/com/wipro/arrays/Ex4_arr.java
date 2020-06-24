package com.wipro.arrays;

public class Ex4_arr {
	
		public static void main(String[] args) {
			
			int a[]=new int[]{97,98,99};
			char c[]=new char[3];
			for(int i=0;i<3;i++)
			{
			    char temp=(char)a[i];
				c[i]=temp;
				System.out.println(c[i]);
			}
	}
	

}
