package main.beginning;

public class Loop {
    public void runLoop() {
        whileLoop();
        whileWithBreak();
        whileWithContinue();

        forLoop();
        forWithBreak();
        forWithContinue();

        forLoopDecrement();
        forLoopDecrementBreak();
        forLoopDecrementContinue();

        doWhileLoop();
        loopInLoopWithFor();
        loopInLoopWithWhile();
    }

    private void whileLoop() {
        int x = 0;
        while (x < 10) {
            System.out.println("whileLoop - " + x);
            x++;
        }
    }

    private void whileWithBreak() {
        int x = 1;
        while (true) {
            System.out.println("whileWithBreak - " + x);

            if (x >= 9) {
                break;
            }
            x++;
        }
    }

    private void whileWithContinue() {
        int x = 1;
        while (x < 10) {
            if (x == 5) {
                x++;
                continue;
            }

            System.out.println("whileWithContinue - " + x);

            x++;
        }
    }

    private void forLoop() {
        for (int x = 0; x <= 10; x++) {
            System.out.println("ForLoop - " + x);
        }
    }

    private void forWithBreak() {
        for (int x = 0; x <= 10; x++) {
            System.out.println("forWithBreak - " + x);
            if (x == 7) {
                break;
            }
        }
    }

    private void forWithContinue() {
        for (int x = 0; x <= 10; x++) {
            if (x == 7) {
                continue;
            }
            System.out.println("forWithContinue - " + x);
        }
    }

    private void forLoopDecrement() {
        for (int x = 10; x > 0; x--) {
            System.out.println("forLoopDecrement - " + x);
        }
    }

    private void forLoopDecrementBreak() {
        for (int x = 10; x > 0; x--) {
            System.out.println("forLoopDecrementBreak - " + x);
            if (x < 5) {
                break;
            }
        }
    }

    private void forLoopDecrementContinue() {
        for (int x = 10; x > 0; x--) {
            if (x == 4) {
                continue;
            }
            System.out.println("forLoopDecrementContinue - " + x);
        }
    }

    private void doWhileLoop() {
        int x = 3;

        //noinspection ConstantConditions,LoopConditionNotUpdatedInsideLoop,SingleStatementInBlock
        do {
            System.out.println("Different While & Do...While => " + x);
        } while (x > 3);

        System.out.println("----------------------");

        do {
            System.out.println("Number = " + x);
            x++;
        } while (x <= 7);
    }

    private void loopInLoopWithFor() {
        for (int x = 0; x <= 3; x++) {
            System.out.println("FOR Outside Loop - " + x);
            for (int y = 0; y <= 5; y++) {
                System.out.println("FOR Inside Loop - " + y);
            }
            System.out.println("----------------------");
        }
    }

    private void loopInLoopWithWhile(){
        int i = 0;
        int j;

        while (i<=3){
            System.out.println("WHILE Outside Loop - " + i);
            j = 1;
            while (j <= 5){
                System.out.println("WHILE Inside Loop - " + j);
                j++;
            }
            System.out.println("----------------------");
            i++;
        }
    }
}
