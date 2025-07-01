package com.rays.exception;

public class NumberFormat {
	
    public static void main(String[] args) {
	        String s="nandani12";
	        try {
	            int i=Integer.parseInt(s);
	        }catch (NumberFormatException e){
	            System.out.println(e);
	        }
	    }
	}