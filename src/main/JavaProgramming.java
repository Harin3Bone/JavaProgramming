package main;

import main.assignment.BmiCalculator;
import main.beginning.Console;
import main.beginning.Input;
import main.beginning.Operator;
import main.beginning.Variable;

public class JavaProgramming {
    public static void main(String[] args) {
//        lesson1();
//        lesson2();
//        lesson3();
//        lesson4();
        assignment1();
    }

    private static void lesson1(){
        Console console = new Console();
        console.runSystemOut();
    }

    private static void lesson2(){
        Variable variable = new Variable();
        variable.runVariable();
    }

    private static void lesson3(){
        Input input = new Input();
        input.runScanner();
    }

    private static void lesson4(){
        Operator operator = new Operator();
        operator.runOperator();
    }

    private static void assignment1(){
        BmiCalculator bmi = new BmiCalculator();
        bmi.runBmiCalculator();
    }

}
