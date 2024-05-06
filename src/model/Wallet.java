package model;


public class Wallet {
    private String id;
    private double amount;
    private User user;

    private String coin;

    public Wallet(double amount, User user, String coin) {
        this.amount = amount;
        this.user = user;
        this.coin = coin;
        this.id = user.getId();
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getId() {
        return id;
    }

    public String getCoin() {
        return coin;
    }

    public String showData() {
        return "Información de la cartera: " +'\n' +
                " - Número de la cartera: " + id + '\n' +
                " - Dinero disponible: " + '\n' +
                " - Usuario : " + user.showBasicData() ;
    }
}
