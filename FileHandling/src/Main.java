import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args){  //throws I0Exception {   //if 'throws Exception' is used no need for 'try' & 'catch'

        File file = new File("Rinjha.txt");

        try{
            //this will create new file
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace();
            System.out.println("File not created");
        }

        //write something on this file
        try {
            FileWriter fileWriter = new FileWriter("Rinjha.txt"); //this is like a pen
            fileWriter.write("Hello");
            fileWriter.close();
        }catch(Exception e ){
            System.out.println(e);
        }

        try {
            FileReader fileReader = new FileReader("Rinjha.txt");

            int value;
            while((value = fileReader.read()) != -1){
                System.out.print((char)value);
            }
        }catch (Exception e){
            System.out.println(e);
        }

        //deletes the file
        file.delete();
    }
}