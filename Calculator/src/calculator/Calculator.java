package calculator;

import java.util.Scanner;

import calculator.operations.Operations;


public class Calculator {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		System.out.println("Insert first number: ");
		
		Double a = s.nextDouble(); s.nextLine();
		
		System.out.println("Insert the operation: ");
		
		String op = s.nextLine();
		
		System.out.println("Insert second number: ");
		
		Double b = s.nextDouble();
		
		Operations o = Operations.parseOperator(op);
		
		if (o == null) {
			System.err.println("Operator non regonized!");
		} else {
			o.setNumbers(a, b);
			System.out.println("Result of " + o.getName() + " is " + o.calc());
		}
		
		s.close();
		
	}

}
