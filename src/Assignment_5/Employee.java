package Assignment_5;

import java.util.Date;

public class Employee extends Person {
    protected String office;
    protected double salary;
    protected Date startDate;

    public Employee() {
        office = "";
        salary = 0;
        startDate = new Date();
    }

    public Employee(String name, String address, String phoneNumber, String email, String office, double salary, Date startDate) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.startDate = startDate;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "office='" + office + '\'' +
                ", salary=" + salary +
                ", startDate=" + startDate +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
