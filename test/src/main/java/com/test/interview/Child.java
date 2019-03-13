package com.test.interview;

public class Child  extends Parent{
    static{
    	System.out.println("child1");
    }
    Child(){
    	System.out.println("child2");
    }
	public static void main(String[] args) {
		Child c = new Child();
	}

}
	