package com.ironhack.class5.exercise;

import java.util.List;
import java.util.Date;

public interface TransactionList {
    Transaction getLastTransaction();
    void addTransaction(Transaction transaction);
    Transaction getTransactionByDate(Date date);
    List<Transaction> getAllTransactions();
}
