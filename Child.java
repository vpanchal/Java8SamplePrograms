package com.java;

public class Child extends Parent {
    // Hiding Parent class's variable `x` by defining a variable in child class with same name.
    String x = "Child`s Instance Variable";
    @Override
    public void print() {
        System.out.print(x);
        // If we still want to access variable from super class, we do that by using `super.x`
        System.out.print(", " + super.x + "\n");
    }
    
    public static void main(String[] args) {
		Parent p = new Parent();
		System.out.println(p.x);
		p.print();
		
		Child c = new Child();
		System.out.println(c.x);
		c.print();
		
		Parent pc = new Child();
		System.out.println(pc.x);
		pc.print();
		
	}
}