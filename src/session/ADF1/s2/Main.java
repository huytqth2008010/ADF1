package session.ADF1.s2;

public class Main {
    public static void main(String[] args){
        s2_car c = new s2_car();// chay luon ham khoi tao tai day
        //c.model = "911";
        c.setModel("911");
//        c.setSoBanhxe(4);
        System.out.println("SO banh xe: "+c.getSoBanhxe());
        c.run();
        c.going();
    }
}
