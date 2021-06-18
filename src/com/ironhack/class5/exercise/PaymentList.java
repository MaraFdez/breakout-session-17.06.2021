package com.ironhack.class5.exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class PaymentList extends Transaction implements TransactionList {
    List<Transaction> paymentList = new ArrayList<>();

    public Transaction getLastTransaction() {
        return paymentList.get(paymentList.size() -1);
    }

    public void addTransaction(Transaction transaction) {
        paymentList.add(transaction);
    }

    public Transaction getTransactionByDate(Date date) {
        int x = 0;
        if(this.getDate() == date) {
            for (int i = 0; i < paymentList.size(); i++) {
                x = i;
            }
        }
        return paymentList.get(x);
    }

    public List<Transaction> getAllTransactions() {
        return paymentList;
    }
}
