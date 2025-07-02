package ByteStreams.OutputStreams;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;

public class PrintStream_ {
    public static void main(String[] args) {
        String data = "Hello Everyone, It's time for lunch!!";
        int timeHour = 1;
        try {

            PrintStream out = new PrintStream(new FileOutputStream("src/files/PS.txt"));
            out.println(data);
            out.printf("It's %d'o clock already!",timeHour);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}
