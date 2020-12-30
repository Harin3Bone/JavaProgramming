package main.Beginning;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Variable {
    public void runVariable() {
//        primitive();
//        nonPrimitive();
        variableScope();
    }

    private void primitive() {
//      Numeric Number
        byte byt = Byte.MAX_VALUE;
        short sht = Short.MAX_VALUE;
        int num = Integer.MAX_VALUE;
        long lng = Long.MAX_VALUE;

//      Floating Point Number (Number with digit)
        float flt = Float.MAX_VALUE;
        double dob = Double.MAX_VALUE;

//      Character 1 letter
        char chr = 'x';

//      true | false
        boolean bool = true;

        System.out.println("byte : " + byt);
        System.out.println("short : " + sht);
        System.out.println("int : " + num);
        System.out.println("long : " + lng);
        System.out.println("---------");

        System.out.println("float : " + flt);
        System.out.println("double : " + dob);
        System.out.println("---------");

        System.out.println("char : " + chr);
        System.out.println("---------");

        System.out.println("boolean : " + bool);
        System.out.println("---------");
        System.out.println("********************");
    }

    private void nonPrimitive() {
        String str = "String";

        ArrayList<String> arr = new ArrayList<>();
        arr.add("ArrayA");
        arr.add("ArrayB");
        arr.add("ArrayC");

        List<String> lst = new LinkedList<>();
        lst.add("ListA");
        lst.add("ListB");
        lst.add("ListC");

        System.out.println("String : " + str);
        System.out.println("ArrayList : " + arr);
        System.out.println("LinkedList : " + lst);
        System.out.println("********************");
    }

    private void variableScope(){
        int globalVariable = 10;
        {
            int localVariable = 20;
            System.out.println("LocalVariable = " + globalVariable);
            System.out.println("ScopeVariable = " + localVariable);
        }
        System.out.println("LocalVariable = " + globalVariable);
    }
}