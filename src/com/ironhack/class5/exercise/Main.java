package com.ironhack.class5.exercise;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        Transaction transaction1 = new Transaction(10010, 20320, 20000, new Date(2014, Calendar.APRIL, 11));
        Transaction transaction2 = new Transaction(11067, 20121, 50000, new Date(2017,  Calendar.MAY, 26));
        Transaction transaction3 = new Transaction(12001, 23070, 45000, new Date(2020,  Calendar.DECEMBER, 01));
        PaymentList paymentList1 = new PaymentList();

        paymentList1.addTransaction(transaction1);
        paymentList1.addTransaction(transaction2);
        paymentList1.addTransaction(transaction3);

        System.out.println("LAST TRANSACTION : \n" + paymentList1.getLastTransaction());
        System.out.println("TRANSACTION BY DATE : \n" + paymentList1.getTransactionByDate(new Date(2014,04,11)));

        System.out.println("ALL TRANSACTIONS : \n" + paymentList1.getAllTransactions());
    }
}
