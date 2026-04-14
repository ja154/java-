package Multithreading;

public class SyncDemo {
    public static void main(String[] args){

        Display d = new Display();

        // anonymous inner classes to create thread objects from extending the Threads class

        Thread t1 = new Thread(){
            public void run(){
                d.printCapitals();
            }
        };
        t1.start();

        Thread t2 = new Thread(){
            public void run(){
                d.printSmaller();
            }
        };
        t2.start();



    }
}
