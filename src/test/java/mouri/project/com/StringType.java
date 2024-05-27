package mouri.project.com;

import java.util.Scanner;

public class StringType {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Enter String1: ");
		String str1 = scn.nextLine();

		
		System.out.println("Enter String2: ");
		String str2 = scn.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("String 1 and string 2 is same");
		}else if(str1.equalsIgnoreCase(str2)){
			System.out.println("String 1 and string 2 is same but exactly same");
		}else {
			System.out.println("Thge strings are not same");
		}
		

	}

}
