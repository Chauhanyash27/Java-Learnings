import java.util.Scanner;


public class PracticeAssignment1 {

    // Question 2
    static void userStringAnalysis(String userInput) {

        // Count the number of characters in the string.
        System.out.println("Number of characters in the string are: " + userInput.length());


        // Determine if the string starts with a vowel.
        boolean check = false;
        userInput = userInput.toLowerCase();
        if(userInput.charAt(0) =='a' || userInput.charAt(0) =='e' || userInput.charAt(0) =='i' || userInput.charAt(0) =='o'
                || userInput.charAt(0) =='u') check=true;
        System.out.println("Does the string start with a vowel: " + check);


        // Convert the string to uppercase and lowercase.
        System.out.println("String covert to lowercase: "+ userInput.toLowerCase());
        System.out.println("String convert to uppercase: "+ userInput.toUpperCase());


        //  Print the reversed version of the string
        System.out.print("Reversed version of input string: ");
        for(int i=userInput.length()-1;i>=0;i--){
            System.out.print(userInput.charAt(i));
        }
    }

    // Question 3
    static void factorialOf7(){

        // Write a program to find the factorial of 7 using a while loop.
        int num=7;
        int i=6;
        while(i>0){
            num*=i;
            i--;
        }
        System.out.println("7! = 7*6*5*4*3*2*1 is " +num);
    }

    // Question 4
    static void pascalTriangle(int rows){

        // Write a program to print Pascal's triangle up to a specified number of rows.
        int arr[][] = new int[rows][rows];
        int value=1;
        for(int i=0;i<rows;i++){
            for(int j=0;j<=i;j++){
                if(i==j || j==0){
                    arr[i][j]=1;
                } else {
                    value=arr[i-1][j-1]+arr[i-1][j];
                    arr[i][j]=value;
                }
            }
        }
        for(int i=0;i<rows;i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.print("\n");
        }


    }

    // Question 5
    static void armstrongNumber(String userInput){

        // Write a Java program to check whether a given number is an Armstrong number or not using a while loop.
        int sum = 0;
        for (int i = 0; i < userInput.length(); i++) {
            char dig = userInput.charAt(i);
            int num = Character.getNumericValue(dig);
            sum += (num * num * num);
        }
        String finalSum = Integer.toString(sum);
        if (finalSum.equals(userInput)) System.out.println("Yes! Entered number is an Armstrong Number");
        else {
            System.out.println("No! Entered number is not an armstrong number");
        }
    }

    // Question 6
    static void arrayReverse(){

        // Write a program to reverse an array of integers without using any additional array.
        int arr[]={1,2,3,4,5,6,7,8,9};
        int length= arr .length;

        for(int i=0;i<length/2;i++){
            int aux_value=0;

            aux_value=arr[i];
            arr[i]=arr[length-1-i];
            arr[length-i-1]=aux_value;
        }
        System.out.println("The reverse of array 1,2,3,4,5,6,7,8,9 is: ");
        for(int i :arr)
            System.out.print(i+" ");
    }

    // Question 7
    static boolean isPalindrome(String palindromeCheck){

        // a method named isPalindrome that takes a string as input and returns true if the string is a palindrome
        // (reads the same backward as forward), otherwise returns false.
        int flag=1;
        int length=palindromeCheck.length()-1;
        for(int i=0;i<length;i++){
            if(palindromeCheck.charAt(i)!=palindromeCheck.charAt(length-i)){
                flag=0;break;
            }
        }
        if(flag==0) return false;
        else return true;
    }

    // Question 8
    static void diamondPattern(){

        // Print a Diamond pattern
        int row=5 ;
        for (int i = 0; i < row; i++) {

            for(int j=row-i;j>0;j--){
                System.out.print(" ");
            }
            for(int z=0;z<=i;z++){
                System.out.print("*");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }

        for (int i = row-1; i > 0; i--) {

            for(int j=row+1-i;j>0;j--){
                System.out.print(" ");
            }
            for(int z=0;z<i;z++){
                System.out.print("*");
            }

            for(int j=1;j<i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }


    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        // Question 2 method call
//        System.out.println("Enter a string:");
//        String inputString = input.nextLine();
//        userStringAnalysis(inputString);
//
//        // Question 3 method call
//        factorialOf7();

        // Question 4 method call
//        System.out.println("Enter the number of rows for pascal triangle: ");
//        int rows = input.nextInt();
//        pascalTriangle(rows);
////
//        //Question 5 method call
//        System.out.println("Enter a integer number");
//        String userInput = input.nextLine();
//        armstrongNumber(userInput);
//
//        // Question 6 method call
//        arrayReverse();
//
//        // Question 7 method call
//        System.out.println("Enter a string:");
//        String palindromeCheck = input.nextLine();
//        boolean result = isPalindrome(palindromeCheck);
//        System.out.println("Is the entered string palindrome: "+result);

         // Question 8 method call
        diamondPattern();

    }
}