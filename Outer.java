public class Outer {
    private String secretMessage = "Hello from the Outer world!";

    // 1. Member Inner Class
    class Inner {
        void display() {
            // Inner class accessing private member of Outer class
            System.out.println("Inner says: " + secretMessage);
        }
    }

    public static void main(String[] args) {
        // STEP 1: Create the Outer class object (The House)
        Outer myOuter = new Outer();

        // STEP 2: Create the Inner class object (The Room)
        // Syntax: OuterClassName.InnerClassName name = outerObject.new InnerClassName();
        Outer.Inner myInner = myOuter.new Inner();

        // Now you can call the inner class method
        myInner.display();
    }
}