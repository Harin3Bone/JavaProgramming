package main.beginning;

import java.util.Scanner;

public class Input {
    public void runScanner() {
//        inputString();
//        inputNumber();
        dotNext();
    }

    private void inputString() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input some string : ");
        String str = sc.nextLine();

        System.out.println("Input String : " + str);
        System.out.println("**************************");
    }

    private void inputNumber() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please input some Short : ");
        short numShort = sc.nextShort();

        System.out.print("Please input some Integer : ");
        int numInt = sc.nextInt();

        System.out.print("Please input some Long : ");
        long numLong = sc.nextLong();

        System.out.print("Please input some Float : ");
        float numFloat = sc.nextFloat();

        System.out.print("Please input some Double : ");
        double numDouble = sc.nextDouble();

        System.out.println("------------");
        System.out.println("Your Short = " + numShort);
        System.out.println("Your Integer = " + numInt);
        System.out.println("Your Long = " + numLong);
        System.out.println("Your Float = " + numFloat);
        System.out.println("Your Double = " + numDouble);

        System.out.println("**************************");
    }

    private void dotNext() {
        Scanner sc = new Scanner(System.in);

//        Input "Hello World" => Expect "Hello World"
        System.out.print("Input Data nextLine() : ");
        String scNextLine = sc.nextLine();

        System.out.println("------------");

//        Input "Hello World" => Expect "Hello"
        System.out.print("Input Data next() : ");
        String scNext = sc.next();

        System.out.println("NextLine : " + scNextLine);
        System.out.println("Next : " + scNext);

        System.out.println("**************************");

    }
}
