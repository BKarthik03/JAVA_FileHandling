package ByteStreams.OutputStreams;

import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ByteArrayOS {
    public static void main(String[] args) {
        try{
            FileInputStream fis = new FileInputStream("src/files/BufferedIS.txt");
            byte[] input = fis.readAllBytes();
            byte[] output = new byte[50];
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            baos.write(input,0,input.length);
            output = baos.toByteArray();
            String outputInString = baos.toString();

            System.out.print("Data from byte Array->");
            for(byte b : output){
                System.out.print((char)b);
            }

            System.out.println("\nData from String output -> "+outputInString);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }

    }
}