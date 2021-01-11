package main.assignment;

import java.util.Scanner;

public class MultiplicationTable {
    public void runMultiplicationTable(){
        System.out.println("======================= START =======================");
        Scanner sc = new Scanner(System.in);
        System.out.print("Please input your multiplication number from = ");
        int fromNum = sc.nextInt();
        System.out.print("Please input your multiplication number to = ");
        int toNum = sc.nextInt();
        System.out.print("Please input your multiplication multiply from = ");
        int fromMul = sc.nextInt();
        System.out.print("Please input your multiplication multiply to = ");
        int toMul = sc.nextInt();

        for (int num = fromNum ; num <= toNum ; num++){
            for (int mul = fromMul ; mul <= toMul ; mul++){
                System.out.println(num + " x " + mul + " = " + num*mul);
            }
            if (num != 12) {
                System.out.println("======================= BREAK =======================");
            } else {
                System.out.println("======================= FINISH =======================");
            }

        }
    }
}
