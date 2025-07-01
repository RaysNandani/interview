package com.rays.exception;

import block.Example;

public class CheckedException {

	public static void main(String[] args) {

		try {
			dad();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e);
		} 
	}
		public static void dad()throws Exception{
			mom();
		}
		public static void mom()throws Exception{
			son();
		}
		public static void son()throws Exception{
			throw new Exception("mistake");
		}
} 