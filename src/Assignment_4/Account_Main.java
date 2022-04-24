package Assignment_4;

public class Account_Main {
    public static void main(String[] args) {
        Account account = new Account();
        account.setId(1012);
        account.setBalance(20000000);
        account.setAnnualInterestRate(4.5/100);

        // Rut tien
        try {
            account.withdraw(1500000);
        } catch (Exception ex) {
            System.out.println("Tien khong du de rut");
        }

        // Gui tien
        account.deposit(3000000);

        System.out.println("So tien du: " + account.getBalance());
        System.out.println("Tien lai hang thang: " + account.getMonthlyInterest());
        System.out.println("Ngay tao tai khoan: " + account.getDateCreated());

    }
}
