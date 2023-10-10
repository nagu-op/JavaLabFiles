package firstJavaLab;
import java.util.Scanner;
public class MatrixMultipilcation {
	public static void main(String []args) {
		int row1,col1,row2,col2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of rows for first matrix: ");
		row1 = sc.nextInt();
		System.out.println("Enter the number of column for first matrix: ");
		col1 = sc.nextInt();
		System.out.println("Enter the number of rows for second matrix: ");
		row2 = sc.nextInt();
		System.out.println("Enter the number of column for second matrix: ");
		col2 = sc.nextInt();
		if (col1 == row2) {
			int [][] matrixA = new int[row1][col1];
			int [][] matrixB = new int[row2][col2];
			int [][] matrixC = new int[row1][col2];
			System.out.println("Enter the elemts of the first matrix: ");
			for (int i=0; i<row1;i++) {
				for (int j=0; j<col1; j++) {
					matrixA[i][j] = sc.nextInt();
				}
			}
			System.out.println("Enter the elemnts of teh second matrix: ");
			for (int i=0; i<row1;i++) {
				for (int j=0; j<col1; j++) {
					matrixB[i][j] = sc.nextInt();
				}
			}
			System.out.println("The first matrix is");
			matrixDisplay(matrixA,row1,col1);
			System.out.println("The second matrix is");
			matrixDisplay(matrixB,row2,col2);
			for(int i = 0; i< row1; i++) {
				for (int j = 0;j<col2; j++) {
					matrixC[i][j] = 0;
					for (int x = 0; x<col1;x++) {
						matrixC[i][j] = matrixC[i][j] +(matrixA[i][x]*matrixB[x][j]);
					}
				}
			}
			System.out.println("The product of the two matrtix is: ");
			matrixDisplay(matrixC, row1, col2);
	
		}
		else {
			System.out.println("The number of column of first and number of rows of second should be equal..");
		}
			
	}
	static void matrixDisplay(int [][]matrix,int row, int col) {
		Scanner sc = new Scanner(System.in);
		for (int i=0; i<row;i++) {
			for (int j=0; j<col; j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println("\n");
		}
	}
//	static int matrixCreating(int [][]matrix,int row, int col) {
//		Scanner sc = new Scanner(System.in);
//		for (int i=0; i<row;i++) {
//			for (int j=0; j<col; j++) {
//				matrix[i][j] = sc.nextInt();
//			}
//		}
//		return matrix[row][col];
//	}
	
}
