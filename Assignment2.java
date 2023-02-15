import java.util.Scanner;

public class Assignment2 {
    public static void main (String[] abc){

        Scanner obj1 = new Scanner(System.in);
        System.out.println("a) What is the total number of employees?");
        int employees = obj1.nextInt();
        System.out.println("");

        System.out.println("b) What is the name of supervisor?");
        obj1.nextLine();
        String name = obj1.nextLine();
        System.out.println("");

        System.out.println("c) How many times the Nuclear waste is removed from the core?");
        int waste = obj1.nextInt();
        System.out.println("");

        System.out.println("d) What is the total weight of the waste produced every 1 week?");
        float weight = obj1.nextFloat();
        System.out.println("");

        System.out.println("e) Is Electric Motor being replaced every 18 days? Press “y” for yes and “n” for no.");
        char electric = obj1.next().charAt(0);
        System.out.println("");

        System.out.println("f) What is the core average temperature ( celsius ) of the Nuclear Reactor? ");
        float temp = obj1.nextFloat();
        System.out.println("");
        System.out.println("");

        System.out.println("Status Update on Nuclear Reactor JX00-XC-HB1");
        System.out.println("--------------------------------------------");
        System.out.println("Total Number of Employees: " + employees);
        System.out.println("Name of Supervisor: " + name);
        System.out.println("Number of times Nuclear Waste is removed form core: " + waste);
        System.out.println("Total weight of waste in 1 week: " + weight);
        System.out.println("Is Electric Motor being replaced every 18 days?: " + electric);
        System.out.println("Core Temperature: " + temp + "Celsius (" + (temp + 273.15) + "Kelvin)");
        System.out.println("");
    }
}