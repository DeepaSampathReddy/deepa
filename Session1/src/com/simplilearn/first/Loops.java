package com.simplilearn.first;

public class Loops {
	public static void main(String[] args) {
		int i=1;
		while(i<5) {
			System.out.println("while loop: " +i);
			i++;
		}
		System.out.println("do while loop");
		do {
			System.out.println(i);
			i++;
		}while(i<=6);
		System.out.println("For  loop");
		for (i=0;i<7;i++) {
			System.out.println("for loop : "+i);
		}
	}
}
