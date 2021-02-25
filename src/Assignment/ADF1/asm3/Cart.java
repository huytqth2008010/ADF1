package Assignment.ADF1.asm3;

import java.util.ArrayList;

public class Cart {
    private int id;
    ArrayList<String> Customer;
    private float grandTotal;
    ArrayList<String> productList;
    private String city;

//Constructor ko tham số, tạo ô nhớ cho mảng
    public Cart(){
        Customer = new ArrayList<String>();
        productList = new ArrayList<String>();
    }
//----------//
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public float getGrandTotal() { return grandTotal; }
    public void setGrandTotal(float grandTotal) { this.grandTotal = grandTotal; }
    public String getCity() { return city; }
    public void setCity(String city) { this.city = city; }
//======= Thêm 1 sản phẩm vào giỏ hàng ======//
    public void addSP(String sp) {
        productList.add(sp);
    }
//======= Xoá 1 sản phẩm khỏi giỏ hàng ======//
    public void removeSP(String sp) {
        productList.remove(sp);
    }
//======= Tổng tiền ======//
    public void grandTotal(String sp){

    }
}
