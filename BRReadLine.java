import java.io.*;
public class BRReadLine {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter pw = new PrintWriter(System.out, true);

        String c = br.readLine();

        pw.println(c);
    }
}
