import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

            Scanner input = new Scanner(System.in);
            System.out.println("Enter your name:");
            String name=input.nextLine();
            System.out.println("Enter your age:");
            int age=input.nextInt();
            Person object= new Person(name,age);
            //System.out.println("name: "+object.name);
            //System.out.println("Age: "+object.Age);
            object.introduce();
    }
}