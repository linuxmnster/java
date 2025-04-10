import java.io.File;

public class ListFilesOnly {
    public static void main(String[] args) {
        File folder = new File("C:\\My Web Sites");

        File[] files = folder.listFiles();

        System.out.println("Files in the current directory:");

        if (files != null) {
            for (int i = 0; i < files.length; i++) {
                if (files[i].isFile()) {
                    System.out.println(files[i].getName());
                }
            }
        } else {
            System.out.println("Folder not found or invalid.");
        }
    }
}
