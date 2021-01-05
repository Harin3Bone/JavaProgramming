package main.assignment;

import java.util.Scanner;

public class OddOrEven {
    public void runOddOrEven() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number (without floating point) : ");
        int value = sc.nextInt();

        if (value % 2 == 0) {
            System.out.println("Your number is EVEN");
        } else {
            System.out.println("Your number is ODD");
        }

    }
}
