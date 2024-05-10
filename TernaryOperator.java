import java.util.Scanner;

public class TernaryOperator{

    public void numberEvenOdd(){
        System.out.println("Enter integer number: ");
        Scanner input = new Scanner(System.in);
        int num=input.nextInt();
        String result = (num%2==0) ? "Even" : "Odd";
        System.out.println("The entered number "+num+" is: "+result);
    }

    public void maxElement(){
        System.out.println("Enter two integer numbers: ");
        Scanner input = new Scanner(System.in);
        int num1= input.nextByte();
        int num2= input.nextByte();
        int max = (num1>num2) ? num1:num2;
        System.out.println("The max of two numbers is: "+max);
    }


    public static void main(String[] args) {
        TernaryOperator ternary_obj = new TernaryOperator();
        ternary_obj.numberEvenOdd();
        ternary_obj.maxElement();
    }
}
