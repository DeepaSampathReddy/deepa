package com.simplilearn.access2;

import com.simplilearn.access1.AccessModifiers;

public class WorldChild extends AccessModifiers{
	public static void main(String[] args) {
		WorldChild am = new WorldChild();
		System.out.println("publicNum :"+am.publicNum);
		//System.out.println("defaultInt "+am.defaultInt);
		//System.out.println("privateNum "+am.privateNum);
		System.out.println("protectedNum "+am.protectedNum);
	}
}
