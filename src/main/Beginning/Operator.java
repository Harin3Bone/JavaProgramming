package main.Beginning;

public class Operator {
    public void runOperator() {
        mathOperator();
    }

    private void mathOperator() {
//        Simple of Operator => + - * / %
        double a = 10;
        double b = 20;

//        Plus
        System.out.println("A + B = " + (a + b));

//        Subtract
        System.out.println("A - B = " + (a - b));

//        Multiply
        System.out.println("A x B = " + (a * b));

//        Divide
        System.out.println("A / B = " + (a / b));

//        Modular
        System.out.println("A % B = " + (a % b));

        System.out.println("*******************");
    }
}
