package mouri.project.com;

import java.util.Scanner;

public class Condition {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in); 
		
		System.out.println("Enter integer 1st data: ");
		int scnNumber1 = scn.nextInt();

		
		System.out.println("Enter integer 2nd data: ");
		int scnNumber2 = scn.nextInt();
		
		if(scnNumber1 > scnNumber2) {
			System.out.println("Number 1 is gratter than number 2");
		}else if(scnNumber1 < scnNumber2) {
			System.out.println("Number 2 is gratter than number 1");
		}
		else {
			System.out.println("Number 1 & 2 are same");
		}
		
		

	}

}