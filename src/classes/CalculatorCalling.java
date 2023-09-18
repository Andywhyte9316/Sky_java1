package classes;

public class CalculatorCalling {
    public static void main(String[] args) {
        CalculatorClass c = new CalculatorClass();
        System.out.println(c.Add(5,20));
        System.out.println(c.Subtract(5,20));
        System.out.println(c.Multiply(5,20));
        System.out.println(c.Divide(5,20));

        System.out.println(c.getLastAnswer());
        c.Add(1,2);
        System.out.println(c.getLastAnswer());

        CalculatorClass c2 = new CalculatorClass();
        c2.Add(4, 7);
    }
}
