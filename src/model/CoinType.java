package model;

/**
 * @author enzo_
 * @version 05/05/2024
 */
/**
 * Se establecen los tipos de divisas que se van a manejar en el proyecto con su respectiva
 * relación de cambio para las demás.
 */
public enum CoinType {
    EURO("Euro", 1, 1.07, 164.57, 4181.47),
    DOLAR("Dolar Estadounidense",0.93,0,153.39 ,3897.50),
    YEN("Yen", 0.0065, 0.0061, 0, 25.42),
    PESO_CO("Peso colombiano", 0.00024,0.00026, 0.039,0 )
    ;

    private String name;
    private double percentajeEuro;
    private double percentajeDolar;
    private double percentajeYen;
    private double percentajePesoCol;

    /**
     * Constructor para el tipo de divisa
     * @param name Corresponde al nombre de la divida
     * @param percentajeEuro Corresponde al valor de conversión de la moneda a Euro
     * @param percentajeDolar Corresponde al valor de conversión de la moneda a Dolar
     * @param percentajeYen Corresponde al valor de conversión de la moneda a Yen
     * @param percentajePesoCol Corresponde al valor de conversión de la moneda a Peso Colombiano
     */
    CoinType(String name, double percentajeEuro, double percentajeDolar, double percentajeYen, double percentajePesoCol) {
        this.name = name;
        this.percentajeEuro = percentajeEuro;
        this.percentajeDolar = percentajeDolar;
        this.percentajeYen = percentajeYen;
        this.percentajePesoCol = percentajePesoCol;
    }

    /**
     * Permite obtener el nombre de la divisa
     * @return nombre de la divisa
     */
    public String getName() {
        return name;
    }

    /**
     * Permite obtener al valor de conversión de la moneda a Euro
     * @return la conversión de la divisa escogida a Euro
     */
    public double getPercentajeEuro() {
        return percentajeEuro;
    }

    /**
     * Permite obtener al valor de conversión de la moneda a Dolar
     * @return la conversión de la divisa escogida a Dolar
     */
    public double getPercentajeDolar() {
        return percentajeDolar;
    }

    /**
     * obtener al valor de conversión de la moneda a Yen
     * @return la conversión de la divisa escogida a Yen
     */
    public double getPercentajeYen() {
        return percentajeYen;
    }

    /**
     * Permite obtener al valor de conversión de la moneda a Peso Colombiano
     * @return la conversión de la divisa escogida a Peso Colombiano
     */
    public double getPercentajePesoCol() {
        return percentajePesoCol;
    }
}
