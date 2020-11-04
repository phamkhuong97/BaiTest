package BaiLam;

import java.util.Scanner;

public class BaiSo_02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số phần tử của mảng n = ");
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a["+i+"] = " );
            a[i] = sc.nextInt();
        }
        System.out.println("\nMảng sau khi nhập là");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i]+" ");
        }
        int max1 = a[0];
        for (int i = 0; i < n; i++) {
            if (max1<a[i]){
                max1=a[i];
            }
        }
        System.out.println("\nPhần tử lớn thứ 1 trong mảng là "+ max1);
        int max2 = a[0];
        for (int i = 0; i < n; i++) {
            if (max2<a[i] && a[i]!=max1){
                max2=a[i];
            }
        }
        System.out.println("Phần tử lớn thứ 2 trong mảng là "+ max2);
        int tong = max1+max2;
        System.out.println(" tổng lớn nhất được tạo thành từ 2 phần tử trong mảng là "+tong);
    }
}
