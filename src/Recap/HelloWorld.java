package Recap;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");

        //within java, you must declare the data type.

        int myNumber = 4;

        myNumber = myNumber + 10;

        System.out.println(myNumber);

        //flow control
        if (myNumber > 10) {
            System.out.println("Grater than 10");

        } else if (myNumber > 5) {
            System.out.println("Grater than 5");
        } else {
            System.out.println(myNumber);
        }

        // '||' is or, '&&' is and, '<' less than, '>' Grater than


        // Switch insure 'break' is added at the end of each condition.

        switch (myNumber){
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            default:
                System.out.println(myNumber);


        }

        myNumber = 5;

        while (myNumber > 0){
            System.out.println(myNumber);
            myNumber--;

        }

        myNumber = -5;
        // do while will always run at least once
        do{
            System.out.println(myNumber);
            myNumber--;
        } while (myNumber > 0);

        // '++' adds one to the number '--' takes one from the number

        // + adds, / divides, * times, - takes away, % modular


        myNumber = 1;

        myNumber /= 4;      // 1 / 4 = 0  int will only store a whole number
        myNumber *= 4;      // 0 * 4 = 0


        // Primitive Data Type - Can't be broken any further

        // double - decimal larger 64 bits
        // float - decimal shorter 32 bits

        //can be positive and negative
        // short - number small 16 bits
        // long - number large 64 bits
        // int - number 32 bits
        // byte - 8 bits

        // char - single character 16 bits unicode

        // boolean - true / false 1 bit

        // Non-primitive
        // Strings
        // Vectors
        // Points
        // Main
        // Scanners

        Scanner a = new Scanner(System.in);
        myNumber = a.nextInt();

        if (myNumber % 2 ==0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }

    }
}
