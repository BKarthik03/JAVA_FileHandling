package CharacterStreams.BufferedRW;

import java.io.*;

public class BufferedWriter_Reader {
    public static void main(String[] args) {

        try{
            FileWriter file;
            file = new FileWriter("src/files/PS.txt");
            String data = "BufferedReader and BufferedWriter boost performance by buffering input and output streams. " +
                    "They are useful for managing huge files.";


            BufferedWriter bw = new BufferedWriter(file);
            bw.write(data);
            bw.flush();
            bw.close();
        }catch(IOException e){
            System.out.println(e);
        }

        try{
            FileReader file;
            file = new FileReader("src/files/PS.txt");
            BufferedReader br = new BufferedReader(file);

            int data;
            while((data=br.read())!=-1){
                System.out.print((char)data);
            }
            br.close();
        }catch(IOException e){
            System.out.println(e);
        }
    }



}
