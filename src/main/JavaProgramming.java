package main;

import main.assignment.BanknoteAmount;
import main.assignment.BmiCalculator;
import main.assignment.OddOrEven;
import main.beginning.*;

public class JavaProgramming {
    public static void main(String[] args) {
//        lesson();
        assignment();
    }

    private static void lesson() {
//        Console lesson1 = new Console();
//        lesson1.runSystemOut();
//
//        Variable lesson2 = new Variable();
//        lesson2.runVariable();
//
//        Input lesson3 = new Input();
//        lesson3.runScanner();
//
//        Operator lesson4 = new Operator();
//        lesson4.runOperator();

        Condition lesson5 = new Condition();
        lesson5.runCondition();
    }

    private static void assignment() {
//        BmiCalculator assignment1 = new BmiCalculator();
//        assignment1.runBmiCalculator();

//        OddOrEven assignment2 = new OddOrEven();
//        assignment2.runOddOrEven();

        BanknoteAmount assignment3 = new BanknoteAmount();
        assignment3.runBankNoteAmount();
    }

}
