import java.util.Scanner;

 class shape{
    shape(){
        System.out.println("The parent class is shape");
    }
    public void showArea(){
        System.out.println("The area of ");
    }
    public void showPerimeter(){
        System.out.println("The perimeter of ");
    }
}

class shapeRectangle extends shape{

    public void showArea(int length, int width){
        System.out.println("The area of Rectangle is : "+ length*width);
    }

    public void showPerimeter(int length, int width){
        System.out.println("The perimeter of Rectangle is : "+ (length+width)*2);
    }
}

public class SingleInheritance {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter the length");
       int length = input.nextInt();
       System.out.println("Enter the width");
       int width = input.nextInt();

       shapeRectangle objSingleInheritance = new shapeRectangle();

       objSingleInheritance.showArea(length,width);
       objSingleInheritance.showPerimeter(length,width);


    }
}
