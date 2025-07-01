package ByteStreams.OutputStreams;

import java.io.*;

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
            FileOutputStream fos = new FileOutputStream("src/files/serialization1.txt");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(dog);

            FileInputStream fis = new FileInputStream("src/files/serialization1.txt");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Dog dog1 = (Dog)ois.readObject();
            System.out.println(dog1.name + " " + dog1.breed + " " + dog1.color);

        }catch(IOException e){
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
