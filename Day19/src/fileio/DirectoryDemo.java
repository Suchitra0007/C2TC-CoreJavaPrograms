package fileio;

import java.io.File;

public class DirectoryDemo {
    public static void main(String[] args) {
        File dir = new File("demoDir");
        if (!dir.exists()) {
            boolean created = dir.mkdir();
            System.out.println("Created directory: " + created + " -> " + dir.getAbsolutePath());
        }

        File[] files = dir.listFiles();
        if (files == null || files.length == 0) {
            System.out.println("Directory is empty");
        } else {
            System.out.println("Files in " + dir.getName() + ":");
            for (File f : files) System.out.println("  " + f.getName());
        }
    }
}
