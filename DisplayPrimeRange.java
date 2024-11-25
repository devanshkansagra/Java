import java.util.Scanner;

class DisplayPrimeRange {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower range: ");
        int lower = sc.nextInt();

        System.out.print("Enter the upper range: ");
        int upper = sc.nextInt();

        boolean flag = false;
        for (int num = lower; num <= upper; num++) {
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    flag = true;
                }
            }
            if (flag == false) {
                System.out.print(num + " ");
            }
            flag = false;
        }
        System.out.println();
    }
}