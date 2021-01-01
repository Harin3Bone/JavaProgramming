package main.assignment;

import java.util.Scanner;

public class BmiCalculator {
    public void runBmiCalculator(){
        Scanner sc = new Scanner(System.in);
        System.out.println("ASSIGNMENT 1 - BMI CALCULATOR");

        System.out.print("Input your height (cm) : ");
        float height = sc.nextFloat();

        System.out.print("Input your weight (kg) : ");
        float weight = sc.nextFloat();

        float bmi = (float) (weight / Math.pow((height/100),2));
        System.out.println("Your BMI is " + bmi);
    }
}
