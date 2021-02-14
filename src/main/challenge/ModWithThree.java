package main.challenge;

import java.util.ArrayList;
import java.util.Scanner;

public class ModWithThree {
	public void runModWithThree() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("================== RUN APPLICATION ==================");
		System.out.print("Please enter your number : ");
		String input = sc.nextLine();
		int range = getRange(input);
		getValue(input, range);

	}

	private int getRange(String input) {
		StringBuilder range = new StringBuilder("9");

		// noinspection StringRepeatCanBeUsed
		for (int index = 1; index < (input.length()); index++) {
			range.append("9");
		}

		return Integer.parseInt(range.toString());
	}

	private void getValue(String input, int range) {
		ArrayList<Integer> numberList = new ArrayList<>();
		try {
			int number = Integer.parseInt(input);
			if (!((number % 3) == 0)) {
				System.out.println("Your number can't divide by 3");
				for (int index = 1; index <= range; index++) {
					if ((index % 3) == 0) {
						numberList.add(index);
					}
				}
				System.out.println("The number can divide by 3 are : " + numberList);

			} else {
				System.out.println("Your number can divide by 3");
			}
		} catch (Exception e) {
			System.out.println("Please input number");
		}
	}
}
