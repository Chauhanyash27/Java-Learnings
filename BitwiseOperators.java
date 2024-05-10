// Bitwise operators: &, |, ^, <<, >>

import java.util.Scanner;

public class BitwiseOperators {

    Scanner input = new Scanner(System.in);
    int num1= input.nextInt();
    int num2= input.nextInt();

    public void bitwiseAND(){
        System.out.println("Bitwise AND of "+num1+" and "+num2+" is: "+(num1&num2));
    }

    public void bitwiseOR(){
        System.out.println("Bitwise OR of "+num1+" and "+num2+" is: "+(num1|num2));
    }

    public void bitwiseXOR(){
        System.out.println("Bitwise XOR of "+num1+" and "+num2+" is: "+(num1^num2));
    }

    public void leftShift(){
        System.out.println("Left shift by 2 of "+num1+" is: "+(num1<<2));
    }

    public void rightShift(){
        System.out.println("Right shift by 2 of "+num1+" is: "+(num1>>2));
    }


    public static void main(String[] args) {
        System.out.println("Enter two integer numbers: ");
        BitwiseOperators Bwo_obj = new BitwiseOperators();
        Bwo_obj.bitwiseAND();
        Bwo_obj.bitwiseOR();
        Bwo_obj.bitwiseXOR();
        Bwo_obj.leftShift();
        Bwo_obj.rightShift();
    }
}
