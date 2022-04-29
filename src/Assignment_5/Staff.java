package Assignment_5;

import java.util.Date;

public class Staff extends Employee{
    // Cấp bậc
    private int rank;

    public Staff() {
        rank = 0;
    }

    public Staff(String name, String address, String phoneNumber, String email, String office, double salary, Date startDate, int rank) {
        super(name, address, phoneNumber, email, office, salary, startDate);
        this.rank = rank;
    }

    public int getRank() {
        return rank;
    }


    public void setRank(int rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "rank=" + rank +
                ", office='" + office + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
