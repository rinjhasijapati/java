public class Main {
    public static void main(String[] args) {

        String name = "Rinjha";
        System.out.println(name);
        name = name + " Sijapati";
        System.out.println(name);

        //this will create the new instance of the string
        String name2 = new String ("hello world");

        StringBuffer name3 = new StringBuffer("Rinjha");
        name3.append(" Sijapati");
        System.out.println(name3);

    }
}