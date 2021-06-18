package com.ironhack.class5.exercise;

import java.util.Date;

public class Transaction {
    private int sellerAccountNumber;
    private int buyerAccountNumber;
    private double amount;
    private Date date;

    public Transaction() {};
    public Transaction(int sellerAccountNumber, int buyerAccountNumber, double amount, Date date) {
        setSellerAccountNumber(sellerAccountNumber);
        setBuyerAccountNumber(buyerAccountNumber);
        setAmount(amount);
        setDate(date);
    }

    public String toString() {
        return "--- Transaction --- \n" +
                "· sellerAccountNumber: " + sellerAccountNumber + ", \n" +
                "· buyerAccountNumber: " + buyerAccountNumber + ", \n" +
                "· amount: " + amount + ", \n" +
                "· date: " + date
                + "\n" + "\n";
    }

    // Setters


    public void setSellerAccountNumber(int sellerAccountNumber) {
        this.sellerAccountNumber = sellerAccountNumber;
    }

    public void setBuyerAccountNumber(int buyerAccountNumber) {
        this.buyerAccountNumber = buyerAccountNumber;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Getters


    public int getSellerAccountNumber() {
        return this.sellerAccountNumber;
    }

    public int getBuyerAccountNumber() {
        return this.buyerAccountNumber;
    }

    public double getAmount() {
        return this.amount;
    }

    public Date getDate() {
        return this.date;
    }



}
