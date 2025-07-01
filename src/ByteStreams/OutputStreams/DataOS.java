package ByteStreams.OutputStreams;

import java.io.*;

public class DataOS {
    public static void main(String[] args) {
        int i = 10;
        int j = 15;
        float f = 3.14f;
        String str = "Hello";
        try {
            DataOutputStream dos = new DataOutputStream(new FileOutputStream("src/files/DOS.txt"));
            dos.writeInt(j);
            dos.writeInt(i);
            dos.writeFloat(f);
            dos.writeUTF(str);

            DataInputStream dis = new DataInputStream(new FileInputStream("src/files/DOS.txt"));
            System.out.println("int value read is: "+dis.readInt());
            System.out.println("int value read is: "+dis.readInt());
            System.out.println("float value read is: "+dis.readFloat());
            System.out.println("String value read is: "+dis.readUTF());
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}
