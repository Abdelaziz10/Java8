package com.java8.lambdas.parameters;

public class Test {

	public static void main(String[]args) {
		Sum s=(x,y)->System.out.println("Sum= "+x+y);
		s.add(5, 6);
	}
}
