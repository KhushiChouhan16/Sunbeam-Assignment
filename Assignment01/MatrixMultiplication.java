import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter rows of first matrix: ");
        int rows1 = sc.nextInt();

        System.out.print("Enter columns of first matrix: ");
        int cols1 = sc.nextInt();

        System.out.print("Enter rows of second matrix: ");
        int rows2 = sc.nextInt();

        System.out.print("Enter columns of second matrix: ");
        int cols2 = sc.nextInt();

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
            System.out.println("Columns of first matrix must equal rows of second matrix.");
            return;
        }

        // Create matrices
        int[][] matrix1 = new int[rows1][cols1];
        int[][] matrix2 = new int[rows2][cols2];
        int[][] result = new int[rows1][cols2];

        System.out.println("Enter elements of first matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second matrix:");

        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < rows1; i++) {

            for (int j = 0; j < cols2; j++) {

                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        System.out.println("Resultant matrix:");

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}
