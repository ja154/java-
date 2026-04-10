package Multithreading;

public class Table {
    public synchronized void printTable(int n) {// task
        for (int i = 1; i <= 10; i++) { // loop for 10 times
            System.out.println(n+" * "+i+" = "+(n*i));
            try{
                Thread.sleep(500);
            }catch(Exception e){}
        }
    }
}

class First extends Thread{
    Table t;
    public First(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(19);
    }
}

class Second extends Thread{
    Table t;
    public Second(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(10);
    }
}

class Third extends Thread{
    Table t;
    public Third(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(15);
    }
}

class Fourth extends Thread{
    Table t;
    public Fourth(Table t){
        this.t = t;
    }
    public void run(){
        t.printTable(17);
    }
}