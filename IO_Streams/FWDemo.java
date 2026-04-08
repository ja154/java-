
package IO_Streams;
import java.io.*;

public class FWDemo {
    public static void main(String[] args) throws IOException {// we have to declare the IO Exception as we are using classes within java IO package

       //  File f = new File("First.txt");// created if exists it is replaced
        FileWriter fw = new FileWriter("First.txt", true); //appending - true we are appending to an existing file
        BufferedWriter bw = new BufferedWriter(fw);

        //Anonymus objects
        bw = new BufferedWriter(new FileWriter("First.txt"));
            fw.write("java is some jaba and jaba is java\n");
            fw.write("jaba is fresh and unpropergated\n");
            fw.write ("Nimeja ngori na nakuambia ni mbaya\n");
            fw.write("Huskii jaba ni java gathee\n");
            fw.write("Nakuambia ni mbaya\n");
            fw.write("Nyonga hio tenje\n");

            System.out.println("file printed nyonga hio tenje......");

            fw.close();
    }
}