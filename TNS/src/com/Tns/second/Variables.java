package com.Tns.second;

public class Variables {
	    // Instance variable
	    int instanceVar = 50;

	    // Static variable
	    static int staticVar = 100;

	    void display() {
	        // Local variable
	        int localVar = 10;
	        System.out.println("Local Variable: " + localVar);
	        System.out.println("Instance Variable: " + instanceVar);
	        System.out.println("Static Variable: " + staticVar);
	    }

	    public static void main(String[] args) {
	        Variables obj = new Variables();
	        obj.display();
	    }
	}
