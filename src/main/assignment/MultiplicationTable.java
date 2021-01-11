package main.assignment;

public class MultiplicationTable {
    public void runMultiplicationTable(){
        System.out.println("======================= START =======================");
        for (int num = 2 ; num <= 12 ; num++){
            for (int mul = 1 ; mul <= 12 ; mul++){
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
