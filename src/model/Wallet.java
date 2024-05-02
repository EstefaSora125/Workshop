package model;

public class Wallet {
    private String numWallet_1;
    private double amount;
    private Transaction transaction;
    private User user;

    public Wallet( double amount, User sender) {
        this.numWallet_1 = sender.getIdUser();
        this.amount = amount;
    }

    public void makeTransaction(Transaction transaction){
        User sender = transaction.getSender();
        User receiver = transaction.getReceiver();

        if (sender.getIdUser() ==){

        }




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
                ", amount=" + amount +
                '}';
    }
}
