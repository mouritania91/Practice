package mouri.project.com;

import java.util.Scanner;

public class Print {
	
	

	public static void main(String[] args) {
		

		System.out.println("This is print test message.");
		
		int a = 1993;
		String s = "My name is Mouri Tania";
		boolean b = true;
		double  d = 19.93;
		
		System.out.println("Integer number is:"+ a);
		System.out.println("String is :"+s);
		System.out.println("Boolean is :"+b);
		System.out.println("Double is : "+d);
		
		System.out.println("Integer number is:"+ a +" String is : "+s+"Boolean is :"+b+" Double is : "+d);
		
		Scanner scn = new Scanner(System.in); 
		System.out.println("Enter integer data: ");
		int scnNumber = scn.nextInt();
		System.out.println("The scanned data is: "+ scnNumber);
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
