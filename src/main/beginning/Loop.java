package main.beginning;

public class Loop {
    public void runLoop() {
//        whileLoop();
//        whileWithBreak();
//        whileWithContinue();

        forLoop();
        forWithBreak();
        forWithContinue();
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
            System.out.println("ForLoop - " + x);
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
            System.out.println("ForLoop - " + x);
        }
    }
}
