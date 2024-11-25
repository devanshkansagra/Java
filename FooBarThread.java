import java.util.Scanner;
class NewThread implements Runnable {

    String name;
    Thread t;
    int lower, upper;
    NewThread(String name, int lower, int upper) {
        this.upper = upper;
        this.lower = lower;
        this.name = name;
        t = new Thread(this, name);
        t.start();
    }
    public void run() {
        if(name == "Foo") {
            for(int i = lower; i <= upper; i++) {
                int num = i;
                int originalNum = num;
                int rev = 0;

                while(num > 0) {
                    int lastDigit = num % 10;
                    rev = (rev * 10) + lastDigit;
                    num = num / 10;
                }

                if(rev == originalNum) {
                    System.out.println(i + " is a palindrome number\n");
                }
            }
        }
        if(name == "Bar") {
            for(int i = lower; i <= upper; i++) {
                if((i % 5 == 0) && (i % 3 == 0)) {
                    System.out.println(i + " is divisible by 5 and 3 both\n");
                }
            }
            System.out.println();
        }

        System.out.println(name + " completed \n");
    }
}
public class FooBarThread {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ther lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();
        NewThread n1 = new NewThread("Foo", lower, upper);
        NewThread n2 = new NewThread("Bar", lower, upper);
        try {
            n1.t.join();
            n2.t.join();
        } catch (InterruptedException e) {
           System.out.println(e);
        }
        System.out.println("Exiting main thread");
    }
}
