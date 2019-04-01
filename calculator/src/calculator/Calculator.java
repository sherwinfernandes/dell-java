package calculator;

import java.util.Scanner;
import java.util.ArrayList;

public class Calculator {

	private static Scanner inp;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		while(true) {
			double first;
			double second;
			char operator;
			double result=0;
			boolean err= false;

			try{
				Scanner inp = new Scanner(System.in);
				System.out.println("Enter the first number");
				first = inp.nextDouble();
				System.out.println("Enter the second number");
				second= inp.nextDouble();
				System.out.println("Enter the math operator");
				operator= inp.next().charAt(0);
				inp.close();

				if (operator == '+') {
					result = addition (first,second);
				}
				else if (operator == '-') {
					result = subtraction (first,second);
				}
				else if (operator == '*') {
					result = multiplication (first,second);
				}
				else if (operator == '/') {
					result = division (first,second);
				}
				else if (operator == '%') {
					result = modulus (first,second);
				}
				else {
					err= true;
					System.out.println("bad operator");
				}
				if (!err)
					System.out.println(result);
			}
			catch(Exception e) {
				e.printStackTrace(System.err);
			}finally {
//				inp.close();
			}
//		}
	}
	
	private static double addition (double a, double b) {
		return a+b;
	}

	private static double subtraction (double a, double b) {
		return a-b;
	}
	
	private static double multiplication (double a, double b) {
		return a*b;
	}
	
	private static double division (double a, double b) {
		return a/b;
	}
	
	private static double modulus (double a, double b) {
		return a%b;
	}
	
}
