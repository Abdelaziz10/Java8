package com.java8.lambdas.basics;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*A a=new C();
		a.myMethod();*/
		A a=()->System.out.println("Inside My method");;
		a.myMethod();
	}

}
