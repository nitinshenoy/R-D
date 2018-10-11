package com.nitin.lambda;

public class ClientTest {

	public static void main(String[] args) {
		Interface1 myInterface1=()->System.out.println("This methods executes using lambda..");
		myInterface1.method1();
		
		System.out.println("-----------------------------");
		
		Interface2 myInterface2=name->System.out.println("Your name is:"+name);
		myInterface2.method2("Shenoy");
		
		System.out.println("-----------------------------");
		
		Interface3 myInerface3=(name,age)->{
			System.out.println("Your name is:"+name);
			System.out.println("You are "+age+" years Old..");
		};
		
		myInerface3.method3("Nitin", 22);
	}

}
