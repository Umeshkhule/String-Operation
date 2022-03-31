package com.vasyerp;

public class StringTruncate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String inputString="hello myname is umesh khule";
		String subString=inputString.substring(6,21);
		System.out.println(subString);
		String truncateString=inputString.replace(subString,"");
		System.out.println(truncateString);
	}
}
