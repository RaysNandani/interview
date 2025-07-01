
package com.rays.exception;

public class UncheckedException {

	public static void main(String[] args) {
		
		dad();
      }
	public static void dad() {
		try {
			mom();
		} catch ( RuntimeException e) {
			System.out.println("caught by son");
		}
	}
	public static void mom() {
		son();
	}
	public static void son() {
		throw new RuntimeException("heyyyy");
	}
}