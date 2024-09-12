package com.demo.project;

import java.util.Scanner;

public class Score_Card {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int Passing_Marks = 40;
		
		String userResponse = "yes";
	    while (userResponse.equalsIgnoreCase("yes")){
		   
	    	System.out.print("Enter the student's exam marks (0-100): ");
	    	int marks = scan.nextInt();
	    	
	    	if(marks >= Passing_Marks) {
	    		System.out.println("The student has passed the exam");
	    	}else if (marks >= 0) {
	    		System.out.println("The Student has failed the exam");
	    	} else {
	    		System.out.println("Invalid marks. Please enter the marks between 0 and 100");
	    	}
	    	
	    	System.out.print("Would you like to enter another marks? (yes/no): ");
	    	userResponse = scan.next();
	   }
	    
	    System.out.println("Exiting the program...");
	    scan.close();
		
	}

}
