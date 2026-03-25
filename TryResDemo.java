import java.io.*;

public class TryResDemo {
    public static void main(String[] args) throws IOException {

        // 1. Removed the old 'BufferedReader br = null;' line

        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.println("Enter name:");
            String name = br.readLine();
            System.out.println("Hi " + name);
        } catch (IOException e) {
            System.out.println(e);
        } 
        
        // 2. Removed the finally block; 'br' is closed automatically here.

        System.out.println("rest o the code follows........!");
    }
}
