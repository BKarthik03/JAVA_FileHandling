package ByteStreams.InputStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileIS {
    public static void main(String[] args) {
        try {
            File file = new File("src/files/FileIS.txt");
            //file.createNewFile();//only one time execution-> creates file

            FileInputStream fis = new FileInputStream("src/files/FileIS.txt");

            //skips first 6 bytes
            fis.skip(6);
            while(fis.available()>0){
                System.out.print((char)fis.read());
            }

            //Below method can also be used
//            int i = fis.read();
//
//            while(i != -1) {
//                System.out.print((char)i);
//
//                // Reads next byte from the file
//                i = fis.read();
//            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
