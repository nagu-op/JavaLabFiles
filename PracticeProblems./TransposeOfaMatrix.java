package Matrix;

import java.util.Scanner;

public class TransposeOfaMatrix {
	public static void main(String [] args) {
		int row1,col1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for first matrix: ");
		row1 = sc.nextInt();
		System.out.println("Enter the number of column for first matrix: ");
		col1 = sc.nextInt();
		int [][] matrixA = new int[row1][col1];
		int [][] matrixB = new int[row1][col1];

		System.out.println("Enter the elemts of the first matrix: ");
		for (int i=0; i<row1;i++) {
			for (int j=0; j<col1; j++) {
				matrixA[i][j] = sc.nextInt();
				}
			}
		System.out.println("The Inputed matrix is: ");
		for (int i = 0;i <row1; i++) {
			for (int j = 0; j<col1; j++) {
				System.out.print(matrixA[i][j]+" ");
			}
			System.out.println("\n");
		}
		int temp;
		for (int i = 0; i<row1;i++) {
			for (int j = 0; j<col1; j++) {
				temp = matrixA[i][j];
				matrixB[i][j] = matrixA[j][i];

			}
		}
		System.out.println("The Transepose of the matrix is : ");
		for (int i = 0;i <row1; i++) {
			for (int j = 0; j<col1; j++) {
				System.out.print(matrixB[i][j]+" ");
			}
			System.out.println("\n");
		}
	}
	
}
