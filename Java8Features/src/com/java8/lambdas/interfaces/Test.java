package com.java8.lambdas.interfaces;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*Runnable r=new MyRunnableImpl();
		Thread t=new Thread(r);
		t.start();*/
		Runnable r=()->{
			for(int i=1;i<=10;i++) {
				System.out.println("Child: "+i);
			}
		};
			
		Thread t=new Thread(r);
		t.start();

	for(int i = 1;i<=10;i++)
	{
		System.out.println("Main Thread");
	}
}

}
