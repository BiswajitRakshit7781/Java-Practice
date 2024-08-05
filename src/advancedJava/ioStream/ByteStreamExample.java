package advancedJava.ioStream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {

    public static void main(String[] args) throws IOException {

        FileInputStream inStream = null;
        FileOutputStream outStream = null;

        try{
            inStream = new FileInputStream("C:\\Java\\Practice\\src\\advancedJava\\ioStream\\img.jpg");
            outStream = new FileOutputStream("C:\\Java\\Practice\\src\\advancedJava\\ioStream\\img2.jpg");

            int content;
            while ((content = inStream.read()) != -1) {
                outStream.write((byte) content);
            }

            System.out.println("Read write done successfully");
        } catch (Exception e){
            System.err.println(e);
        } finally {
            if (inStream != null) {
                inStream.close();
            }
            if (outStream != null){
                outStream.close();
            }
        }
    }
}
