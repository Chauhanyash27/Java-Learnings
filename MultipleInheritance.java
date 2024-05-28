import java.util.Scanner;

interface DebitTransaction {
    void sendMoney(double debitAmount);
}

interface CreditTransaction{
    void receiveMoney(double creditAmount);
}

class MyBankAccount implements DebitTransaction, CreditTransaction{

    private double accountBalance;
    private String AccountNumber;


    public void accountDetails( String AccountNumber, double initialBalance){
        this.AccountNumber=AccountNumber;
        this.accountBalance =initialBalance;
    }

    public void receiveMoney ( double creditAmount){
        System.out.println("You have received Rs "+ creditAmount+" on you account");
        accountBalance+=creditAmount;
    }

    public void sendMoney(double debitAmount){
       if(debitAmount<=accountBalance){
           System.out.println("Rs "+debitAmount+" Successfully sent !!");
           accountBalance-=debitAmount;
       }
       else{
           System.out.println("Insufficient Balance");
       }
    }

    public void showBalance(){
        System.out.println("Your account " + AccountNumber+ " has balance: Rs"+accountBalance );
    }
}
    

public class MultipleInheritance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Account details like Account number and initial Balance :");
        String accountNumber=input.nextLine();
        double accountBalance=input.nextDouble();
        MyBankAccount obj_MultipleInheritance = new MyBankAccount();
        obj_MultipleInheritance.accountDetails(accountNumber,accountBalance);
        System.out.print("Enter the amount you want to send: ");
        double sendAmount = input.nextDouble();
        obj_MultipleInheritance.sendMoney(sendAmount);
        System.out.print("Enter the amount you want to receive: ");
        double receiveAmount = input.nextDouble();
        obj_MultipleInheritance.receiveMoney(receiveAmount);
        obj_MultipleInheritance.showBalance();

    }
}
