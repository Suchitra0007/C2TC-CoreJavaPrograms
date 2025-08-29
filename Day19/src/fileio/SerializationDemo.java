package fileio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.IOException;

public class SerializationDemo {
    public static void main(String[] args) {
        SerializablePerson p = new SerializablePerson(1, "Suchitra");
        String filename = "person.ser";

        // serialize
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(p);
            System.out.println("Serialized: " + p);
        } catch (IOException e) {
            e.printStackTrace();
        }

        // deserialize
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            SerializablePerson p2 = (SerializablePerson) ois.readObject();
            System.out.println("Deserialized: " + p2);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
