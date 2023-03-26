public class Main {
    public static void main(String[] args) {
        try{
            int divider =0;
            int value =100;
            int result = value/divider;
            System.out.println("Result is :"+result);
            //when you already know that some error might occur you can use 'throw'
//            if(divider==0)
//            {
//                throw new Exception("error ");
//
//            }

        }catch (Exception e){
            System.out.println("Error");
        }finally { //whether any error occurs or not this block of code will execute
            System.out.println("this is finally block");
        }

        anotherWork();

    }

    static void anotherWork(){
        System.out.println("another value");
    }
}