package CharacterStreams.FileRW;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CRUD_File {
    public static void main(String[] args) {
        try{
            File file = new File("src/files/CRUD.txt");
            //file.createNewFile();

            // true - argument is being passed, in order to append the data to the file instead of overwriting
            FileWriter fw = new FileWriter("src/files/CRUD.txt",true);
            fw.write("Hello CRUD!\n");
            fw.close();

            FileReader fr = new FileReader("src/files/CRUD.txt");
            int data;
            while((data = fr.read())!=-1){
                System.out.print((char)data);
            }
            fr.close();

            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            file.delete();
        }catch(IOException e){
            e.printStackTrace();
        }
    }
}
