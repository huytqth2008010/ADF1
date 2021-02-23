//Kiểm tra số chẵn hay số lẻ trong java
//package HocThem.java;
//
//public class KiemTraSoChanLe {
//    public static void main(String[] sgrs){
//        int n=10;
//        if(n % 2==0)
//            System.out.println("la So chan");
//        else
//            System.out.println("La so le");
//    }
//}

// Kiểm tra số chẵn hay số lẻ sử dụng Scanner
package HocThem.java;

import java.util.Scanner;

public class KiemTraSoChanLe {
    public static void main(String[] sgrs){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so :");
        n = sc.nextInt();
        if(n%2==0)
            System.out.println("Day la so chan");
        else
            System.out.println("Day la so le");

    }
}