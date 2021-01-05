package main.beginning;

import java.util.Scanner;

public class Condition {
    public void runCondition() {
        ifStatement();
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
}
