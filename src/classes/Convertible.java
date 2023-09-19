package classes;

public class Convertible extends CarClass {

        private boolean roof;

public Convertible(String colour, String reg, String make, String model) {
    roof = false;
    }
    public void toogleRoof(){
    this.roof = !roof;
    }

}
