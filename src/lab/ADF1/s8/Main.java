package lab.ADF1.s8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList ds =  new ArrayList();
        KhachHangVietNam khvn = new KhachHangVietNam();
        khvn.setSoluong(217);
        ds.add(khvn);

        KhachHangNuocNgoai khnn = new KhachHangNuocNgoai();
        khnn.setSoluong(20);
        ds.add(khnn);

        for (int i=0;i<ds.size();i++){
            if(ds.get(i) instanceof KhachHangVietNam){
                System.out.println("tong tien: "+((KhachHangVietNam) ds.get(i)).thanhTien());
            }else if(ds.get(i) instanceof KhachHangNuocNgoai) {
                System.out.println("tong tien: "+((KhachHangNuocNgoai) ds.get(i)).thanhTien());
            }
        }
    }
}
