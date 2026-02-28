public class Test{  // main class // driver class
public static void main(String[] args) {

	Person p = new Person(){ //process instantiation + class definatoion anonymous class.

		void eat(){
			System.out.println("Eating Jaba");
		} 
	};
	p.eat();
	p.speak();
}
} 