package com.company;

public class Main {

    public static void main(String[] args) {
        IAccount x = new BasicAccount(222,300);
        x.Deposit(400);
        double y = x.Withdraw(500);
        System.out.println(y);
        double z = x.GetCurrentBalance();
        int w = x.GetAccountNumber();
        System.out.println(z);
        System.out.println(w);


    }
}
