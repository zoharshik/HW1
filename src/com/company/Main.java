package com.company;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        IAccount a = new StandardAccount(1,-300);
        IAccount b = new StandardAccount(2,-400);
        IAccount c = new BasicAccount(3,300);
        IAccount d = new BasicAccount(4,300);
        IAccount e = new PremiumAccount(5);
        IAccount f = new PremiumAccount(6);
        IBank bankhapoalim = new Bank();

        a.Deposit(100);
        b.Withdraw(100);
        c.Deposit(300);
        d.Deposit(100);
        e.Deposit(200);
        f.Withdraw(100);

        bankhapoalim.OpenAccount(a);
        bankhapoalim.OpenAccount(b);
        bankhapoalim.OpenAccount(c);
        bankhapoalim.OpenAccount(d);
        bankhapoalim.OpenAccount(e);
        bankhapoalim.OpenAccount(f);

        List<IAccount> abc = bankhapoalim.GetAllAccount();
        System.out.println(abc);

        List<IAccount> bcd = bankhapoalim.GetAllAccountInDebt();
        System.out.println(bcd);

        List<IAccount> cde = bankhapoalim.GetAllAccountWithBalance(100);
        System.out.println(cde);

        bankhapoalim.CloseAccount(1);
        bankhapoalim.CloseAccount(2);

        List<IAccount> xyz = bankhapoalim.GetAllAccount();
        System.out.println(xyz);




    }
}
