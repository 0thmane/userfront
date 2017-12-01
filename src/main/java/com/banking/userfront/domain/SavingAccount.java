package com.banking.userfront.domain;

import java.math.BigDecimal;
import java.util.List;

public class SavingAccount {

    private Long id;
    private int accountNumber;
    private BigDecimal accountBalance;
    private List<SavingTransaction> lSavingTransaction;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public BigDecimal getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(BigDecimal accountBalance) {
        this.accountBalance = accountBalance;
    }

    public List<SavingTransaction> getlSavingTransaction() {
        return lSavingTransaction;
    }

    public void setlSavingTransaction(List<SavingTransaction> lSavingTransaction) {
        this.lSavingTransaction = lSavingTransaction;
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "id=" + id +
                ", accountNumber=" + accountNumber +
                ", accountBalance=" + accountBalance +
                ", lSavingTransaction=" + lSavingTransaction +
                '}';
    }
}
