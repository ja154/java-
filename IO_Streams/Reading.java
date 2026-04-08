package IO_Streams;

import java.io.Console;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Reading {
    public static void main(String[] args) {
        // 1. Get the system console
        Console console = System.console();

        // 2. Fallback check: If console is null (running in IDE), use BufferedReader
        if (console == null) {
            System.out.println("No system console found. Using BufferedReader fallback...");
            handleWithBufferedReader();
        } else {
            // 3. Using the Console Class (The "Senior" way)
            String city = console.readLine("Enter your city: ");

            // readPassword returns a char array for security reasons
            char[] pinChars = console.readPassword("Enter your 4-digit PIN: ");
            String pin = new String(pinChars);

            System.out.println("Location: " + city + " | PIN stored securely.");
        }
    }

    private static void handleWithBufferedReader() {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            System.out.print("Enter City: ");
            String city = reader.readLine();

            System.out.print("Enter PIN: ");
            String pin = reader.readLine();

            System.out.println("City: " + city + "\nPIN: " + pin);
        } catch (IOException e) {
            System.err.println("I/O Error: " + e.getMessage());
        }
    }
}
