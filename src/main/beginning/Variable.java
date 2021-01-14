package main.beginning;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class Variable {
    public void runVariable() {
        primitive();
        variableScope();
        casting();
        nonPrimitive();
        knowString();
        checkDataType();
        tipForNumber();
        tipForPrecisionPoint();
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

    private void variableScope() {
        int globalVariable = 10;
        {
            int localVariable = 20;
            System.out.println("LocalVariable = " + globalVariable);
            System.out.println("ScopeVariable = " + localVariable);
        }
        System.out.println("LocalVariable = " + globalVariable);
    }

    private void casting() {
//        Widening Casting = convert primitive data type from less-bit into more-bit
        int wideInt = 10;
        @SuppressWarnings("wideDouble")
        double wideDouble = wideInt;

        System.out.println("WideLessBit : " + wideInt);
        System.out.println("WideMoreBit : " + wideDouble);
        System.out.println("---------");

//        Narrowing Casting = convert primitive data type from more-bit into less-bit
        double narrowDouble = 10.0;
        int narrowInt = (int) narrowDouble;
        System.out.println("NarrowLessBit : " + narrowInt);
        System.out.println("NarrowMoreBit : " + narrowDouble);
        System.out.println("********************");
    }

    private void knowString() {
        String str = "Hello";

        char chrH = 'H';
        char chrE = 'e';
        char chrL = 'l';
        char chrO = 'o';

        System.out.println("String : " + str);
        System.out.println("Char : " + chrH);
        System.out.println("GroupOfChar : " + chrH + chrE + chrL + chrL + chrO);
        System.out.println("---------");

        String numA = "10";
        String numB = "20";
        String sumStringVariable = numA + numB;
        String sumStringValue = numA + "30";
        String sumStringInt = numA + 40;

//        String cannot cast into int -> must be use Class property to help
//        int sumStringIntV2 = (int) numA + 50;
        int sumNewStringInt = Integer.parseInt(numA) + 50;
        double sumNewStringDouble = Double.parseDouble(numA) + Double.parseDouble(numB);

        System.out.println("NUM_A : " + numA);
        System.out.println("NUM_B : " + numB);
        System.out.println("String + String : " + sumStringVariable);
        System.out.println("String + ValueString : " + sumStringValue);
        System.out.println("String + Int : " + sumStringInt);
        System.out.println("StringParseInt + Int : " + sumNewStringInt);
        System.out.println("StringParseDouble + Double : " + sumNewStringDouble);
        System.out.println("********************");
    }

    private void checkDataType() {
        String str = "String";
//        Character chr = 'C';
        Integer num = 10;
//        Float flt = 10F;
//        Double dob = 10.0;

        //noinspection ConstantConditions
        boolean strBool = str instanceof String;

        //noinspection ConstantConditions
        boolean intBool = num instanceof Integer;

        //noinspection ConstantConditions
        System.out.println("Str is String = " + strBool);
        System.out.println("Str is = " + str.getClass());

        System.out.println("---------");
        //noinspection ConstantConditions
        System.out.println("Str is String = " + intBool);
        System.out.println("Str is = " + num.getClass());
    }

    private void tipForNumber() {
        int x = 1000000;
        int y = 1_000_000;
        System.out.println("X = " + x);
        System.out.println("Y = " + y);
    }

    private void tipForPrecisionPoint() {
        float x = 1f;

        System.out.println("NORMAL FLOAT = " + x);
        System.out.format("2 DIGIT FLOAT = %.2f", x);
        System.out.println("\n5 DIGIT FLOAT = " + String.format("%.5f", x));
    }
}
