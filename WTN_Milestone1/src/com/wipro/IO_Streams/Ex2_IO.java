package com.wipro.IO_Streams;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class Ex2_IO {
	public static void main(String[] args) throws IOException {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter filename");
		String inputFilename=sc.nextLine();
		System.out.println("Enter output filename");
		String outputFilename=sc.nextLine();
	    File filein=new File(inputFilename);
		File fileout=new File(outputFilename);
		BufferedReader br=new BufferedReader(new FileReader(filein));
		BufferedWriter bw=new BufferedWriter(new FileWriter(fileout));
		
		int ch;
		while ((ch=br.read())!=-1) {
			bw.write(ch);
		};
		
		br.close();
		bw.close();
		sc.close();
	}
}
