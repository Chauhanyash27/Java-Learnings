//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class TypeCasting {
    public static void main(String[] args) {
//        Implicit Typecasting or widening: When we assign a small
//        datatype value to a bigger datatype variable
        byte num1 = 2;
        int num2 = num1;     //byte to int
        double num3 = num2;   //int to double

        System.out.println("Byte value: "+num1);
        System.out.println("Byte to int: "+num2);
        System.out.println("Int to double: "+num3);

//        Explicit Typecasting or narrowing: When we assign a big
//        datatype value to a smaller datatype variable

        float num4 = 300.0290F;
        int num5 =(int) num4;
        byte num6 = (byte)num5;

        System.out.println("Float value: "+num4);
        System.out.println("Float to int: "+num5);
        System.out.println("Int to Byte: "+num6);
    }
}