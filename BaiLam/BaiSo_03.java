package BaiLam;

import java.util.Scanner;

public class BaiSo_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số phần tử của mảng n = ");
        int n;
        do {
            n = sc.nextInt();
            if (n>10000 || n<0){
                System.out.println("Nhập lại số phần tử n  = ");
            }
        }while (n>10000 || n<0);

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("a["+i+"] = ");
            a[i] = sc.nextInt();
        }
        System.out.println("Mảng sau khi nhập là: ");
        for (int i = 0; i < n; i++) {
            System.out.printf(a[i]+" ");
        }
        //sắp xếp tăng , 5 3 6 2 7 4 5
        for (int i = 0; i < n-1; i++) {//5
            for (int j = i+1; j < n; j++) {//6
                if (a[i]>a[j]){
                    int tg = a[i];
                    a[i] = a[j];
                    a[j]=tg;
                }
            }
        }
        System.out.println("\nMảng sau khi sắp xếp tăng là: ");
        for (int i = 0; i <n ; i++) {
            System.out.printf(a[i]+" ");
        }

        int khoangCachMin = a[1]-a[0];
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n ; j++) {
                if (khoangCachMin > (a[j]-a[i])){
                    khoangCachMin = a[j]-a[i];
                }
            }
        }
        System.out.println("\nKhoảng cách nhỏ nhất giữa 2 phần tử trong mảng là " + khoangCachMin);
        System.out.printf("các cặp giá trị có khoảng cách nhỏ nhắt bằng nhau là: ");
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n ; j++) {
                if (khoangCachMin == (a[j]-a[i])){
                    System.out.printf("["+a[i]+","+a[j]+"]");
                }
            }
        }
    }
}
