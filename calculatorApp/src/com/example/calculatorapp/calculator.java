package com.example.calculatorapp;

public class calculator {
	public static double sum(double a, double b){
		return a + b;
	}
	
	public static double diff(double a, double b){
		if(b > a){
			return -1;
		}else{
			return a - b;
		}
	}
	
	public static double mul(double a, double b){
		return a * b;
	}
	
	public static double div(double a, double b){
		if(b == 0){
			return -1;
		}else{
		return a / b;
                }

}

}