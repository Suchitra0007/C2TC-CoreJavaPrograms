package fileio;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReadWriteDemo {
    public static void main(String[] args) {
        String filename = "sample.txt";
        String text = "Hello File IO\nThis is Day19 demo";

        // write
        try (FileWriter fw = new FileWriter(filename)) {
            fw.write(text);
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Written to " + filename);

        // read
        try (FileReader fr = new FileReader(filename)) {
            int ch;
            System.out.println("Reading:");
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            System.out.println();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
