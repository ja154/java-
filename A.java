public class A implements  Printable {// class A implements Printable interface

    public void print(){
        System.out.println("Print method");

    } 
    
    public void show(){
        System.out.println("Show method");
    }

    public static void main(String[] args) {

            Printable p = new A();

            p.print();
            p.show();
    

    }
}
