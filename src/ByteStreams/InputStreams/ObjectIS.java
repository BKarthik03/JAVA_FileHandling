package ByteStreams.InputStreams;

import java.io.*;

class Dog implements Serializable{
    String name;
    String breed;
    transient String color;

    Dog(){
        name = "Jimmi";
        breed = "Indian";
        color = "wheat";
    }
}
public class ObjectIS {
    public static void main(String[] args) {
        Dog dog = new Dog();
        try {

            dog.name = "Tiger";
            //below code stores the current state of the passed object in sequence of bytes
            //this process is called serialization
            FileOutputStream fis = new FileOutputStream("src/files/serialization.txt");
            ObjectOutputStream os = new ObjectOutputStream(fis);
            os.writeObject(dog);
            os.close();
            fis.close();

            //we are deserializing the object and reading from it.
            FileInputStream fis2 = new FileInputStream("src/files/serialization.txt");
            ObjectInputStream os2 = new ObjectInputStream(fis2);
            Dog deserializedDog = (Dog) os2.readObject();
            System.out.println(deserializedDog.name);
            System.out.println(deserializedDog.breed);
            System.out.println(deserializedDog.color);

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
