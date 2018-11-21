package com.cybertek.p1;

public class A {

	// protected -> only access within class, within package, outside package by subclass only
	protected static void display() {
		System.out.println("Hello");
	}

	
	// default -> only access within class and within package
//	void display() {
//		System.out.println("Hello");
//	}
	
	
	// private -> only access within class
//	private void display() {
//		System.out.println("Hello");
//	}
	
	
	// public -> can access anywhere
//	public void display() {
//		System.out.println("Hello");
//	}

}
