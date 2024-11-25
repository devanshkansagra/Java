import java.io.*;

public class CopyByteStream {
    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        int i;
        try {
            try {
                fin = new FileInputStream(args[0]);
            } catch (FileNotFoundException e) {
                System.out.println(e);
                return;
            }
            try {
                fout = new FileOutputStream(args[1]);
            } catch (Exception e) {
                System.out.println(e);
                return;
            }

            try {
                do {
                    i = fin.read();
                    if (i != -1) {
                        fout.write((char) i);
                    }
                } while (i != -1);
            } catch (IOException e) {
                System.out.println(e);
            }

            fin.close();
            fout.close();

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

    }
}
