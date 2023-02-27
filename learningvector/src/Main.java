import java.util.Vector;
//
//import static java.lang.System.*;

public class   Main {
    public static void main(String[] args) {
        //this is a fixed array.
        int[] age = {20,30,40}; //length = 3;
        Vector age2 = new Vector(3, 10);
        System.out.println(age.length);
        age2.add(50);
        age2.add(60);
        age2.add(70);
        System.out.println(age2);
        System.out.println("Vector age capacity>> " +age2.capacity());


    }

    //Arrays are like boxes of a fixed size, while vectors are like expandable boxex that can grow or shrink as needed.
}