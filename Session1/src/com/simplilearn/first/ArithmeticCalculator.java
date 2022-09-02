package com.simplilearn.first;

import java.util.Scanner;

public class ArithmeticCalculator {
	public static void main(String[] args) {
		float a,b;
		String ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter value1");
		a = sc.nextFloat();
		System.out.println("enter value2");
		b = sc.nextFloat();
		System.out.println("Please select operation to perform + - * /");
		Scanner opr = new Scanner(System.in);
		ch = opr.next();
		switch (ch) {
		case "+": {
			System.out.println("addition: " +(a+b));
			break;
		}
		case "-": {
			System.out.println("subtraction: " +(a-b));
			break;
		}
		case "*": {
			System.out.println("multipication: " +(a*b));
			break;
		}
		case "/": {
			System.out.println("division: " +(a/b));
			break;
		}
		default:
			System.out.println("please select correct vales and operation to be performed");
		}
	}

}
