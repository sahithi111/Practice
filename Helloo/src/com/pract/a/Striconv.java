package com.pract.a;

public class Striconv {
	public static void main(String[] args) {
		
String s="Hi11HeLLo2PleaSe";
String s1="";
for(int i=0;i<s.length();i++)
{
	char ch=s.charAt(i);
	

	if(Character.isUpperCase(ch))
		s1=s1+Character.toLowerCase(ch);
	else if(Character.isLowerCase(ch))
		s1=s1+Character.toUpperCase(ch);
	else if(Character.isDigit(ch))
		s1=s1+"";
}
StringBuffer ob=new StringBuffer(s1);
ob.reverse();
}
}
