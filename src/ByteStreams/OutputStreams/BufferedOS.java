package ByteStreams.OutputStreams;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedOS {
    public static void main(String[] args){
        try {
            FileInputStream fis = new FileInputStream("src/files/FileOS.txt");
            BufferedOutputStream bos = new BufferedOutputStream(System.out);
            int data;
            while((data = fis.read())!=-1){
                bos.write(data);
            }
            bos.flush();
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
