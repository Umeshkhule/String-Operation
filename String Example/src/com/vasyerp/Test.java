package com.vasyerp;

public class Test {	
	public static void main(String[] args) {
		String str="apple";
		//Reverse String
		String rev="";
		for(int i=str.length()-1;i>=0;i--) {
			rev+=str.charAt(i);
		}
		System.out.println("Reverse String of "+str+" is "+rev);
		//toLowerCase
		System.out.println(str.toLowerCase());
		//toUpperCase
		System.out.println(str.toUpperCase());
		//using truncate method()
//		String str1=str.substring(1,3);
//		System.out.println(str1);

		String str2=truncate(str,6);
		System.out.println(str2);

//		String str3=str.substring(0,10);
//		System.out.println(str2);
	}
	public static String truncate(String string,int length) {
		if(string.length() >= length) {
			return string.substring(2, length);
		}else {
			return string;
		}
	}
}