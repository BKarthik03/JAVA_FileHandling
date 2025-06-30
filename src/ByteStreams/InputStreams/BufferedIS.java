package ByteStreams.InputStreams;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedIS {
    public static void main(String[] args) throws IOException {
        FileInputStream file = new FileInputStream("src/files/BufferedIS.txt");
//        try {
//            file.createNewFile();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        BufferedInputStream bis = new BufferedInputStream(file);
        while(bis.available()>0){
            System.out.print((char)bis.read());
        }

        System.out.println("Hello");
    }
}
