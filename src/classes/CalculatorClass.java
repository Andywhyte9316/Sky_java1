package classes;

public class CalculatorClass {
    private double lastAnswer = 0;

    public double getLastAnswer(){
        return lastAnswer;
    }

    public double Add(double a, double b){
        lastAnswer = a + b;
        return lastAnswer;

    }
    public double Subtract(double a, double b){
        lastAnswer = a - b;
        return lastAnswer;

    }
    public double Multiply(double a, double b){
        lastAnswer = a * b;
        return lastAnswer;

    }
    public double Divide(double a, double b){
        lastAnswer = a / b;
        return lastAnswer;

    }
}
