package OOP_Lab_01.Ex2_2_6;

import java.util.Scanner;

public class LinearEquation {
    public static void main(String[] args) {
        System.out.println("Linear equation with one variable: ");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.println();

        scanner.close();

        if (a == 0 ) {
            if ( b == 0){
                System.out.println("Infinite solution!");
                return;
            }
            else {
                System.out.println("No Solution!");
                return;
            }
        }

        System.out.println("Soltion is: x = " + (-b/a));
    }
}
