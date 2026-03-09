package in.pune;

public class ABC {
    private int a;

    public ABC(int a) {
        this.a = a;

    }

    public void getA(){
        System.out.println("a value from class ABC: "+a);
    }

    public static void main(String[] args ) {
        ABC abc = new ABC(199);
        abc.getA();
    }

}
