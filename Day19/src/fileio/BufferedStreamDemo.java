package fileio;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedStreamDemo {
    public static void main(String[] args) {
        String filename = "buffered.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            bw.write("Line1");
            bw.newLine();
            bw.write("Line2");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Buffered write complete");

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            System.out.println("Buffered read:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
