package model;

public class Wallet {
    private double numWallet;
    private double amount;
    private Transaction transaction;
    private User user;

    public Wallet(double numWallet, double amount) {
        this.numWallet = numWallet;
        this.amount = amount;
    }

    public void makeTransaction(Transaction transaction){
        if (transaction.getAmount() <=amount){
            user = transaction.getSender();
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
