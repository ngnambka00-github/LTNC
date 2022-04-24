package Assignment_4;

import java.util.Scanner;

public class Bai4_Main {
    public static void drawMenu() {
        System.out.println("Main menu");
        System.out.println("1. check balance");
        System.out.println("2. withdraw");
        System.out.println("3. deposit");
        System.out.println("4. exit");
    }

    public static void main(String[] args) {
        Account[] arrAccount = new Account[10];
        for (int i = 0; i < arrAccount.length; i++) {
            arrAccount[i] = new Account();
            arrAccount[i].setId(i);
            arrAccount[i].setBalance(1000000);
        }

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Enter your id: ");
            int id = scanner.nextInt();
            if (id < 1 || id > 9) {
                System.out.println("Id khong ton tai! Vui long nhap lai id ...");
            } else {
                while (true) {
                    System.out.println();
                    drawMenu();
                    System.out.print("Enter your choice: ");
                    int choice = scanner.nextInt();

                    boolean checkExit = false;

                    switch (choice) {
                        case 1:
                            System.out.println("The balance is: " + arrAccount[id].getBalance());
                            break;

                        case 2:
                            System.out.print("Enter an amount to withdraw: ");
                            double moneWithdraw = scanner.nextDouble();
                            try {
                                arrAccount[id].withdraw(moneWithdraw);
                            } catch (Exception ex) {
                                System.out.println("Tien khong du de rut");
                            }
                            break;

                        case 3:
                            System.out.print("Enter an amount to deposit: ");
                            double moneyDeposit = scanner.nextDouble();
                            arrAccount[id].deposit(moneyDeposit);
                            break;

                        case 4:
                            checkExit = true;
                            break;
                        default: break;
                    }

                    if (checkExit) break;
                }
            }
        }
    }
}
