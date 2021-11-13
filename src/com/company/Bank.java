package com.company;

import java.util.ArrayList;
import java.util.List;

public class Bank implements IBank{
    public List<IAccount> Accounts;

    public Bank(){
        this.Accounts = new ArrayList<>();

    }

    @Override
    public void OpenAccount(IAccount account) {
        this.Accounts.add(account);
    }

    @Override
    public void CloseAccount(int accountNumber) {
        IAccount temp = null;
        for (IAccount x :  this.Accounts){
            if(x.GetAccountNumber() == accountNumber){
                if(x.GetCurrentBalance() >= 0){
                    temp = x;
                }else{
                    System.out.println("this account cannot be closed due to debt");
                }
            }
        }
        if(temp != null){
            this.Accounts.remove(temp);
        }

    }

    @Override
    public List<IAccount> GetAllAccount() {
        return this.Accounts;
    }

    @Override
    public List<IAccount> GetAllAccountInDebt() {
        List<IAccount> temp = new ArrayList<>();
        for(IAccount x : this.Accounts){
            if(x.GetCurrentBalance() < 0){
                temp.add(x);
            }
        }
        return temp;
    }

    @Override
    public List<IAccount> GetAllAccountWithBalance(double balanceAbove) {
        List<IAccount> temp = new ArrayList<>();
        for(IAccount x : this.Accounts){
            if(x.GetCurrentBalance() > balanceAbove){
                temp.add(x);
            }
        }
        return temp;

    }


}
