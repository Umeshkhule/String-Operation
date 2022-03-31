package com.vasyerp;

import java.util.Scanner;

public class AllOperation {
	
	
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Enter a String : ");
		String inputData=scanner.nextLine();
		System.out.println(inputData);
		AllOperation ap=new AllOperation();
		int ch;
		do {
			System.out.println("1. Reverse String");
			System.out.println("2. Truncate String");
			System.out.println("3. Append");
			System.out.println("4. Lower Case String");
			System.out.println("5. Upper Case String");
			System.out.println("6. Exit");
			ch=scanner.nextInt();
			switch (ch) {
			case 1:
				ap.reverse(inputData);
				break;
			case 2:
				System.out.print("Enter a starting index :");
				int startIndex=scanner.nextInt();
				System.out.print("Enter a end inndex :");
				int endIndx=scanner.nextInt();
				if (startIndex >= 0 && startIndex < inputData.length()) {
					if(inputData.length() >= endIndx && endIndx > 0) {
						String subString=inputData.substring(startIndex,endIndx);
						String truncateString=inputData.replace(subString,"");
						System.out.println("truncate string is :"+truncateString);	
					}else {
						System.out.println("End index is not correct");
					}
				} else {
					System.out.println("Start index is not correct");
				}
				break;
			case 3:
				System.out.println("Enter Append String :");
				String inputString=scanner.next();
				String appendString=inputData.concat(" "+inputString);
				System.out.println("Append String is :"+appendString);
				break;
			case 4:
				System.out.println(inputData.toLowerCase());
				break;
			case 5:
				System.out.println(inputData.toUpperCase());
				break;
				
			default:
				System.out.println("Thank You!!!");
				break;
			}
		}while(ch!=6);
		scanner.close();
	}
	
	public void reverse(String inputData) {
		String reverse="";
		for(int i=inputData.length()-1;i>=0;i--) {
			reverse+=inputData.charAt(i);
		}
		System.out.println(reverse);
	}
	
}