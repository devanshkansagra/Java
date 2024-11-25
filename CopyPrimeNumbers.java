import java.io.*;

public class CopyPrimeNumbers {

    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i = 2; i <= num; i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]) throws IOException {
        FileInputStream fin = null;
        FileOutputStream fout = null;

        int i;

            try {
                fin = new FileInputStream("input.txt");
                fout = new FileOutputStream("output.txt");
            } catch (FileNotFoundException e) {
                System.out.println(e);
            }
            catch (ArrayIndexOutOfBoundsException ae) {
                System.out.println(ae);
            }
    

        

        try {
            do {
                i = fin.read();
                System.out.println(i);
                if(i % 2 == 0) {
                    fout.write(i);
                }
            } while (i != -1);
        } catch (IOException e) {
            System.out.println(e);
        } 
        fin.close();
        fout.close();
    }
}
