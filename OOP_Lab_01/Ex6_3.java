package OOP_Lab_01;

import java.util.Scanner;

public class Ex6_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0 ; i< n;i++){
            for (int j = 0 ; j< 2*n ;j++){
                if(j<=n+i && j >= n-i){
                    System.out.print("*");
                }
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
