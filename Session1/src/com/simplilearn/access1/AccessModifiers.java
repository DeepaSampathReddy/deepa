package com.simplilearn.access1;

public class AccessModifiers {
	public int publicNum = 10;
	int defaultInt = 20;
	private int privateNum = 30;
	protected int protectedNum = 40;
	
	public static void main(String[] args) {
		AccessModifiers am = new AccessModifiers();
		System.out.println("publicNum :"+am.publicNum);
		System.out.println("defaultInt "+am.defaultInt);
		System.out.println("privateNum "+am.privateNum);
		System.out.println("protectedNum "+am.protectedNum);
		
	}

}
