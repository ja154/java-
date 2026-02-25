class Outer {
    private static int outerStaticData = 10;

    static class StaticNested {
        void display() {
            System.out.println("Static data: " + outerStaticData);
        }
    }

    public static void main(String[] args) {
        Outer.StaticNested nestedObject = new Outer.StaticNested();
        nestedObject.display();
    }
}
