package inharitance;

public class animals {
    public static class Animal {
        private String type;
        private String diet;
        private int weight;
        public Animal(String type, String diet, int weight) {
            this.type = type;
            this.diet = diet;
            this.weight = weight;
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getDiet() {
            return diet;
        }

        public void setDiet(String diet) {
            this.diet = diet;
        }

        public int getWeight() {
            return weight;
        }

        public void setWeight(int weight) {
            this.weight = weight;
        }
    }

    public class mammal extends animals {
        private boolean Mammal;
    public void Mammal(boolean landBased ) {
        Mammal = true;
    }
        public void toggleLandBased(){
            this.Mammal = !Mammal;
        }

    }


}
