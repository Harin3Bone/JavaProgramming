package main;

import main.assignment.*;
import main.beginning.*;

import java.util.ArrayList;
import java.util.Scanner;

public class JavaProgramming {
    public static void main(String[] args) {
        int ans = question(1);
        if (ans == 1) {
            lesson();
        } else if (ans == 2) {
            assignment();
        } else {
            System.exit(1);
        }

    }

    private static void lesson() {
        int ans = question(2);

        switch (ans) {
            case 1:
                Console lesson1 = new Console();
                lesson1.runSystemOut();
                break;
            case 2:
                Variable lesson2 = new Variable();
                lesson2.runVariable();
                break;
            case 3:
                Input lesson3 = new Input();
                lesson3.runScanner();
                break;
            case 4:
                Operator lesson4 = new Operator();
                lesson4.runOperator();
                break;
            case 5:
                Condition lesson5 = new Condition();
                lesson5.runCondition();
                break;
            case 6:
                Loop lesson6 = new Loop();
                lesson6.runLoop();
                break;

            default:
                System.exit(1);
        }
    }

    private static void assignment() {
        int ans = question(3);

        switch (ans) {
            case 1:
                BmiCalculator assignment1 = new BmiCalculator();
                assignment1.runBmiCalculator();
                break;
            case 2:
                OddOrEven assignment2 = new OddOrEven();
                assignment2.runOddOrEven();
                break;
            case 3:
                BanknoteAmount assignment3 = new BanknoteAmount();
                assignment3.runBankNoteAmount();
                break;
            case 4:
                MultiplicationTable assignment4 = new MultiplicationTable();
                assignment4.runMultiplicationTable();
                break;
            case 5:
                SumNumber assignment5 = new SumNumber();
                assignment5.runSumNumber();
                break;
            case 6:
                MaxMinNumber assignment6 = new MaxMinNumber();
                assignment6.runMaxMinNumber();
                break;

            default:
                System.exit(1);
        }
    }

    private static int question(int ask) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;

        if (ask == 1) {
            System.out.println("========== JAVA PROGRAMMING ==========");
            System.out.println("Please select choice to run program.");
            System.out.println("Press 1 : Learning some practice of lesson");
            System.out.println("Press 2 : Take a look for your assignment");
        }

        if (ask == 2) {
            System.out.println("Select your lesson you want to learn");
            ArrayList<String> lessonList = new ArrayList<>();
            lessonList.add("Console");
            lessonList.add("Variable");
            lessonList.add("Input");
            lessonList.add("Operator");
            lessonList.add("Condition");
            lessonList.add("Loop");

            for (int index = 0; index < lessonList.size(); index++) {
                System.out.println((index+1) + " - " + lessonList.get(index));
            }
        }

        if (ask == 3) {
            System.out.println("Select your assignment you want to see");
            ArrayList<String> assignmentList = new ArrayList<>();
            assignmentList.add("BmiCalculator");
            assignmentList.add("OddOrEven");
            assignmentList.add("BanknoteAmount");
            assignmentList.add("MultiplicationTable");
            assignmentList.add("SumNumber");
            assignmentList.add("MaxMinNumber");

            for (int index = 0; index < assignmentList.size(); index++) {
                System.out.println((index+1) + " - " + assignmentList.get(index));
            }
        }

        System.out.print("Your answer = ");
        ans = sc.nextInt();
        System.out.println("============================");

        return ans;
    }
}
