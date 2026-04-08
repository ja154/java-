package strings;

public class SrtCmp {

    public static void main(String[] args){
        java.util.Scanner in = new java.util.Scanner(System.in);

        String s1 = "Sachin";
        String s2 = "Virat";
        String s3 = new String("Sachin");
        String s4 = new String("Virat");
        String s5 = "sachin";
        String s6 = new String("Rohit");

        System.out.println(s4.length());


        System.out.println(s6.charAt(3));

        System.out.println(s1.substring(0,3));

        System.out.println(s1.equals(s3));
        System.out.println(s1.equalsIgnoreCase(s5));
        System.out.println(s1.equals(s5));

        System.out.println(s1.compareTo(s5));
        System.out.println(s2.compareTo(s5));
        System.out.println(s2.compareTo(s2));

        System.out.println(s1.compareToIgnoreCase(s5));
        System.out.println(s3.compareTo(s6));

        // reading a char from user

        System.out.println("Enter a character");
        String srt = in.next(); //reading it as a string coz we cant read a single char in java
        char ch = srt.charAt(0); //reading index 0 of the string above.
        System.out.println("character read is: "+ch);


    }
}
