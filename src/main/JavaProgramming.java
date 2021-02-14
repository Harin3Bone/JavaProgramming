package main;

import main.assignment.BanknoteAmount;
import main.assignment.BmiCalculator;
import main.assignment.MaxMinNumber;
import main.assignment.MultiplicationTable;
import main.assignment.OddOrEven;
import main.assignment.SumNumber;
import main.beginning.Condition;
import main.beginning.Console;
import main.beginning.Input;
import main.beginning.Loop;
import main.beginning.Operator;
import main.beginning.Variable;
import main.challenge.CamelCaseTest;
import main.challenge.LightOfEight;
import main.challenge.ModWithThree;
import main.challenge.SearchInArray;

public class JavaProgramming {
	public static void main(String[] args) {
		lesson(0);
		assignment(0);
		challgene(0);

	}

	private static void lesson(int ans) {
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

	private static void assignment(int ans) {
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

	private static void challgene(int ans) {
		switch (ans) {
		case 1:
			ModWithThree modWithThree = new ModWithThree();
			modWithThree.runModWithThree();
			break;
		case 2:
			LightOfEight lightOfEight = new LightOfEight();
			lightOfEight.runLightOfEight();
		case 3:
			SearchInArray searchInArray = new SearchInArray();
			searchInArray.runSearchInArray();
		case 4:
			CamelCaseTest camelCaseTest = new CamelCaseTest();
			camelCaseTest.runCamelCase();
		default:
			System.exit(1);

		}
	}

}
