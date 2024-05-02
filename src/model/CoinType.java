package model;

public enum CoinType {
    EURO("Euro", 0, 1.07, 164.57, 4181.47),
    DOLAR("Dolar Estadounidense",0.93,0,153.39 ,3897.50),
    YEN("Yen", 0.0065, 0.0061, 0, 25.41),
    PESO_CO("Peso colombiano", 0.00024,0.00026, 0.039,0 )
    ;

    private String name;
    private double percentajeEuro;
    private double percentajeDolar;
    private double percentajeYen;
    private double percentajePesoCol;

    CoinType(String name, double percentajeEuro, double percentajeDolar, double percentajeYen, double percentajePesoCol) {
        this.name = name;
        this.percentajeEuro = percentajeEuro;
        this.percentajeDolar = percentajeDolar;
        this.percentajeYen = percentajeYen;
        this.percentajePesoCol = percentajePesoCol;
    }

    public String getName() {
        return name;
    }
}
