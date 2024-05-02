package model;

public enum CoinType {
    EURO("Euro"),
    DOLAR("Dolar Estadounidense"),
    YEN("Yen"),
    PESO_CO("Peso colombiano")
    ;

    private String name;
    CoinType(String name) {
        this.name = name;
    }
}
