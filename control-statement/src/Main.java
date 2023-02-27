public class Main {
    public static void main(String[] args) {
        int age = 40;
//        if(age == 60)
//        {
//            System.out.println("I will retire.");
//        } else if(age == 40) {
//            System.out.println("Buy a new house.");
//        }else{
//            System.out.println("Buy a new car.");
//        }

        switch(age){
            case 40:
                System.out.println("Buy a new house.");
                break;
            case 60:
                System.out.println("I will retire.");
                break;
            default:
                System.out.println("Buy a new car.");
        }
    }
}