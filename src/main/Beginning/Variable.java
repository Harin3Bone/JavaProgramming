package main.Beginning;

public class Variable {
    public void runVariable() {
        primitive();
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

//       TODO Each primitive data type it different size (bit)
//        boolean = 8
//        byte =8
//        short =16
//        int =32
//        long =64
//        float =32
//        double =64
//        char =16
    }
}
