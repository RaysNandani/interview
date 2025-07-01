package com.rays.exception;

public class ClassNotFounDException {
	
	public static void main(String[] args) throws ClassNotFoundException {
try {
	Class<?>cls = Class.forName("com.ray.NotExistingclasss");

		System.out.println(cls.getName());
}		
	catch(ClassNotFoundException e) {
	System.out.println(e);
	}
}
}




