package loops;
import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       /* System.out.println("input a number ");
        int num1 = scanner.nextInt();
        System.out.println("input a second number ");
        int num2 = scanner.nextInt();


        boolean number = num1 > num2;
        if (number == true) {
            ;
            System.out.println(num1);
        } else {
            System.out.println(num2);
        }

        System.out.println("input another number ");
        int num3 = scanner.nextInt();
        boolean numbers = num3 % 2 == 0;
        if (numbers)
        {
            System.out.println("Even");
        }
        else {
            System.out.println("Odd");
        }


        */

        System.out.println("Input Red, Yellow or Green");
        String lightColour = scanner.nextLine();
        switch(lightColour) {
            case "Red":
                System.out.println("Red means STOP!");
                break;
            case "Yellow":
                System.out.println("Yellow means stop if safe to do so");
                break;
            case "Green":
                System.out.println("Green means GO!");
                break;
        }


    }


}
