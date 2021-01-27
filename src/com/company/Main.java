package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("hello");
//        int x;
//        x = 10;
//        if(x>5){
//            System.out.println(x + " la so duong");
//        }else{
//            System.out.println(x + " <=5");
//        }
//        for (int i = 0;i<10;i++){
//            System.out.println("i = " +i);
//        }

//        Student st; //Khai báo một biến có kiểu dữ liệu Student
//        st = new Student();//Tạo đối tượng -> st sec có 1 ô nhớ
//        Student st2 = new Student();
//        st.name = "Nguyen Van An";
//        st2.name = "Le Manh Dung";
//        st.run();
//        st2.run();

        // Lab s1
        Product sp1;
        sp1 = new Product();
        sp1.Product_code = 1;
        sp1.Product_name = "Nguyen Van An";
        sp1.Price = 2000;
        sp1.Amount = 10;
        sp1.Unit = "Chiec";
        sp1.run();


        Product sp2;
        sp2 = new Product();
        sp2.Product_code = 2;
        sp2.Product_name = "Hoang Van Son";
        sp2.Price = 5300;
        sp2.Amount = 50;
        sp2.Unit = "Chiec";
        sp2.run();

        Product sp3;
        sp3 = new Product();
        sp3.Product_code = 3;
        sp3.Product_name = "Dang Quoc Dat";
        sp3.Price = 45610;
        sp3.Amount = 2;
        sp3.Unit = "Chiec";
        sp3.run();
    }
}
