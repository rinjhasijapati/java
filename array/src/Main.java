public class Main {
    public static void main(String[] args) {
//        int[] z = new int[5];
//        int y[] = {10, 20, 30};
//        int[] x = {1,2, 3, 4, 5, 6, 7, 8, 9, 10};
//
//        for (int i = 0; i <= 2; i++) {
//            System.out.println("Y>> " + y[i]);
//        }
//        System.out.println("");
//        //for each
//        //for(datatype variableName : arrayName){
//        //code
//        //}
//        for(int element : y){
//            System.out.println(element);
//        }
//        System.out.println("");
//
//        for (int i = 0; i <= 9; i++) {
//            System.out.println("X>> " + x[i]);
//        }

        int[][] a = {{10,20,30},
                     {20,90,100}};
        System.out.println(a[0][1]);
        System.out.println("");

        int[] x ={10,20,30};
        for(int i=0; i<=2; i++){
            System.out.println(x[i]);
        }
        System.out.println("");

        for(int i=0; i< a.length; i++){
            for(int j=0; j< a[i].length; j++){
                System.out.print(a[i][j] +" ");
            }
            System.out.println("");
        }

        //.length counts rows
    }
}