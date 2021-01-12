package main.assignment;

import java.util.Scanner;

public class SumNumber {
    public void runSumNumber() {
        sumSolutionOne();
//        sumSolutionTwo();
    }

    private void sumSolutionOne(){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("================ SUM NUMBER ================");

        do {
            System.out.print("Input number for summation (Press subtract for exit.) : ");
            double num = sc.nextDouble();

            if (num < 0) {
                System.out.println("Sum result = " + sum);
                break;
            }

            sum += num;
            System.out.println("Your current value = " + sum);
        } while (sum > 0);
    }

    public void sumSolutionTwo(){
        Scanner sc = new Scanner(System.in);
        double sum = 0;
        System.out.println("================ SUM NUMBER ================");

        while (true){
            System.out.print("Input number for summation v2 (Press subtract for exit.) : ");
            double num = sc.nextDouble();

            if (num < 0) {
                System.out.println("Sum result = " + sum);
                break;
            }

            sum += num;
            System.out.println("Your current value = " + sum);
        }
    }
}
