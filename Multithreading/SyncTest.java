package Multithreading;

public class SyncTest {
    public static void main(String[] args){
        Table t = new Table();

        First t1 = new First(t);
        t1.start(); //prints from run method from shared resource table

        Second t2 = new Second(t);
        t2.start();

        Third t3 = new Third(t);
        t3.start();

        Fourth t4 = new Fourth(t);
        t4.start();
    }
}
