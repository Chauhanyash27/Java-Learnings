//Logical Operators: &&, ||, !

import java.util.Scanner;

public class LogicalOperators {

    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();
    int num3 = input.nextInt();

    public void logicalAND(){
        System.out.println("Is "+num1+" greater than "+num2+ " And(&&) greater than "
                +num3+": "+(num1>num2 && num1>num3));
    }

    public void logicalOR(){
        System.out.println("Is "+num1+" greater than "+num2+ " OR(||) greater than "
                +num3+": "+(num1>num2 || num1>num3));
    }

    public void logicalNOT(){
        System.out.println("NOT(!) of above statement: " +(!(num1>num2 && num1>num3)));
    }


    public static void main(String[] args) {
        System.out.print("Enter three numbers to compare: ");
        LogicalOperators Logical_obj = new LogicalOperators();
        Logical_obj.logicalAND();
        Logical_obj.logicalOR();
        Logical_obj.logicalNOT();

    }
}
