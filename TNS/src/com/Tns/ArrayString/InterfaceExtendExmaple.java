package com.Tns.ArrayString;

	//Parent Interface
	interface Animal {
	 void eat();   // abstract method
	}

	//Child Interface extending parent
	interface Dog extends Animal {
	 void bark();  // abstract method
	}

	//Implementation class
	class Puppy implements Dog {
	 @Override
	 public void eat() {
	     System.out.println("Dog is eating...");
	 }

	 @Override
	 public void bark() {
	     System.out.println("Dog barks...");
	 }
	}

	public class InterfaceExtendExample {
	 public static void main(String[] args) {
	     // Using interface reference
	     Dog d = new Puppy();

	     d.eat();   // from Animal interface
	     d.bark();  // from Dog interface
	 }
	}
