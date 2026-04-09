package Multithreading;

public class RunnableDemo implements Runnable {

        public void run(){ //must be here but has no implementation child thread instance
            for(int i=1; i<=10;i++) {
                System.out.println(i);
            }
        }

        public static void main(String[]args) { //first and main thread

            // because Runnable is the interface and RunnableDemo is the class, so interfaces can refer to their implementation classes in this case the implementation class is RunnableDemo.java
            Runnable r1 = new RunnableDemo();
            Runnable r2 = new RunnableDemo();

            //creating threads by implementing the above runnable objects created above using Thread runnable(r)

            Thread t1 = new Thread(r1);
            Thread t2 = new Thread(r2);

            t1.start();
            t2.start();


        }
    }
