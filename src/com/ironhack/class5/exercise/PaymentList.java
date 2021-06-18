package com.ironhack.class5.exercise;

import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class PaymentList implements TransactionList {
    List<Transaction> allTransactions = new ArrayList<>();

    public Transaction getLastTransaction() {
        return allTransactions.get(allTransactions.size() -1);
    }

    public void addTransaction(Transaction transaction) {
        allTransactions.add(transaction);
    }

    public Transaction getTransactionByDate(Date date) {
        for(Transaction tr : allTransactions){
            if (tr.getDate().equals(date)) {
                return tr;
            }
        }
        return new Transaction();
    }

    public List<Transaction> getAllTransactions() {
        return allTransactions;
    }
}
