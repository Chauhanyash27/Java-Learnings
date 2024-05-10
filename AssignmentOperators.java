// Assignment Operator: =, +=, -=, *=, /=, %=

import java.util.Scanner;

public class AssignmentOperators {

    Scanner input = new Scanner(System.in);

    public void assign(){
        System.out.print("Enter any integer value to assign: ");
        int number = input.nextInt();
        System.out.println("Value assigned to num = "+number);
   }

    public void assignAdd(){
        System.out.print("Enter any integer value: ");
        int number = input.nextInt();
        number += 10;
        System.out.println("Value after entered number += 10 : "+number);
    }

    public void assignMultiply(){
        System.out.print("Enter any integer value: ");
        int number = input.nextInt();
        number *= 10;
        System.out.println("Value after entered number *= 10 : "+number);
    }

    public void assignMod(){
        System.out.print("Enter any integer value: ");
        int number = input.nextInt();
        number %= 10;
        System.out.println("Value after entered number %= 10 : "+number);
    }

    public static void main(String[] args) {
        AssignmentOperators Assignment_obj = new AssignmentOperators();
        Assignment_obj.assign();
        Assignment_obj.assignAdd();
        Assignment_obj.assignMultiply();
        Assignment_obj.assignMod();

    }
}
