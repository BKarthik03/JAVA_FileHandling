package ByteStreams.InputStreams;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class ByteArrayIS {
    public static void main(String[] args) {
        //creating an array of type int which is the parameter needed to pass to ByteArrayInputStream
        byte arr[] = {1,2,3,4,5,6,7,8,9,10};
        byte arr1[] = new byte[10];
        //creating an object of ByteArrayInputStream class and passing 'arr' as argument
        ByteArrayInputStream bais = new ByteArrayInputStream(arr);

        //checking whether the bytes are remaining to read
        //available()->Returns the number of remaining bytes that can be read (or skipped over) from this input stream.
        while(bais.available()>4) {
            System.out.println(bais.read());
        }
        //Resets the mark to the beginning
        bais.reset();
        System.out.println("\nThis line Divides two read OP's!!\n");

        //printing the values into another byte array, which is passed as a argument
        //It starts storing from index '0' and total length of '7'
        bais.read(arr1,0,7);

        for(int i=0;i<arr1.length;i++) {
            System.out.println(arr1[i]);
        }

        System.out.println("Using Skip to skip first 5 bytes");
        bais.reset();
        bais.skip(5);
        while(bais.available()>0) {
            System.out.println(bais.read());
        }

        try {
            bais.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
