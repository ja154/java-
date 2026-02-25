public class A implements  Printable {

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
