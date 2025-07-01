package ByteStreams.OutputStreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog implements Serializable {
    String name;
    String breed;
    transient String color;

    Dog(){
        name = "Jimmi";
        breed = "Indian";
        color = "wheat";
    }
}
public class ObjectOS {
    public static void main(String[] args) {
        try{
            Dog dog = new Dog();
            FileOutputStream fos = new FileOutputStream("src/files/serializtion1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dog);
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
