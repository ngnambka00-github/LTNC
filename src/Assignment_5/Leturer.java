package Assignment_5;

import java.util.Date;

public class Leturer extends Employee{
    // Giờ hành chính
    private double officeHours;

    // Chức danh
    private String title;

    public Leturer() {
        officeHours = 0;
        title = "";
    }

    public Leturer(String name, String address, String phoneNumber, String email, String office, double salary, Date startDate, double officeHours, String title) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.officeHours = officeHours;
        this.title = title;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(double officeHours) {
        this.officeHours = officeHours;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Leturer{\n\t" +
                "officeHours=" + officeHours +
                "\n\t, title='" + title + '\'' +
                "\n\t, office='" + office + '\'' +
                "\n\t, salary=" + salary +
                "\n\t, startDate=" + startDate +
                "\n\t, name='" + name + '\'' +
                "\n\t, address='" + address + '\'' +
                "\n\t, phoneNumber='" + phoneNumber + '\'' +
                "\n\t, email='" + email + '\'' +
                '}';
    }
}

