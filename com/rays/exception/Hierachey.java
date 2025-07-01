package com.rays.exception;

public class Hierachey {

	public static void main(String[] args) {
		//int i = 10 / 0;
		try {
			int i = 10 / 0;

		} catch (Exception e) {
			System.out.println(e);

//		} catch (StringIndexOutOfBoundsException e) {
//			System.out.println(e);
//			// TODO: handle exception

		} finally {
			System.out.println("finally block");
		}
	}

}