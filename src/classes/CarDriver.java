package classes;

public class CarDriver {
    private CarClass.Car car;
    public void Driver(){}

    public CarClass.Car getCar() {
        return car;
    }

    public void setCar(CarClass.Car car) {
        this.car = car;
    }

    public void milesTrip(int miles){
            car.milesDriven(miles);
        }
    }

