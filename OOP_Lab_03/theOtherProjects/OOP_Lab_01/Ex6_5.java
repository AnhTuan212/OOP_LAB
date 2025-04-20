package OOP_Lab_03.theOtherProjects.OOP_Lab_01;


import java.util.Arrays;
import java.util.Scanner;

public class Ex6_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int a[] = new int[size];
        for (int i = 0 ;i< size ; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        for (int i : a){
            System.out.print(i +" ");
        }
    }
}
