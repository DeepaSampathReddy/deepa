package com.simplilearn.first;

import java.util.Scanner;

public class SimpleIntrest {
	public static void main(String[] args) {
		float principleAmnt;
		float rateOfIntrest;
		int noOfYears;
//		Scanner pamnt = new Scanner(System.in);
//		System.out.println("please enter principleAmnt");
//		principleAmnt = pamnt.nextFloat();
//		Scanner rofinsrt = new Scanner(System.in);
//		System.out.println("please enter rate of intrest");
//		rateOfIntrest = rofinsrt.nextFloat();
//		Scanner yrs = new Scanner(System.in);
//		System.out.println("please enter no of years");
//		noOfYears = yrs.nextInt();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter principleAmnt");
		principleAmnt = sc.nextFloat();		
		System.out.println("please enter rate of intrest");
		rateOfIntrest = sc.nextFloat();		
		System.out.println("please enter no of years");
		noOfYears = sc.nextInt();
		float intrestAmnt =(principleAmnt*rateOfIntrest)/100; 
		System.out.printf("amount need to pay per month :");
		System.out.println(intrestAmnt);
		System.out.println("for "+noOfYears +" yr need to Pay intrest amnt :"+intrestAmnt*(noOfYears*12));
	}

}
