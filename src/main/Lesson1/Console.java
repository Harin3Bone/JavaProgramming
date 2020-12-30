package main.Lesson1;

public class Console {
    public void runSystemOut() {
//      Print console without next line
        systemOutPrint();

//      Print console with next line
        systemOutPrintln();

//      \n = Next line
        backSlashN();

//      \t = Tab
        backSlashT();
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

    private void backSlashN() {
        System.out.println("Use BackSlash N :\n A \n B");
        System.out.println("*********************");
    }

    private void backSlashT() {
        System.out.println("Use BackSlash T :\n A \t B");
    }
}