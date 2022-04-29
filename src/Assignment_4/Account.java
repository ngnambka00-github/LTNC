package Assignment_4;

import java.util.Date;

public class Account {
    private int id;                    // id account
    private double balance;            // so du trong tai khoan
    private double annualInterestRate; // lai suat nam
    private Date dateCreated;          // Ngay tao tai khoan

    public Account() {
        // Khởi tạo các giá trị mặc định
        id = 0;
        balance = 0;
        annualInterestRate = 0;
        dateCreated = new Date();
    }

    public Account(int newId, double newBalance) {
        this.id = newId;
        this.balance = newBalance;
        dateCreated = new Date();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    // Trả về lãi suất tháng
    public double getMonthlyInterestRate() {
        return annualInterestRate / 12;
    }

    // Trả về tiền lãi hàng tháng
    public double getMonthlyInterest() {
        return balance * getMonthlyInterestRate();
    }

    // Rut tien
    public void withdraw(double money) throws Exception {
        if (balance - money < 0) {
            throw new Exception("Tien khong du de rut");
        }
        balance -= money;
    }

    // Gui them tien
    public void deposit(double money) { balance += money; }
}
