package main;

import main.assignment.BmiCalculator;
import main.beginning.Console;
import main.beginning.Input;
import main.beginning.Operator;
import main.beginning.Variable;

public class JavaProgramming {
    public static void main(String[] args) {
//        lesson();
        assignment();
    }

    private static void lesson(){
        Console lesson1 = new Console();
        Variable lesson2 = new Variable();
        Input lesson3 = new Input();
        Operator lesson4 = new Operator();

        lesson1.runSystemOut();
        lesson2.runVariable();
        lesson3.runScanner();
        lesson4.runOperator();
    }

    private static void assignment(){
        BmiCalculator assignment1 = new BmiCalculator();
        assignment1.runBmiCalculator();
    }

}
