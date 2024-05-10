//        Explicit Typecasting or narrowing: When we assign a big
//        datatype value to a smaller datatype variable

import java.util.Scanner;

public class ExplicitTypecasting {

    Scanner sc = new Scanner(System.in);

    public void floatToInt() {
        System.out.print("Enter float value: ");
        float num1 = sc.nextFloat();
        int num2 = (int) num1;
        System.out.println("Float to Int: " + num2);
    }

    public void intToByte() {
        System.out.print("Enter int value: ");
        int num3 = sc.nextInt();
        byte num4 = (byte) num3;
        System.out.println("Int to Byte: " + num4);
    }

    public void doubleToByte() {
        System.out.print("Enter Double value: ");
        double num5 = sc.nextDouble();
        byte num6 = (byte) num5;
        System.out.println("Double to Byte: " + num6);
    }

    public void floatToChar() {
        System.out.print("Enter float value: ");
        float num7 = sc.nextFloat();
        char num8 = (char) num7;
        System.out.println("Float to Char: " + num8);
    }

    public void longToInt() {
        System.out.print("Enter long value: ");
        long num9 = sc.nextLong();
        int num10 = (int) num9;
        System.out.println("Float to Char: " + num10);
    }

    public static void main(String[] args) {

        ExplicitTypecasting etc_obj = new ExplicitTypecasting();
        etc_obj.floatToInt();
        etc_obj.intToByte();
        etc_obj.doubleToByte();
        etc_obj.floatToChar();
        etc_obj.longToInt();
    }
}

