package classes;

import java.sql.Driver;

public class CarMain {
    public static void main(String[] args) {

        CarClass.Car C1 =new CarClass.Car("red" ,"AD32" , "Ford", "escort", 1000);
        System.out.println(C1.getMiles());
        System.out.println(C1);
         CarDriver driver = new CarDriver();
         driver.setCar(C1);
        System.out.println(driver.getCar().milesDriven(300));

        Convertible con1 = new Convertible("red","as12","audi","TT");

        Position C2 = new Position();
        System.out.println(C2);

        CarDriver newDriver = new CarDriver();
        newDriver.setCar(C1);



        // 1 // Car Class
        // - colour
        // - reg
        // - model
        // - make
        // - miles
        // + increaseMiles
        // + Other Getters and Setters

        // 2 // Driver Class
        // - Car
        // + Drive(miles)
        // + Car Setter and Getter

        // 3 // Instantiate the Car and Driver. Test methods

        // Extension
        // 4 // Position Class
        // 5 // Give Car a position which is edited by drive
    }



}
