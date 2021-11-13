package com.company;

public class StandardAccount implements IAccount {

    public int AccountNumber;
    public double CreditLimit;
    public double Balance;

    public StandardAccount(int accountNumber, double creditLimit){
        this.AccountNumber = accountNumber;
        this.Balance = 0;
        if(creditLimit >= 0){
            this.CreditLimit = 0;
        }else {
            this.CreditLimit = creditLimit;
        }

    }

    @Override
    public void Deposit(double amount) {
        this.Balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        double maxAmount = this.Balance - this.CreditLimit;
        if(amount <= maxAmount){
            this.Balance -= amount;
            return amount;
        }else {
            this.Balance -= maxAmount;
            return maxAmount;
        }

    }

    @Override
    public double GetCurrentBalance() {
        return this.Balance;
    }

    @Override
    public int GetAccountNumber() {
        return this.AccountNumber;
    }
}
