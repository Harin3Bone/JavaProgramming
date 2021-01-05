package main.beginning;

import java.util.Scanner;

public class Condition {
    public void runCondition() {
//        ifStatement();
//        ifElseStatement();
//        ifMoreThanOne();
//        avoidIfMoreThanOne();
        ternaryOperator();
    }

    private void ifStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input x (number) : ");
        int x = sc.nextInt();
        System.out.print("Input y (number) : ");
        int y = sc.nextInt();

        if (x < y) {
            System.out.println("X is less than Y");
        }
    }

    private void ifElseStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int value = sc.nextInt();

        int init = 50;

        if (value > init) {
            System.out.println("Value more than Initial");
        } else {
            System.out.println("Value less than Initial");
        }
    }

    private void ifMoreThanOne() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int number = sc.nextInt();

        if (number >= 0) {
            System.out.println("Your number >= 0");
        }

        if (number >= 10) {
            System.out.println("Your number >= 10");
        }

        if (number >= 20) {
            System.out.println("Your number >= 20");
        }
    }

    private void avoidIfMoreThanOne() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int number = sc.nextInt();

        if ((number >= 0) && (number < 10)) {
            System.out.println("Your number >= 0");
        } else if ((number >= 10) && (number < 20)) {
            System.out.println("Your number >= 10");
        } else if ((number >= 20) && (number <= 30)) {
            System.out.println("Your number >= 20");
        } else {
            System.out.println("Your number > 30");
        }
    }

    private void ternaryOperator() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input number : ");
        int number = sc.nextInt();

        String message = number < 50 ? "Less than 50" : "More than 50";
        System.out.println("Your number is " + message);
    }
}
