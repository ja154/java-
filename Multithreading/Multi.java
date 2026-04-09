package Multithreading;

public class Multi extends Thread {

    public void run(){ //must be here but has no implementation child thread instance
        for(int i=1; i<=10;i++) {
            System.out.println("I am User thread");
        }
    }

    public static void main(String[]args) { //first and main thread

        // let's now create the first thread

        Multi thread1 = new Multi();
        // once a thread is created we have to start it as it has the run method in  it
        thread1.start(); // - runnable - thread scheduler

        Multi thread2 = new Multi();
        thread2.start();

        // we give the main thread some work  here

        for(int i=1; i<=10;i++) {
            System.out.println("I am main method");
        }

    }
}
