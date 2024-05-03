package model;

public class Wallet {
    private String numWallet; // Generar
    private double amount;
    private Transaction transaction;
    private User usuario;

    public Wallet( double amount, User usuario) {
        this.amount = amount;
        this.usuario = usuario;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getShowData() {
        return "Wallet{" +
                "amount=" + amount +
                ", usuario=" + usuario +
                '}';
    }
}
