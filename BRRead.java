import java.io.*;
public class BRRead {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the characters to input...Press 'q' to quit");
        char c;
        do {
            c = (char) br.read();
            System.out.print(c);
        }while(c != 'q');
    }
}
