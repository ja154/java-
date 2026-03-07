//print today's date

import java.util.Scanner; // importing the package util which contains the class predefined  Scanner  class.

//fqn: java.util.Date
public class Test{  // main class // driver class
public static void main(String[] args) {

	java.util.Date d = new java.util.Date();//creating an object of Date class
	System.out.println("Today's date is: "+ d);// printing the date using the tostring display for the date.

	Scanner in = new Scanner(System.in) ;
	System.out.println("Enter your name: ");
	String name = in.nextLine(); // taking input from the user using the nextLine() method
	System.out.println("Hello top shotta ya orezo , " + name + "!"); // greeting the user with their name

	
}
}