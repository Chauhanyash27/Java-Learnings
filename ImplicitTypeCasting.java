//        Implicit Typecasting or widening: When we assign a small
//        datatype value to a bigger datatype variable

import java.util.Scanner;

public class ImplicitTypeCasting {

    Scanner sc = new Scanner(System.in);

    public void byteToInt() {
        System.out.print("Enter Byte value: ");
        byte num1 = sc.nextByte();
        int num2 = num1;
        System.out.println("Byte to Int: " + num2);
    }

    public void shortToInt() {

        System.out.print("Enter Short value: ");
        short num3 = sc.nextShort();
        int num4 = num3;
        System.out.println("Short to Int: " + num4);
    }

    public void intToFloat() {

        System.out.print("Enter Int value: ");
        int num5 = sc.nextInt();
        float num6 = num5;
        System.out.println("Int to Float: " + num6);
    }

    public void charToInt() {

        System.out.print("Enter a character value: ");
        char num7 = sc.next().charAt(0);
        int num8 = num7;
        System.out.println("Char to Int: " + num8);
    }

    public void longToDouble() {

        System.out.print("Enter long value: ");
        long num9 = sc.nextByte();
        double num10 = num9;
        System.out.println("Long to Double: " + num9);
    }

    public static void main(String[] args) {

        ImplicitTypeCasting itc_obj = new ImplicitTypeCasting();

        itc_obj.byteToInt();
        itc_obj.shortToInt();
        itc_obj.intToFloat();
        itc_obj.charToInt();
        itc_obj.longToDouble();
    }
}