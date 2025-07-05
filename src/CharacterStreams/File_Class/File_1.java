package CharacterStreams.File_Class;

import java.io.File;
import java.io.IOException;

public class File_1 {
    public static void main(String[] args) {
        try{
            File file = new File("src/files/Simple.txt");
            System.out.println("File Created Successfully!! "+file.createNewFile());
            System.out.println("Name of the file is: "+file.getName());
            System.out.println("File Exists: "+file.exists());
            System.out.println("File is Readable: "+file.canRead());
            System.out.println("File is Writable: "+file.canWrite());
            System.out.println("Length of the file is: "+file.length());
            System.out.println("Absolute Path of the file is: "+file.getPath());
            System.out.println("File is Deleted!! "+file.delete());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }

    }
}
