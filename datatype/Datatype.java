import java.util.Scanner;

public class Datatype {
    public static void main(String[] abc){
    System.out.println("Enter first number:");
    Scanner obj1 = new Scanner(System.in);


        int number1 = obj1.nextInt();    //dynamic value

        System.out.println("Enter second number:");
        int number2 = obj1.nextInt();  //dynamic value
    
        System.out.println(number1*number2);

    }
}