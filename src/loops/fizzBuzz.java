package loops;

public class fizzBuzz {
    public static void main(String[] args) {
        int number = 0;
        boolean count = true;

        while ( count ) {

            number++;

            if (number > 99) {
                count = false;


            }


            if (number % 3 == 0 && number % 5 == 0) {
                System.out.println(number + " FizzBuzz");
            } else if (number % 5 == 0) {
                System.out.println(number + " Buzz");
            }   else if (number % 3 == 0) {
                System.out.println(number + " Fizz");
            } else {
                System.out.println(number);
            }



        }
        }





    }

