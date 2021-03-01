//Viết chương trình cho phép nhập vào 3 số thực
//Chương trình này sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác hay không.
package HocThem.java;

import java.util.Scanner;

public class BaiTapJavaCoBan3 {
    public static void main(String[] srgs){
        float a,b,c;
        System.out.println("Nhap 3 so thuc : ");
        Scanner sc = new Scanner(System.in);

        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();

        if ((a+b>c)&&(a+c>b)&&(b+c>a))
            System.out.println("La 3 canh cua tam giac");
        else
            System.out.println("k la 3 canh cua tam giac");
    }
}
