package com.rays.exception;

public class Mutltiple {
	
	public static void main(String[] args) {
		String[] s = {"abc"};
		try {
			System.out.println(s.length);
			System.out.println(s.length);
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println(e);
		}catch(StringIndexOutOfBoundsException e){
			System.out.println(e);
			System.exit(0);
		}finally{
			System.out.println();
		}
	}

}
