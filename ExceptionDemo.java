import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        int sum = a + b;
        System.out.println("Sum = " + sum);

        int res = a / b;
        System.out.println("Result = " + res);

        int prod = a * b;
        System.out.println("Product = " + prod);

        System.out.println("Rest of the code follows ");

    }

}
