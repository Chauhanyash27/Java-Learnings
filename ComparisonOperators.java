//Comparison Operators: ==, !=, <, >, <=, >=

import java.util.Scanner;

public class ComparisonOperators {

    Scanner input = new Scanner(System.in);
    int num1 = input.nextInt();
    int num2 = input.nextInt();

    public void equalTo(){
        System.out.println("Are the two numbers equal: "+ (num1==num2));
    }

    public void notEqualTo(){
        System.out.println("Are the two numbers not equal: "+ (num1!=num2));
    }

    public void lessThan(){
        System.out.println("Is "+num1+" less than "+num2+": "+(num1<num2));
    }

    public void lessThanEqual(){
        System.out.println("Is "+num1+" less than equal to "+num2+": "+(num1<=num2));
    }

    public void greaterThan(){
        System.out.println("Is "+num1+" greater than "+num2+": "+(num1>num2));
    }

    public void greaterThanEqual(){
        System.out.println("Is "+num1+" greater than equal to "+num2+": "+(num1>=num2));
    }


    public static void main(String[] args) {
        System.out.print("Enter two numbers to compare: ");
        ComparisonOperators Comparison_obj = new ComparisonOperators();
        Comparison_obj.equalTo();
        Comparison_obj.notEqualTo();
        Comparison_obj.lessThan();
        Comparison_obj.lessThanEqual();
        Comparison_obj.greaterThan();
        Comparison_obj.greaterThanEqual();
    }
}
