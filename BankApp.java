package com.bank.main;

public class BankApp {

    public static void main(String[] args) {

        BankService bank = new BankService();

        while (true) {
            System.out.println("\n====== SMART BANK MANAGEMENT SYSTEM ======");
            System.out.println("1. Create Account");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Check Balance");
            System.out.println("5. View Account Details");
            System.out.println("6. Exit");

            int choice = InputUtil.getInt("Enter choice: ");

            switch (choice) {
                case 1:
                    int accNo = InputUtil.getInt("Enter Account Number: ");
                    String name = InputUtil.getString("Enter Name: ");
                    double amt = InputUtil.getDouble("Enter Initial Deposit: ");
                    System.out.println(bank.createAccount(accNo, name, amt));
                    break;

                case 2:
                    accNo = InputUtil.getInt("Enter Account Number: ");
                    amt = InputUtil.getDouble("Enter Deposit Amount: ");
                    System.out.println(bank.deposit(accNo, amt));
                    break;

                case 3:
                    accNo = InputUtil.getInt("Enter Account Number: ");
                    amt = InputUtil.getDouble("Enter Withdraw Amount: ");
                    System.out.println(bank.withdraw(accNo, amt));
                    break;

                case 4:
                    accNo = InputUtil.getInt("Enter Account Number: ");
                    System.out.println(bank.checkBalance(accNo));
                    break;

                case 5:
                    accNo = InputUtil.getInt("Enter Account Number: ");
                    System.out.println(bank.viewAccount(accNo));
                    break;

                case 6:
                    System.out.println("Thank you for using Smart Bank System!");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice. Try Again!");
            }
        }
    }
}
