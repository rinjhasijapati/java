public class Main {
    public static void main(String[] args) {

        Shape object = new Shape(100,200); //creation of object
        Shape object2 = new Shape();
        System.out.println("Width: " +object.width);
        System.out.println("Height: " +object.height);
        object.area();
        object2.area();

    }
}