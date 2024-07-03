import java.util.Scanner;

public class arr_2d_user {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number of rows and columns:");
        int rows = sc.nextInt();
        int columns = sc.nextInt();

        int[][] num = new int[rows][columns];
        System.out.println("Enter the elements of the array:");

        // Input
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                num[i][j] = sc.nextInt();
            }
        }

        // Output
        System.out.println("The elements of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println(); // New line after each row
        }

        // Close the scanner
        sc.close();
    }
}
