package ByteStreams.OutputStreams;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOS {
    public static void main(String[] args) {
        try {
            String data = "Hello World!";
            File file = new File("src/files/FileOS.txt");
            //file.createNewFile();
            FileOutputStream fos = new FileOutputStream(file, true);
            //public void write(byte[] b)
            fos.write(data.getBytes());
            fos.flush();
            fos.close();
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
