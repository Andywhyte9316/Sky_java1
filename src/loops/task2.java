package loops;

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input a number from 1 to 12: ");
        int month = scanner.nextInt();
        switch(month) {
            case 1:
                System.out.println("January is winter");
                break;
            case 2:
                System.out.println("February is winter");
                break;
            case 3:
                System.out.println("March is spring");
                break;
            case 4:
                System.out.println("April is spring");
                break;
            case 5:
                System.out.println("May is spring");
                break;
            case 6:
                System.out.println("June is summer");
                break;
            case 7:
                System.out.println("July is summer");
                break;
            case 8:
                System.out.println("August is summer");
                break;
            case 9:
                System.out.println("September is autumn");
                break;
            case 10:
                System.out.println("October is autumn");
                break;
            case 11:
                System.out.println("November is autumn");
                break;
            case 12:
                System.out.println("December is winter");
                break;
            default:
                System.out.println("Invalid selection");
        }






    }
}
