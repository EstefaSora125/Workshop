package model;


public class Wallet {
    private String numWallet;
    private double amount;
    private User user;

    private String coin;

    public Wallet(double amount, User user, String coin) {
        this.amount = amount;
        this.user = user;
        this.coin = coin;
        this.numWallet = user.getIdUser();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getNumWallet() {
        return numWallet;
    }

    public String getCoin() {
        return coin;
    }


    public void setCoin(String coin) {
        this.coin = coin;
    }

    @Override
    public String toString() {
        return "Wallet{" +
                "numWallet='" + numWallet + '\'' +
                ", amount=" + amount +
                ", user=" + user +
                '}';
    }
}
