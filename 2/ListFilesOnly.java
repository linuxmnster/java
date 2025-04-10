import java.io.File;

public class FilePropertiesExample {
    public static void main(String[] args) {
        // Create a File object
        File file = new File("HTDemo.java");

        // Check if the file exists
        if (file.exists()) {
            System.out.println("File Name: " + file.getName());
            System.out.println("Absolute Path: " + file.getAbsolutePath());
            System.out.println("Writable: " + file.canWrite());
            System.out.println("Readable: " + file.canRead());
            System.out.println("File Size (bytes): " + file.length());
            System.out.println("Is it a directory? " + file.isDirectory());
        } else {
            System.out.println("The file does not exist.");
        }
    }
}
