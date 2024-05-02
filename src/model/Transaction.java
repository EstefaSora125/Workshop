package model;

import java.util.Calendar;

public class Transaction {

    private  String idNumber;
    private double amount;
    private User sender;
    private User receiver;
    private Calendar dateTransaction;

    public Transaction(String idNumber, double amount, User sender, User receiver, Calendar dateTransaction) {
        this.idNumber = idNumber;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.dateTransaction = dateTransaction;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public User getSender() {
        return sender;
    }

    public void setSender(User sender) {
        this.sender = sender;
    }

    public User getReceiver() {
        return receiver;
    }

    public void setReceiver(User receiver) {
        this.receiver = receiver;
    }

    public Calendar getDateTransaction() {
        return dateTransaction;
    }

    public void setDateTransaction(Calendar dateTransaction) {
        this.dateTransaction = dateTransaction;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "idNumber='" + idNumber + '\'' +
                ", amount=" + amount +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", dateTransaction=" + dateTransaction +
                '}';
    }
}
