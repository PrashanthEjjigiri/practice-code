package com.java;

public class TestClass {

	public static void main(String[] args) {
	     someMethod(1);
	}
	public static void someMethod(Integer o) {
	 System.out.println("Object method Invoked");
	}
	public static void someMethod(int s) {
	 System.out.println("String method Invoked");
	}
}
