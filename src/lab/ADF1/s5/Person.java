package lab.ADF1.s5;

import java.util.Date;
import java.util.Scanner;

public class Person {
    public String Ten;
    public String GioiTinh;
    public String NgaySinh;
    public String DiaChi;
    public Person(){
    }
    public Person(String ten, String gioiTinh, String ngaySinh, String diaChi) {
        Ten = ten;
        GioiTinh = gioiTinh;
        NgaySinh = ngaySinh;
        DiaChi = diaChi;
    }

    public String getTen() { return Ten; }
    public void setTen(String ten) { Ten = ten; }

    public String getGioiTinh() { return GioiTinh; }
    public void setGioiTinh(String gioiTinh) { GioiTinh = gioiTinh; }

    public String getNgaySinh() { return NgaySinh; }
    public void setNgaySinh(String ngaySinh) { NgaySinh = ngaySinh; }

    public String getDiaChi() { return DiaChi; }
    public void setDiaChi(String diaChi) { DiaChi = diaChi; }

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten:");
        setTen(sc.nextLine());

        System.out.println("Nhap GioiTinh:");
        setGioiTinh(sc.nextLine());

        System.out.println("Nhap NgaySinh:");
        setNgaySinh(sc.nextLine());

        System.out.println("Nhap DiaChi:");
        setDiaChi(sc.nextLine());

        System.out.println();
    }
    public void InThongTin(){
        System.out.println("Tên SV : " + getTen());
        System.out.println("GioiTinh của SV : " + getGioiTinh());
        System.out.println("NgaySinh của SV : " + getNgaySinh());
        System.out.println("DiaChi của SV : " + getDiaChi());
    }
}
