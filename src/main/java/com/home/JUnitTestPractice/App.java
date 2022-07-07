package com.home.JUnitTestPractice;

public class App {
	public static String hello() {
		return "Hello";
	}
	
	public static int factorial(int numb) {
		int ans = 1;
		for(int i = 2; i <= numb; i++) {
			ans *= i;
		}
		return ans;
	}
}