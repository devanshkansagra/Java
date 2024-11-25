import java.io.*;
import java.util.Scanner;

public class FileReaderDemo {


    public static boolean isPrime(int num) {
        if(num <= 1) {
            return false;
        }
        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        // try {
        //     FileReader fr = new FileReader(args[0]);
        //     FileWriter fw = new FileWriter(args[1]);
        //     Scanner sc = new Scanner(fr);

        //     while(sc.hasNextInt()) {
        //         int num = sc.nextInt();
        //         if(num % 2 == 0) {
        //             fw.write(num + " ");
        //         }
        //     }
            
        //     sc.close();
        //     fr.close();
        //     fw.close();
        // }
        // catch(FileNotFoundException fe) {
        //     System.out.println(fe);
        // }
        try {
            FileReader fr = new FileReader(args[0]);
            FileWriter fwOdd = new FileWriter("odd.txt");
            FileWriter fwEven = new FileWriter("even.txt");

            BufferedReader br = new BufferedReader(fr);
            String s;

            while ((s = br.readLine()) != null) {
                int num = Integer.parseInt(s);
                if(num % 2 == 0) {
                    fwEven.write(num + " ");
                }
                else {
                    fwOdd.write(num+" ");
                }
            }

            fr.close();
            fwOdd.close();
            fwEven.close();
            br.close();
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        
    }

}
