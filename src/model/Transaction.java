package model;

import java.time.LocalDateTime;

public class Transaction {

    private  String id;
    private double amount;
    private User sender;
    private User receiver;
    private LocalDateTime date;

    public Transaction(String id, double amount, User sender, User receiver, LocalDateTime date) {
        this.id = id;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
        this.date = date;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "Transaction{" +
                "idNumber='" + id + '\'' +
                ", amount=" + amount +
                ", sender=" + sender +
                ", receiver=" + receiver +
                ", dateTransaction=" + date +
                '}';
    }
}
