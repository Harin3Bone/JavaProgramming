package main.beginning;

public class Loop {
    public void runLoop() {
        whileLoop();
        whileWithBreak();
        whileWithContinue();
    }

    private void whileLoop() {
        int x = 0;
        while (x < 10) {
            System.out.println("whileLoop - " + x);
            x++;
        }
    }

    private void whileWithBreak(){
        int x = 1;
        while (true) {
            System.out.println("whileWithBreak - " + x);

            if (x >= 9){
                break;
            }
            x++;
        }
    }

    private void whileWithContinue(){
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
}
