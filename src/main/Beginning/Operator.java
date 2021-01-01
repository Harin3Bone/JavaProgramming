package main.Beginning;

public class Operator {
    public void runOperator() {
//        mathOperator();
        comparativeOperator();
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

    private void comparativeOperator() {
//        Compare of Operator => == , != , >= , <= , > , <

//        Type A : == , !=
//        Type B : >= , <= , > , <

//        Type A = Can use with String or Number
//        Type B = Can use with Number only => short , int , long , float , double
        double a = 10;
        double b = 20;

        System.out.println("A = " + a);
        System.out.println("B = " + b);
        System.out.println("-------------");

        //noinspection ConstantConditions
        System.out.println("A == B is " + (a == b));

        //noinspection ConstantConditions
        System.out.println("A > B is " + (a > b));

        //noinspection ConstantConditions
        System.out.println("A < B is " + (a < b));

        //noinspection ConstantConditions
        System.out.println("A >= B is " + (a >= b));

        //noinspection ConstantConditions
        System.out.println("A <= B is " + (a <= b));

        //noinspection ConstantConditions
        System.out.println("A != B is " + (a != b));
        System.out.println("*******************");
    }
}
