//Arithmetic Operators: +, -, *, /, %

import java.util.Scanner;

public class ArithmeticOperators {

    Scanner input = new Scanner(System.in);

    public void addition(){
        System.out.println("Enter two integer numbers to add: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println(num1+" + "+num2+" = "+sum);

    }
    public void subtraction(){
        System.out.println("Enter two integer numbers to subtract: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int subtract = num1 - num2;
        System.out.println(num1+" - "+num2+" = "+subtract);

    }
    public void multiplication(){
        System.out.println("Enter two integer numbers to multiply: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        long multiply = num1 * num2;
        System.out.println(num1+" * "+num2+" = "+multiply);

    }
    public void division(){
        System.out.println("Enter two integer numbers to divide: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        float divide = num1 / num2;
        System.out.println(num1+" / "+num2+" = "+divide);

    }
    public void modulus(){
        System.out.println("Enter two integer numbers: ");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int mod = num1 % num2;
        System.out.println(num1+" % "+num2+" = "+mod);

    }

    public static void main(String[] args){
        ArithmeticOperators Add_obj = new ArithmeticOperators();
        Add_obj.addition();
        Add_obj.subtraction();
        Add_obj.multiplication();
        Add_obj.division();
        Add_obj.modulus();
    }

}
