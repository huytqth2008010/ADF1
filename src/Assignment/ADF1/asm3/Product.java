package Assignment.ADF1.asm3;

import java.util.ArrayList;

public class Product {
    private int id;
    private String productName;
    private int qly;
    private float price;
    public Product(){
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getProductName() { return productName; }
    public void setProductName(String name) { this.productName = name; }
    public int getQly() { return qly; }
    public void setQly(int qly) { this.qly = qly; }
    public float getPrice() { return price; }
    public void setPrice(float price) { this.price = price; }



    public void kiemtra(){
        if(qly>0)
            System.out.println("còn hàng");
        else
            System.out.println("hết hàng");
    }

}
