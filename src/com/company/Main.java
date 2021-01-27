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

        Student st; //Khai báo một biến có kiểu dữ liệu Student
        st = new Student();//Tạo đối tượng -> st sec có 1 ô nhớ
        Student st2 = new Student();
        st.name = "Nguyen Van An";
        st2.name = "Le Manh Dung";
        st.run();
        st2.run();


    }
}
