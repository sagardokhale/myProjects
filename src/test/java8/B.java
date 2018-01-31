package test.java8;

public interface B extends A {

public default void print() {
		
		System.out.println("Interface B print method");
	}
}
