import java.io.*;

public class CharacterStreamDemo {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("example.txt");
        writer.write("This is CharacterStream Demo program");
        writer.close();

        FileReader reader = new FileReader("example.txt");
        int ch;
        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }
        reader.close();
    }
}
