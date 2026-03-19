import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionDemo {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = 0, b = 0;
        try{
        a = in.nextInt();
        b = in.nextInt();
    
        int sum = a + b;
        System.out.println("Sum = " + sum);


        //enforcing a try catch block for arithmetic exceptions eg 10/0 which can throw an exception error

        
        int res = a / b;
        System.out.println("Result = " + res);
        }
        catch(Exception e){
            //e.printStackTrace();
            System.err.println(e);
        }
        int prod = a * b;
        System.out.println("Product = " + prod);

        System.out.println("Rest of the code follows ");

    }

}
