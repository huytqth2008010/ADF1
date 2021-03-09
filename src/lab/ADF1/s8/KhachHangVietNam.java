package lab.ADF1.s8;

public class KhachHangVietNam extends KhachHang{
    public String DoiTuong;

    public KhachHangVietNam() {
    }

    public String getDoiTuong() {
        return DoiTuong;
    }

    public void setDoiTuong(String DoiTuong) {
        this.DoiTuong = DoiTuong;
    }

    public KhachHangVietNam(String DoiTuong) {
        this.DoiTuong = DoiTuong;
    }


    @Override
    public double thanhTien() {
        if(getSoluong()<50){
            return getSoluong()*1000;
        }else if(getSoluong() >= 50 && getSoluong()<100){
            return (getSoluong()-50)*1200 + 50 * 1000;
        }else if(getSoluong()>=100 && getSoluong() < 200){
            return (getSoluong()-100)*1500+ 50 * 1200 + 50 * 1000;
        }else{
            return (getSoluong()-200)*2000 +  100*1500 + 50 * 1200 + 50 * 1000;
        }
    }
}
