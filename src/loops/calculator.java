package loops;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = scanner.nextInt();
        System.out.println("input a second number ");
        int num2 = scanner.nextInt();
        System.out.println("Choose ADD, MINUS, TIMES OR DIVIDE : ");
        String function = scanner.next();

        int total = 0;

        switch (function) {
            case "ADD":
                total = num1 + num2;
                break;
            case "MINUS":
                total = num1 - num2;
                break;
            case "TIMES":
                total = num1 * num2;
                break;
            case "DIVIDE":
                total = num1 / num2;
                break;
            default:
                System.out.println("Invalid Operator, choose for the following ADD, MINUS, TIMES OR DIVIDE");

        }
        System.out.println("Your total is : " + total);




    }



}
