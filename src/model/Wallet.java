package model;

public class Wallet {
    private double numWallet;
    private double amount;
    private Transaction transaction;
    private User sender;
    private User receiver;

    public Wallet(double numWallet, double amount) {
        this.numWallet = numWallet;
        this.amount = amount;
    }

    public void makeTransaction(Transaction transaction){
        double result=0;


        if (transaction.getAmount() <=amount){
            result = amount - transaction.getAmount();


        }
    }

    public double getNumWallet() {
        return numWallet;
    }

    public void setNumWallet(double numWallet) {
        this.numWallet = numWallet;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "numWallet=" + numWallet +
                ", amount=" + amount +
                '}';
    }
}
