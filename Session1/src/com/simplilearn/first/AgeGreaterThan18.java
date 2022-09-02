package com.simplilearn.first;

import java.util.Scanner;

public class AgeGreaterThan18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter age:");
		 int age = sc.nextInt();
		 if(age > 18) {
			 System.out.println("greater than 18 ");
		 }
		 else {
			 System.out.println("not greater than 18");
		 }
	}

}
