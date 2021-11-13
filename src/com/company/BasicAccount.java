package com.company;

public class BasicAccount implements IAccount{
    public int AccountNumber;
    public double Balance;
    public double WithdrawalLimit;

    public BasicAccount(int accountNumber, double withdrawalLimit){
        this.AccountNumber = accountNumber;
        this.Balance = 0;
        this.WithdrawalLimit = withdrawalLimit;

    }

    @Override
    public void Deposit(double amount) {
        this.Balance += amount;
    }

    @Override
    public double Withdraw(double amount) {
        if(amount <= this.WithdrawalLimit) {

            if(amount <= this.Balance) {
               this.Balance -= amount;
               return amount;

            }else {
                double temp = this.Balance;
                this.Balance = 0;
                return temp;
            }
        }else {

            if (amount <= this.Balance) {
                this.Balance -= this.WithdrawalLimit;
                return this.WithdrawalLimit;

            } else {
                if (this.Balance >= this.WithdrawalLimit) {
                    this.Balance -= this.WithdrawalLimit;
                    return this.WithdrawalLimit;
                } else {
                    double temp = this.Balance;
                    this.Balance = 0;
                    return temp;
                }
            }
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
