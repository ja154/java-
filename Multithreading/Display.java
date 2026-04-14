package Multithreading;

public class Display {

    // Method to print A-Z (Capitals)
    public synchronized void printCapitals() {
        for (int i = 65; i <= 90; i++) {
            System.out.print((char) i + " ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    // Method to print a-z (Smaller)
    public synchronized void printSmaller() {
        for (int i = 97; i <= 122; i++) {
            System.out.print((char) i + " ");
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
}