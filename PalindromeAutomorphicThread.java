import java.util.Scanner;
class DemoThread implements Runnable {
    Thread t;
    int lower, upper;

    DemoThread(String name, int lower, int upper) {
        this.lower = lower;
        this.upper = upper;
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        String name = t.getName();
        if(name == "Thread1") {
            for(int i = lower; i <= upper; i++) {
                int num = i;
                int originalNum = num;
                int rev = 0;
                while(num > 0) {
                    int lastDigit = num % 10;
                    rev = (rev * 10) + lastDigit;
                    num /= 10;
                }
                if(rev == originalNum) {
                    System.out.println("Predecessor of " + originalNum + " is " + (originalNum-1) + "\n");
                }
            }
        }
        if(name == "Thread2") {
            for(int i = lower; i <= upper; i++) {
                int sq = i * i;
                if(String.valueOf(sq).endsWith(String.valueOf(i))) {
                    System.out.println("Successor of " + i + " is " + (i + 1) + "\n");
                }
            } 
        }

        System.out.println(name + " completed\n");
    }
}
public class PalindromeAutomorphicThread {
    public static void main(String[] args) {
        int lower, upper;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        lower = sc.nextInt();

        System.out.print("Enter the upper range: ");
        upper = sc.nextInt();

        DemoThread d1 = new DemoThread("Thread1", lower, upper);
        DemoThread d2 = new DemoThread("Thread2", lower, upper);

        try {
            d1.t.join();
            d2.t.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

        System.out.println("Exiting the main thread");
    }
}
