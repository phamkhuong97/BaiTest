package BaiLam;

import java.util.Scanner;

public class BaiSo_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Cho 1 mảng 3n phần tử các số nguyên => số hàng mặc định là m = 3, số cột n = ?
        int m = 3;
        System.out.printf("Input n = ");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j <n; j++) {
                System.out.printf("arr["+i+"]["+j+"] = " );
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println("mảng sau khi nhập input: n = "+n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.printf(arr[i][j]+" ");
            }
        }

        System.out.println("\nMảng sau khi cấu trúc lại là ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf(arr[j][i]+" ");
            }
        }
    }
}
