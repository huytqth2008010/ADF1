package lab.ADF1.s5;

import java.util.Scanner;

public class Student extends Person {
    public String MaSV;
    public int DiemThi;
    public String Gmail;

    public String getMaSV() { return MaSV; }
    public void setMaSV(String maSV) { MaSV = maSV; }

    public int getDiemThi() { return DiemThi; }
    public void setDiemThi(int diemThi) { DiemThi = diemThi; }

    public String getGmail() { return Gmail; }
    public void setGmail(String gmail) { Gmail = gmail; }

    public void NhapThongTin(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ten update...:");
        setTen(sc.nextLine());

        System.out.println("Nhap GioiTinh update...:");
        setGioiTinh(sc.nextLine());

        System.out.println("Nhap NgaySinh update...:");
        setNgaySinh(sc.nextLine());

        System.out.println("Nhap DiaChi update...:");
        setDiaChi(sc.nextLine());

        System.out.println("Nhap MaSV:");
        setMaSV(sc.nextLine());

        System.out.println("Nhap DiemThi:");
        setDiemThi(sc.nextInt());

        System.out.println("Nhap Gmail:");
        setGmail(sc.next());

        System.out.println();
    }
    public void InThongTin(){
        System.out.println("Tên SV update...: " + getTen());
        System.out.println("GioiTinh của SV update...: " + getGioiTinh());
        System.out.println("NgaySinh của SV update...: " + getNgaySinh());
        System.out.println("DiaChi của SV update...: " + getDiaChi());
        System.out.println("MaSV của SV : " + getMaSV());
        System.out.println("DiemThi của SV : " + getDiemThi());
        System.out.println("Gmail của SV : " + getGmail() + "@gmail.com");
        System.out.println();
    }

    public void KiemTraSinhVien(){
        if (getDiemThi() > 8.0)
            System.out.println("Được nhận học bổng");
        else
            System.out.println("Không nhận học bổng");
    }

}
