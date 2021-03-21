package calculatorInJava;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// Calculator in java:
		Scanner reader = new Scanner(System.in);
	    System.out.println("Enter your first number: ");
	    double first = reader.nextDouble();
	    System.out.println("Enter your second number: ");
	    double second = reader.nextDouble();

	    System.out.print("Enter an operator (+, -, *, /): ");
	    char operator = reader.next().charAt(0);

	    double result = 0.0;

	    switch (operator) {
	      case '+':
	        result = first + second;
	        break;
 
	      case '-':
	        result = first - second;
	        break;

	      case '*':
	        result = first * second;
	        break;

	      case '/':
	        result = first / second;
	        break;

	      default:
	        System.out.println("Error! operator is not correct");
	        return;
	    }

	    System.out.println(first + " " + operator + " " + second + " = " + result);

	}

}
