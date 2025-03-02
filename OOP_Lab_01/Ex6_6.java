package OOP_Lab_01;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int col = sc.nextInt();
        int row = sc.nextInt();
        int matrix1[][] = new int[row][col];
        int matrix2[][] = new int[row][col];
        int matrix3[][] = new int[row][col];

        for (int i = 0;i<row ; i++){
            for (int j = 0 ;j < col ; j++){
                matrix1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<row ; i++){
            for (int j = 0 ;j < col ; j++){
                matrix2[i][j] = sc.nextInt();
            }
        }
        for (int i = 0;i<row ; i++){
            for (int j = 0 ;j < col ; j++){
                matrix3[i][j] = matrix2[i][j] + matrix1[i][j];
            }
        }
        for (int i = 0;i<row ; i++){
            for (int j = 0 ;j < col ; j++){
                System.out.print(matrix3[i][j] +" ");
            }
            System.out.println();
        }
    }
}
