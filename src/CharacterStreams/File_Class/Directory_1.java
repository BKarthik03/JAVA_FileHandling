package CharacterStreams.File_Class;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;

public class Directory_1 {
    public static void main(String[] args) {
        File file = new File("src/dummy");
        System.out.println("Directory created: "+file.mkdir());

        try {
            Files.copy(Paths.get("src/files/DOS.txt"),Paths.get("src/dummy/DOS.txt"));
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println(file.getName()+" is a Diectory: "+file.isDirectory()+"\n");


        System.out.print("Files Available in the directory are: ");
        for(String f : file.list()){
            System.out.print(f+"\t");
        }
        System.out.println();
        System.out.print("Files Available in the directory are: ");
        for(File f : file.listFiles()){
            System.out.print(f+"\t");
            f.delete();
        }
        System.out.println("\n");

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        System.out.println("Directory last modified on: "+sdf.format(file.lastModified()));


        System.out.println("Parent Directory is: "+file.getParent());

        File newDir = new File("src/Dummy__");
        System.out.println("Directory Renamed: ("+file.renameTo(newDir)+") to "+newDir.getName());

        System.out.println("Directory Deleted "+newDir.delete());
    }
}
