package Recap;

import java.util.Scanner;
import java.util.concurrent.Callable;

public class calculatorApp {
    public static void main(String[] args) {
       /* Calculator(1, '+', 2);
        Calculator(1, '-', 2);
        Calculator(1, '*', 2);
        Calculator(1, '/', 2);
        Calculator(1, '%', 2);
        */
        Calculator(0, ' ', 0);
    }
private static int Calculator(int numberOne, char operation, int numberTwo) {
    Scanner scanner = new Scanner(System.in);

    int num1 = numberOne;
    System.out.println("input a number");
    num1 = scanner.nextInt();

    String function = String.valueOf(operation);
    System.out.println("input +, -, /, *, %, or ^");
    function = scanner.next();

    int num2 = numberTwo;
    System.out.println("input a second number");
    num2 = scanner.nextInt();

    int total = 0;
    switch (function) {
        case "+":
            total = num1 + num2;
            break;
        case "-":
            total = num1 - num2;
            break;
        case "*":
            total = num1 * num2;
            break;
        case "/":
            total = num1 / num2;
            break;
        case "%":
            total = num1 % num2;
            break;
        case "^":
            total = num1 ^ num2;
            break;
        default:
            System.out.println("Invalid Operator, choose for the following +, -, *, /, %, or ^");
    }
    System.out.println("Your total is : " + total);
    return 0;
}

}


