package lab.ADF1.s5;

import lab.ADF1.s4_2.SinhVien;

import java.util.ArrayList;
import java.util.Scanner;

public class GiaoVien extends Person {
    public String DanhSachLopGiangDay;
    public String MucLuong;
    public String SoMonGiangDay;
    public String CacMonGiangDay;


    public String getDanhSachLopGiangDay() { return DanhSachLopGiangDay; }
    public void setDanhSachLopGiangDay(String danhSachLopGiangDay) { DanhSachLopGiangDay = danhSachLopGiangDay; }

    public String getMucLuong() { return MucLuong; }
    public void setMucLuong(String mucLuong) { MucLuong = mucLuong; }

    public String getSoMonGiangDay() { return SoMonGiangDay; }
    public void setSoMonGiangDay(String soMonGiangDay) { SoMonGiangDay = soMonGiangDay; }

    public String getCacMonGiangDay() { return CacMonGiangDay; }
    public void setCacMonGiangDay(String cacMonGiangDay) { CacMonGiangDay = cacMonGiangDay; }


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

        System.out.println("DanhSachLopGiangDay");
        setDanhSachLopGiangDay(sc.nextLine());

        System.out.println("Nhap MucLuong:");
        setMucLuong(sc.nextLine());

        System.out.println("Nhap SoMonGiangDay:");
        setSoMonGiangDay(sc.nextLine());

        System.out.println("Nhap CacMonGiangDay:");
        setCacMonGiangDay(sc.nextLine());

        System.out.println();
    }
    public void InThongTin(){
        System.out.println("Tên GV: " + getTen());
        System.out.println("GioiTinh của GV: " + getGioiTinh());
        System.out.println("NgaySinh của GV: " + getNgaySinh());
        System.out.println("DiaChi của GV: " + getDiaChi());
        System.out.println("DanhSachLopGiangDay của GV : " + getDanhSachLopGiangDay());
        System.out.println("MucLuong của GV : " + getMucLuong());
        System.out.println("SoMonGiangDay : " + getSoMonGiangDay());
        System.out.println("CacMonGiangDay : " + getCacMonGiangDay());
        System.out.println();
    }
}
