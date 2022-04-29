package Assignment_5;

import java.util.Date;

public class Bai2_Main {
    public static void main(String[] args) {
        // Tạo thông tin Leturer
        String name = "Vladimir Vladimirovich Putin";
        String address = "Russian";
        String phoneNumber = "123456789";
        String office = "Russian government office";
        String email = "russian.xxx@gmail.com";
        double salary = 9999999999d;
        Date startDate = new Date();
        double officeHours = 10d;
        String title = "President";

        Leturer leturer = new Leturer(name, address, phoneNumber, email, office, salary, startDate, officeHours, title);

        System.out.println("Information of Leturer: \n" + leturer.toString());

    }
}
