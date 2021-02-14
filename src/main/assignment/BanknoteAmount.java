package main.assignment;

import java.util.Scanner;

public class BanknoteAmount {
    public void runBankNoteAmount() {
        System.out.println("Banknote Amount");
        System.out.println("-------------------------");

        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Please input your money : ");
        int get = sc.nextInt();
        int count = 0;

        if (get >= 1000) {
            count = get / 1000;
            get = get % 1000;
            System.out.println("Bank 1000 : " + count + " paper");
        }

        if (get >= 500) {
            count = get / 500;
            get = get % 500;
            System.out.println("Bank 500 : " + count + " paper");
        }

        if (get >= 100) {
            count = get / 100;
            get = get % 100;
            System.out.println("Bank 100 : " + count + " paper");
        }

        if (get >= 50) {
            count = get / 50;
            get = get % 50;
            System.out.println("Bank 50 : " + count + " paper");
        }

        if (get >= 20) {
            count = get / 20;
            get = get % 20;
            System.out.println("Bank 20 : " + count + " paper");
        }

        if (get >= 10) {
            count = get / 10;
            get = get % 10;
            System.out.println("Coin 10 : " + count + " paper");
        }

        if (get >= 5) {
            count = get / 5;
            get = get % 5;
            System.out.println("Coin 5 : " + count + " paper");
            System.out.println("Coin 1 : " + get + " paper");
        }

    }
}
