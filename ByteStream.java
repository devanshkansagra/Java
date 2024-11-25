import java.io.*;

public class ByteStream {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("sample.txt")) {
            fos.write("Hello, World! I am Devansh".getBytes());
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
