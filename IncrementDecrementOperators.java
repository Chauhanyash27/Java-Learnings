import java.util.Scanner;

public class IncrementDecrementOperators {

    Scanner input= new Scanner(System.in);
    int number = input.nextInt();

    public void prePostIncrement(){
        System.out.println("Number after pre increment ++"+number+" is: "+(++number) );
        System.out.println("Same number after post increment "+number+"++ is: "+(number++));
    }

    public void prePostDecrement(){
        System.out.println("Number after pre decrement --"+number+" is: "+(--number) );
        System.out.println("Same number after post decrement "+number+"-- is: "+(number--));
    }

    public static void main(String[] args) {
        System.out.println("Enter a integer value: ");
        IncrementDecrementOperators IDO_obj =new IncrementDecrementOperators();
        IDO_obj.prePostIncrement();
        IDO_obj.prePostDecrement();
    }
}
