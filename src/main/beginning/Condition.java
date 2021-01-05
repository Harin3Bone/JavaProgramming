package main.beginning;

import java.util.Scanner;

public class Condition {
    public void runCondition() {
//        ifStatement();
        ifElseStatement();
    }

    private void ifStatement() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Input x (number) : ");
        int x = sc.nextInt();
        System.out.print("Input y (number) : ");
        int y= sc.nextInt();

        if (x < y) {
            System.out.println("X is less than Y");
        }
    }

    private void ifElseStatement(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Input number : ");
        int value = sc.nextInt();

        int init = 50;

        if (value > init) {
            System.out.println("Value more than Initial");
        } else {
            System.out.println("Value less than Initial");
        }

    }
}
