package main.Beginning;

public class Operator {
    public void runOperator() {
//        mathOperator();
//        comparativeOperator();
//        logicalOperator();
        incrementAndDecrement();
    }

    private void mathOperator() {
//        Simple of Operator => + - * / %
//        Can use with Number only => short , int , long , float , double
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

    @SuppressWarnings("ConstantConditions")
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

        System.out.println("A == B is " + (a == b));
        System.out.println("A > B is " + (a > b));
        System.out.println("A < B is " + (a < b));
        System.out.println("A >= B is " + (a >= b));
        System.out.println("A <= B is " + (a <= b));
        System.out.println("A != B is " + (a != b));

        System.out.println("*******************");
    }

    @SuppressWarnings("ConstantConditions")
    private void logicalOperator() {
//        && = AND , || = OR , ! = NOT
        boolean a = true;
        boolean b = false;

//        true && true = true
        System.out.println("A AND B = " + (a && b));

//        false || false = false
        System.out.println("A OR B = " + (a || b));

//        !true = false and !false = true
        System.out.println("NOT A = " + (!a));
        System.out.println("NOT B = " + (!b));
        System.out.println("*******************");
    }

    private void incrementAndDecrement() {
//        Can use with Number only => short , int , long , float , double
        int a = 1;

//        Use first and then increase value
        int b = a++;

//        Increase value first and then use
        int c = ++a;

//        Use first and then decrease value
        int d = a--;

//        Decrease value first and then use
        int e = --a;

        System.out.println("A = " + a);
        System.out.println("A++ = " + b);
        System.out.println("++A = " + c);
        System.out.println("A-- = " + d);
        System.out.println("--A = " + e);
        System.out.println("*******************");

    }
}
