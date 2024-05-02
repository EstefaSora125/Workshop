package model;

import java.time.LocalDateTime;

public class Transaction {

    private  String idNumber;
    private double amount;
    private User sender;
    private User receiver;
    private LocalDateTime dateTransaction;

    public Transaction(String idNumber, double amount, User sender, User receiver, LocalDateTime dateTransaction) {
        this.idNumber = idNumber;
        this.amount = amount;
        this.sender = sender;
        this.receiver = receiver;
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
