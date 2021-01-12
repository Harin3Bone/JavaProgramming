package main;

import main.assignment.MaxMinNumber;
import main.beginning.*;

public class JavaProgramming {
    public static void main(String[] args) {
//        lesson();
        assignment();
    }

    private static void lesson() {
        Console lesson1 = new Console();
        lesson1.runSystemOut();

        Variable lesson2 = new Variable();
        lesson2.runVariable();

        Input lesson3 = new Input();
        lesson3.runScanner();

        Operator lesson4 = new Operator();
        lesson4.runOperator();

        Condition lesson5 = new Condition();
        lesson5.runCondition();

        Loop lesson6 = new Loop();
        lesson6.runLoop();
    }

    private static void assignment() {
//        BmiCalculator assignment1 = new BmiCalculator();
//        assignment1.runBmiCalculator();
//
//        OddOrEven assignment2 = new OddOrEven();
//        assignment2.runOddOrEven();
//
//        BanknoteAmount assignment3 = new BanknoteAmount();
//        assignment3.runBankNoteAmount();
//
//        MultiplicationTable assignment4 = new MultiplicationTable();
//        assignment4.runMultiplicationTable();
//
//        SumNumber assignment5 = new SumNumber();
//        assignment5.runSumNumber();

        MaxMinNumber assignment6 = new MaxMinNumber();
        assignment6.runMaxMinNumber();
    }

}
