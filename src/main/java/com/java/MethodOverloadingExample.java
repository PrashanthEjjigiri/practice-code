package com.java;

public class MethodOverloadingExample {
	 
    // Method that accepts a Number
    public void display(Number num) {
        System.out.println("Called display(Number num): " + num);
    }
 
    // Method that accepts an Integer
    public void display(Integer num) {
        System.out.println("Called display(Integer num): " + num);
    }
 
    public static void main(String[] args) {
        MethodOverloadingExample example = new MethodOverloadingExample();
 
        // Passing an Integer literal
        example.display(10); // Calls display(Integer num)
 
        // Passing a Number object
        Number number = 10.5;
        example.display(number); // Calls display(Number num)
    }
}
