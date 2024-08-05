package advancedJava.ioStream;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {

        FileReader reader = null;
        FileWriter writer = null;

        try{
            reader = new FileReader("C:\\Java\\Practice\\src\\advancedJava\\ioStream\\sourceFile2.txt");
            writer = new FileWriter("C:\\Java\\Practice\\src\\advancedJava\\ioStream\\destFile2.txt");

            int content;
            while((content = reader.read()) != -1){
                writer.append((char) content);
            }

            System.out.println("Read write done successfully");
        } catch (Exception e) {
            System.err.println(e);
        } finally {
            if (reader != null){
                reader.close();
            }
            if (writer != null){
                writer.close();
            }
        }
    }
}
