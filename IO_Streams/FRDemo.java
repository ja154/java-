package IO_Streams;

import java.io.FileReader;
import java.io.IOException;

public class FRDemo {
    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("First.txt");
        //reads a char and returns the int equivalent
        // EOF - - 1
        //we loop through the file printing each character by equating it to x thus the loop will print each character until it reads the last character
        int x;
        while((x = fr.read()) != -1){
            System.out.print((char)x);

        }
        fr.close();
    }
}
