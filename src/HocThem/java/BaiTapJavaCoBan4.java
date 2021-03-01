//Viết chương trình cho phép nhập vào 3 số
//Chương trình sẽ kiểm tra 3 số này có phải là 3 cạnh của một tam giác vuông hay không.
package HocThem.java;

import java.util.Scanner;

public class BaiTapJavaCoBan4 {
    public static void main(String[] srgs){
        int a,b,c;
        System.out.println("Nhap 3 so:");
        Scanner sc = new Scanner(System.in);

        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();

        if(a*a+b*b==c*c || b*b+c*c==a*a || c*c+a*a==b*b)
            System.out.println("Ba số đúng là 3 cạnh của 1 tam giác vuông");
        else
            System.out.println("Ba số không phải là cạnh của 1 tam giác vuông");
    }
}
