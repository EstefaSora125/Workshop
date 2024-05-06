package model;

/**
 * @author
 * @version 05/05/2024
 * Se crea la billetera por cada usuario
 */
public class Wallet {
    private String id;
    private double amount;
    private User user;

    private String coin;

    /**
     * Constructor
     * @param amount
     * @param user
     * @param coin
     */
    public Wallet(double amount, User user, String coin) {
        this.amount = amount;
        this.user = user;
        this.coin = coin;
        this.id = user.getId();
    }

    /**
     * @return cantidad de dinero en la billetera
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount
     * Se modifica el monto en la billetera
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return el identificador de la billetera
     */
    public String getId() {
        return id;
    }

    /**
     * @return el tipo de moneda o divisa
     */
    public String getCoin() {
        return coin;
    }

    /**
     *
     * @return la información general de la billetera
     */
    public String showData() {
        return "Información de la cartera: " +'\n' +
                " - Número de la cartera: " + id + '\n' +
                " - Dinero disponible: " + '\n' +
                " - Usuario : " + user.showBasicData() ;
    }
}
