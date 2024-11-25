import java.util.Scanner;
class matMul {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the rows and columns of the matrix:  ");
		int row1 = sc.nextInt();
		int col1 = sc.nextInt();

		int mat1[][] = new int[row1][col1];
		System.out.print("Enter the elements of the matrix 1: ");
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col1; j++) {
				mat1[i][j] = sc.nextInt();
			}
		}

		System.out.print("Enter the rows and columns of the matrix 2:  ");
		int row2 = sc.nextInt();
		int col2 = sc.nextInt();

		int mat2[][] = new int[row2][col2];
		System.out.print("Enter the elements of the matrix 2: ");
		for(int i = 0; i < row2; i++) {
			for(int j = 0; j < col2; j++) {
				mat2[i][j] = sc.nextInt();
			}
		}

		int ans[][] = new int[row1][col2];
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col2; j++) {
				for(int k = 0; k < row2; k++) {
					ans[i][k] += mat1[i][k] * mat2[k][j];
				}
			}
		}

		System.out.println("Multiplication of matrix 1 and matrix 2 is: ");
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < col2; j++) {
				System.out.print(ans[i][j] + " ");
			}
			System.out.println();
		}
	}
}