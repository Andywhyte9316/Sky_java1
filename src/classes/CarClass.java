package classes;

public class CarClass {
    public static class Car {
        private String colour;
        private String reg;
        private String model;
        private String make;
        private int miles;

        public Car(String colour, String reg, String make, String model, int miles) {
            this.colour = colour;
            this.reg = reg;
            this.make = make;
            this.model =model;
            this.miles = miles;

        }

        public String getColour() {
            return colour;
        }
        public void setColour(String colour) {
            this.colour = colour;
        }

        public String getReg() {
            return reg;
        }
        public void setReg(String reg) {
            this.reg = reg;
        }

        public String getModel() {
            return model;
        }
        public void setModel(String model) {
            this.model = model;
        }

        public String getMake() {
            return make;
        }
        public void setMake(String make) {
            this.make = make;
        }

        public int getMiles() {
            return miles;
        }
        public void setMiles(int miles) {
            this.miles = miles;
        }


        public int milesDriven(int milesDone) {
            this.miles = this.miles + milesDone;
            return this.miles;
        }
    }


}
