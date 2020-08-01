package com.wipro.IO_Streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class Ex1_IO {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Entername");
		String filename=sc.nextLine();
		System.out.println("Enter char");
		char c=sc.nextLine().charAt(0);
	
		File file=new File(filename);
		int charCount=0;
		BufferedReader br=new BufferedReader(new FileReader(file));
		int ch;
		do {
			ch=br.read();
			
			if(ch>=65&&ch<=90) 
				ch+=32;
			if (ch>=65&&ch<=90) 
				ch+=32;
			
			if (ch==c)
				charCount++;
		} 
		while (ch!=-1);
				
		System.out.println("File '" + filename + "' has " +
				charCount+"instances of letter'"+c+"'.");
		
		br.close();
		sc.close();
	}

}
