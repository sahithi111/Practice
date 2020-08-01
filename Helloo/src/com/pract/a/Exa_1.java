package com.pract.a;
import java.util.Scanner;

public class Exa_1 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int N;
		N=s.nextInt();
		int[] a=new int[N];
		int mini=N-1;
		int tmp=a[0];
		for(int i=0;i<N;i++)
		{
		a[i]=s.nextInt();
		}
		for(int j=0;j<N;j++)
		{
		if(a[j]==0)
		{
		System.out.println("0");
		}
		for(int k=j+1;k<N;k++)
		{
		if(a[j]==a[k])
		{
		if(mini>(k-j))
		{
		mini=k-j;
		tmp=a[j];
		}
		break;
		}
		}
		}
		System.out.println(tmp);
		}
		}





