package OOP_Lab_01.Ex2_2_6;

import java.util.Scanner;

public class LinearSystem {

    public static void main(String[] args) {

        Scanner scanner = getScanner();

        System.out.println("Enter linear system with two variables");
        System.out.println("a * x1 + b * x2 = b1");
        System.out.println("c * x1 + d * x2 = b2");

        System.out.print("Enter a, b, b1: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double b1 = scanner.nextDouble();

        System.out.print("Enter c, d, b2: ");
        double c = scanner.nextDouble();
        double d = scanner.nextDouble();
        double b2 = scanner.nextDouble();

        scanner.close();

        double determinant = a * d - c * b; // calculate the determinant
        if (determinant == 0) {
            System.out.println("The system of equations has no unique solution.");
            return;
        }

        double x1 = (d * b1 - b * b2) / determinant;
        double x2 = (a * b2 - c * b1) / determinant;

        System.out.println("Solution found: x1 = " + x1 + ", x2 = " + x2);


    }

    private static Scanner getScanner() {
        return new Scanner(System.in);
    }

}
