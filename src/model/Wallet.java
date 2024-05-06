package model;

/**
 * Corresponde a la información de la cartera
 * @author Estefania Sora
 * @version 05/05/2024
 */
public class Wallet {
    private String id;
    private double amount;
    private User user;

    private String coin;

    /**
     * Se crea la cartera
     * @param amount Corresponde a la cantidad de dinero disponible en la cartera
     * @param user Corresponde a la información del usuario
     * @param coin Corresponde al tipo de moneda que se maneja
     */
    public Wallet(double amount, User user, String coin) {
        this.amount = amount;
        this.user = user;
        this.coin = coin;
        this.id = user.getId();
    }

    /**
     * Permite obtener la cantidad de dinero en la billetera
     * @return double
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Permite modificar actualizar el monto disponible de la billetera
     * @param amount Corresponde al monto al cual se va a actualizar
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * Se obtiene el id de la cartera
     * @return String
     */
    public String getId() {
        return id;
    }

    /**
     * Se obtiene el tipo de moneda o divisa
     * @return String
     */
    public String getCoin() {
        return coin;
    }

    /**
     * Muestra la información de la billetera
     * @return String
     */
    public String showData() {
        return "Información de la cartera: " +'\n' +
                " - Número de la cartera: " + id + '\n' +
                " - Dinero disponible: " + '\n' +
                " - Usuario : " + user.showBasicData() ;
    }
}
