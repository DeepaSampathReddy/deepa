package com.simplilearn.first;

public class AdditionOf3Numbers {
	int a;
	int b;
	int c;
	
	public void add(int a,int b,int c) {
		System.out.println("addition of 3 Numbers:");
		System.out.println(a+b+c);
	}
	public static void main(String[] args) {		
		AdditionOf3Numbers ad = new AdditionOf3Numbers();
		ad.add(20, 30, 40);
	}
}
