import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        File file = new File("Rinjha.txt");
        file.createNewFile();
        FileWriter fileWrite = new FileWriter(file );
        fileWrite.write("Hello it's me !!\n");
        fileWrite.write("Hello it's me !!\n");
        fileWrite.write("Hello it's me !!\n");
        fileWrite.close();

        //read
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferReader = new BufferedReader(fileReader);
        String line = bufferReader.readLine();
        while(line != null){
            System.out.println(line);
            line = bufferReader.readLine();
        }
    }
}