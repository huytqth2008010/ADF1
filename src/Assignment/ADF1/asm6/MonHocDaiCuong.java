package Assignment.ADF1.asm6;

import lab.ADF1.s6.PhoneNumber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MonHocDaiCuong extends MonHoc {
    public ArrayList<LopHoc> danhSachLopHoc;

    public MonHocDaiCuong() {
        danhSachLopHoc = new ArrayList<>();

    }
    @Override
    void themLopHoc(String name, int soluonghocsinh) {

        for(LopHoc p:danhSachLopHoc){
            if(p.getName().equals(name)){
                if(!p.getLopHoc().contains(soluonghocsinh)){
                    p.addSoluonghocsinh(soluonghocsinh);
                }
                return;
            }
        }
        LopHoc p = new LopHoc(name,soluonghocsinh);
        danhSachLopHoc.add(p);
    }

    @Override
    void xoaLopHoc(String name) {
        for(LopHoc p:danhSachLopHoc){
            if(p.getName().equals(name)){
                danhSachLopHoc.remove(p);
                return;
            }
        }
    }

    @Override
    public void sort() {
        danhSachLopHoc.sort(new Comparator<LopHoc>() {
            @Override
            public int compare(LopHoc o1, LopHoc o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
    }

    @Override
    void inDanhSach() {
        for(LopHoc p :danhSachLopHoc){
            System.out.println(p.getName());
            for(Integer s:p.getLopHoc()){
                System.out.println(s);
            }
        }
    }
}

