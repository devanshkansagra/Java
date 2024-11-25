import java.io.*;

public class FileInputOutputStream {

    public static boolean isPrime(int n) {
        for (int i = 2; i <= n; i++) {
            if (n % i == 0) {
                return true;
            }
        }
        return false;
    }

    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;
        int i;

        try {
            if (args.length == 0) {
                throw new ArrayIndexOutOfBoundsException("Empty Arguments");
            }
            fin = new FileInputStream(args[0]);

        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ArrayIndexOutOfBoundsException ae) {
            System.out.println(ae);
        }
        do {
            i = fin.read();
            if (isPrime(i)) {
                fout.write(i);
            }
        } while (i != -1);
        fin.close();
        fout.close();
        System.out.println();
    }
}
