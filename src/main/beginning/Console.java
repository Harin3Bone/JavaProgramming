package main.beginning;

public class Console {
    public void runSystemOut() {
//      Print console without next line
        systemOutPrint();

//      Print console with next line
        systemOutPrintln();

//      Escape Character
        escapeCharacter();
    }

    private void systemOutPrint() {
        System.out.print("Without NextLine :");
        System.out.print("A");
        System.out.print("B");
        System.out.print("\n*********************");
    }

    private void systemOutPrintln() {
        System.out.println("With NextLine :");
        System.out.println("A");
        System.out.println("B");
        System.out.println("*********************");
    }

    private void escapeCharacter() {
        System.out.println("Use BackSlash N :\n A \n B");
        System.out.println("------------");

        System.out.println("Use BackSlash T :\n A \t B");
    }
}