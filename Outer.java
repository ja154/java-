public class Outer {
    private String secretMessage = "Hello from the Outer world!";

public void disp(){
    // Local inner class inside a method of the outer class
    class Local{
        void msg(){// method of local inner class acessing the private member of outer class
            System.out.println("Data from outer class: " + secretMessage);    
        }
    }
    Local l = new Local(); // creating an instance of the local inner class
    l.msg();
}
public static void main(String[] args) {
    Outer outer = new Outer();
    outer.disp(); // calling the method that contains the local inner class
}
}
