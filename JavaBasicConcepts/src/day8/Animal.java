package day8;

public class Animal {
	
	String color="white";
	
	void eating() {
		System.out.println("eating.......");
	}
	
}

class Dog extends Animal{
	
	String color="Black";
	
	void eating() {
		System.out.println("eating bread.......");
		super.eating();
	}
	
	void display() {
		System.out.println(color);
		System.out.println(super.color);
	}
}
