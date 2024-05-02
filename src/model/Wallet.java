package model;

public class Wallet {
    private String numWallet_1;
    private double amount;
    private Transaction transaction;
    private User sender;

    public Wallet( double amount, User sender) {
        this.numWallet_1 = sender.getIdUser();
        this.amount = amount;
    }

    public void makeTransaction(Transaction transaction){
        User sender = new User();
        User receiver;


        if (numWallet_1.equals(transaction.getSender().getIdUser())){

        if (transaction.getAmount()<=amount){
                transaction.setAmount(amount - transaction.getAmount());
                if (numWallet_2.equals(transaction.getReceiver().getName())){
                    transaction.setAmount(amount  + transaction.getAmount());
                }
            }
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
