package variablesexercise;
import java.util.Scanner;

public class Variables {
    public static void main(String[] args) {
       /* String firstName = "Andrew";
        String lastName = " Whyte";

        String name = firstName + lastName;

        System.out.println(name);
        */

       /* int num1 = 3;
        int num2 = 2;
        System.out.println(num1 + num2);
        int result = num1 / num2;
        System.out.println(result);

        int num3 = 8;
        System.out.println(num3++);
        System.out.println("----------");
        System.out.println(num3);
        System.out.println("---------");
        System.out.println(++num3);

        */
        Scanner scanner = new Scanner(System.in);
        String fullName = scanner.nextLine();

        System.out.println("Hello " + fullName);

        System.out.println("input a number to add");
        int num1 = scanner.nextInt();
        System.out.println("input a second number to add");
        int num2 = scanner.nextInt();
        int total = num1 + num2;
        System.out.println("The total of your sum is " + total);



    }





}
