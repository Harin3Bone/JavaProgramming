package main.assignment;

import java.util.Scanner;

public class MaxMinNumber {
	public void runMaxMinNumber() {		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		double maxNum = 0;
		double minNum = Double.MAX_VALUE;

		System.out.println("============= MIN-MAX =============");
		System.out.println("P.S. Press minus number for exit.");

		while (true) {
			System.out.print("Please fill your number : ");
			double num = sc.nextDouble();

			if (num < 0) {
				System.out.println("MAX NUMBER = " + maxNum);
				System.out.println("MIN NUMBER = " + minNum);
				break;
			}

			if (num > maxNum) {
				maxNum = num;
			} else {
				minNum = num;
			}
		}
	}
}
