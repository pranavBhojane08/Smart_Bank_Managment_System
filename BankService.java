package com.bank.main;

import java.util.HashMap;
import java.util.Map;

public class BankService {

    private Map<Integer, Account> accounts = new HashMap<>();

    public String createAccount(int accNo, String name, double amount) {
        if (accounts.containsKey(accNo)) {
            return "Account already exists!";
        }
        Account acc = new Account(accNo, name, amount);
        accounts.put(accNo, acc);
        return "Account created successfully!";
    }

    public String deposit(int accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc == null) return "Account not found!";
        acc.deposit(amount);
        return "Deposit successful. New Balance: " + acc.getBalance();
    }

    public String withdraw(int accNo, double amount) {
        Account acc = accounts.get(accNo);
        if (acc == null) return "Account not found!";
        if (!acc.withdraw(amount)) {
            return "Insufficient balance!";
        }
        return "Withdraw successful. New Balance: " + acc.getBalance();
    }

    public String checkBalance(int accNo) {
        Account acc = accounts.get(accNo);
        if (acc == null) return "Account not found!";
        return "Balance: ₹" + acc.getBalance();
    }

    public String viewAccount(int accNo) {
        Account acc = accounts.get(accNo);
        if (acc == null) return "Account not found!";
        return acc.toString();
    }
}
