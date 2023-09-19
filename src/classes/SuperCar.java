package classes;

public class SuperCar extends CarClass {
    private boolean sportMode;

    public SuperCar(String colour, String reg, String make, String model){
        sportMode = false;
    }

    public void toggeSportMode(){
        this.sportMode = !sportMode;
    }

}