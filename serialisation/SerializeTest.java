package serialisation;

import java.io.*;

public class SerializeTest {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Person p1 = new Person("ASDF", 21, 123456789876L);
        System.out.println("Original: " + p1);

        // Serialization
        FileOutputStream fos = new FileOutputStream("person.dat");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(p1);
        oos.close();

        // Deserialization
        FileInputStream fis = new FileInputStream("person.dat");
        ObjectInputStream ois = new ObjectInputStream(fis);

        // Reading the object back and casting it to Person
        Person p2 = (Person) ois.readObject();
        System.out.println("Deserialized: " + p2);

        ois.close();
    }
}