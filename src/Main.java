import java.io.*;
import java.util.*;


public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Person[] persons = {new Person(1, "bob"), new Person(2, "lex")};


        File file = new File("person.bin");
        try {
            FileOutputStream fos = new FileOutputStream(file);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(persons);
            oos.close();
            FileInputStream fis = new FileInputStream(file);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Person[] p = (Person[]) ois.readObject();

            System.out.println(Arrays.toString(p));

        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }

    }
}




