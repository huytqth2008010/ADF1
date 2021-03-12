package PRACTICAL;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        ArrayList<Hotel> hotels = new ArrayList<Hotel>();
        hotels.add(new Hotel("Khách Sạn Colline", "Vinh Phuc", "ownername1"));
        hotels.add(new Hotel("Khách Sạn Minh Nhật Tân ", "Ha Noi", "ownername2"));
        hotels.add(new Hotel("Swiss-Belresort Tuyen Lam Dalat ", "Phu Tho", "ownername3"));
        hotels.add(new Hotel("Khách Sạn Ladalat", "Hai Phong", "ownername4"));
        hotels.add(new Hotel("Terracotta Hotel And Resort Đà Lạt", "Ho Chi Minh", "ownername5"));
        hotels.add(new Hotel("Ana Villas Dalat Resort & Spa ", "Ca Mau", "ownername6"));
        hotels.add(new Hotel("Maika Condotel Đà Lạt", "Sai Gon", "ownername7"));
        hotels.add(new Hotel("Khách Sạn Golf Valley", "Bac Ninh", "ownername8"));
        hotels.add(new Hotel("Khách Sạn Dalat Palace Convention ", "Thai Nguyen", "ownername9"));
        hotels.add(new Hotel("Khách Sạn Saphir Đà Lạt", "Tuyen Quang", "ownername10"));
        Scanner scanner = new Scanner(System.in);
        String ownerName;
        System.out.println("Input the Owner’s Name:");
        ownerName = scanner.nextLine();
        scanner.close();
        for (int i = 0; i < hotels.size(); i++) {
            if (ownerName.equals(hotels.get(i).getOwnerName())) {
                System.out.println(" Hotel name: " + hotels.get(i).getName() + "\n Hotel location: "
                        + hotels.get(i).getLocation() + "\n Hotel owner name: " + hotels.get(i).getOwnerName());
            }
        }
        System.out.println("Finish");
    }
}
