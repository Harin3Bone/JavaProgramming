package main;

import main.Beginning.Console;
import main.Beginning.Variable;

public class JavaProgramming {
    public static void main(String[] args) {
//        lesson1();
        lesson2();
    }

    private static void lesson1(){
        Console console = new Console();
        console.runSystemOut();
    }

    private static void lesson2(){
        Variable variable = new Variable();
        variable.runVariable();
    }

}
