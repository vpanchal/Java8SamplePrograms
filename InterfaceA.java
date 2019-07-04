package com.java;

public interface InterfaceA {
	
	default void getInterfaceName() {
		System.out.println("InterfaceA.getInterfaceName()");
	}

}
