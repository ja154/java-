package Multithreading;

public class Multi extends Thread {

    public void run(){ //must be here but has no implementation child thread instance
        for(int i=1; i<=10;i++) {
            System.out.println(Thread.currentThread().getName());
            System.out.println(Thread.currentThread().getPriority());
            System.out.println(i);
            try {
                Thread.sleep(700,500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public static void main(String[]args) throws Exception { //first and main thread

        // let's now create the first thread

        Multi thread1 = new Multi(); // default name assigned if i set none
        // once a thread is created we have to start it as it has the run method in  it
        thread1.start(); // - runnable - thread scheduler
        thread1.join(500);// throws interruptedException  thus aftr thread1 is done printing 1-10 the thread2 and thread3 the start due to this join()method used on thread1

        Multi thread2 = new Multi();
        thread2.setPriority(5);
        thread2.setName("Second");
        thread2.start();

        Multi thread3 = new Multi();
        thread3.setPriority(10);
        thread3.setName("Third");
        thread3.start();
        }

    }
