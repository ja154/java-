package IO_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class RWDemo {
    public static void main(String[] args) throws IOException, FileNotFoundException {
        //read and write streams  within the same file

        //first we start with the read steam.

        FileReader fr = new FileReader("RWDemo.java"); //to read RWDemo.java
        FileWriter fw = new FileWriter("abc.txt"); // writing a new file.

        //loop to print each char using variable x

        int x; int count = 0;
        while((x = fr.read()) != -1) {
        fw.write(x); // write stream initialization
       System.out.print((char)x);
       count ++;
        }
        fw.write("\n No of chars in the file :" +count);
        System.out.println("\nfile read successful");

        fr.close();
        fw.close();
    }
}
