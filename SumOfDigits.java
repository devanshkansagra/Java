import java.util.Scanner;

class SumOfDigits {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number: ");
		int num = sc.nextInt();

		int sum = 0;
		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		System.out.println("Sum of digits is: " + sum);
	}
}