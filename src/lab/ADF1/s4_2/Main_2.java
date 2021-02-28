package lab.ADF1.s4_2;


public class Main_2{
    public static void main(String[] args) {
        SinhVien r = new SinhVien();
        r.setMaso(1);
        r.setHovaten("hoàng sơn");
        r.setDiachi("bắc giang");
        r.setSdt(12344456);


        SinhVien r1 = new SinhVien();
        r1.setMaso(2);
        r1.setHovaten("bùi sơn");
        r1.setDiachi("hà nội");
        r1.setSdt(2341678);

        LopHoc lh = new LopHoc();
        lh.setMalop(1);
        lh.setTenlop("T2008M");
        lh.setPhonghoc("phong so 2");


        lh.addSv(r);
        lh.addSv(r);
        lh.addSv(r);
        lh.addSv(r1);
        lh.addSv(r1);
        lh.addSv(r1);

        System.out.println("danh sach sinh vien trong lop:");
        for (SinhVien p : lh.getDanhsachsinhvien()) {
            System.out.println(p.getMaso() + "-" + p.getHovaten() + "-" + p.getDiachi() + "-" + p.getSdt());
        }
    }
}
