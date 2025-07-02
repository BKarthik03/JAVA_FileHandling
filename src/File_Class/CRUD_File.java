package File_Class;

import java.io.File;
import java.io.IOException;

public class CRUD_File {
    public static void main(String[] args) {
        try{
            File file = new File("src/files/CRUD.txt");
            file.getAbsoluteFile();
            file.createNewFile();
        }catch(IOException e){
            e.printStackTrace(System.err);
        }
    }
}
