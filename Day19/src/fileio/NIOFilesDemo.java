package fileio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.io.IOException;
import java.util.List;

public class NIOFilesDemo {
    public static void main(String[] args) {
        Path src = Path.of("sample.txt");
        Path dest = Path.of("sample_nio_copy.txt");
        try {
            Files.copy(src, dest, StandardCopyOption.REPLACE_EXISTING);
            System.out.println("NIO copied to " + dest);

            List<String> lines = Files.readAllLines(src);
            System.out.println("NIO readAllLines:");
            for (String l : lines) System.out.println(l);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
