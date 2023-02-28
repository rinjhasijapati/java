public class Shape {
    public int width;
    public int height;

    //Default Constructor
    Shape(){
        width = 10;
        height = 20;
    }

    // Parameter Constructor
    Shape(int w, int h){
       width = w;
       height = h;
    }
    public void area(){
        System.out.println("Area = " + width*height);
    }
}
