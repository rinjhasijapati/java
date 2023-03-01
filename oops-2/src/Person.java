public class Person {
    String name;
    int Age;
    Person(String a,int b)
    {
        name=a;
        Age=b;
    }

    public void introduce(){
        System.out.println("Hi my name is "+ name +" and age is "+Age+" years old.");
    }
}
